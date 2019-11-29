package co.uniquindio.interfaz;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import co.uniquindio.mundo.*;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

/**
 * Ventana de la matriz del club de fans
 * 
 * @author LISSETTE QUEBRADA LANCHEROS
 * @author LUISA FERNANDA COTTE SÁNCHEZ
 * @author ANDRÉS FELIPE CORTÉS RODRÍGUEZ
 */
public class ClubFans extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnVolver;
	private JButton[][] matriz;
	private JButton btnComprar;
	private JPanel panel;

	private Puesto[][] puestos;
	private Escenario escenario;
	private Home home;
	private Cliente cliente;
	private ArrayList<Puesto> puestoSelec = new ArrayList<>();

	/**
	 * Create the frame.
	 */
	public ClubFans(Escenario escenario, Home home, Cliente cliente) {

		this.home = home;
		this.cliente = cliente;
		setUndecorated(true);
		setResizable(false);

		matriz = new JButton[5][5];
		this.escenario = escenario;
		puestos = escenario.getSecciones().get(2).getPuestos();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 403, 336);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 218, 185));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnVolver = new JButton("VOLVER");
		btnVolver.setFont(new Font("Gabriola", Font.BOLD, 15));
		btnVolver.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVolver.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnVolver.setBounds(294, 11, 96, 23);
		btnVolver.addActionListener(this);
		contentPane.add(btnVolver);

		panel = new JPanel();
		panel.setForeground(new Color(255, 218, 185));
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 45, 380, 253);
		panel.setLayout(new GridLayout(5, 5));
		contentPane.add(panel);

		btnComprar = new JButton("COMPRAR");
		btnComprar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnComprar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnComprar.setFont(new Font("Gabriola", Font.BOLD, 18));
		btnComprar.setBounds(130, 302, 136, 23);
		btnComprar.addActionListener(this);
		contentPane.add(btnComprar);

		crearPuestos();
		actualizar();

	}

	/**
	 * Metodo que actualiza el estado del puesto
	 */
	private void actualizar() {

		for (int i = 0; i < puestos.length; i++) {
			for (int j = 0; j < puestos.length; j++) {
				if (puestos[i][j].getEstado().equals(EstadoPuesto.OCUPADO)) {
					matriz[i][j].setEnabled(false);
				}
			}
		}

	}

	/**
	 * Metodo que crea la matriz de puestos
	 */
	private void crearPuestos() {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {

				String codigo = escenario.getSecciones().get(2).codigoSeccion();

				JButton newBtn = new JButton(codigo + " " + i + "-" + j);

				newBtn.setSize(53, 23);
				matriz[i][j] = newBtn;
				matriz[i][j].addActionListener(this);
				panel.add(matriz[i][j]);
				dibujar();
			}
		}
	}

	/**
	 * Metodo que vuelve a pintar la matriz
	 */
	private void dibujar() {

		panel.validate();
		panel.repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnVolver) {
			this.setVisible(false);
		}

		if (e.getSource() == btnComprar) {

			Registro registro = new Registro(cliente, puestoSelec);

			if (puestoSelec.isEmpty()) {

				JOptionPane.showMessageDialog(null, "NO HA SELECCIONADO NINGÚN PUESTO", "INFORMACIÓN",
						JOptionPane.INFORMATION_MESSAGE, null);

			} else {

				JOptionPane.showMessageDialog(null,
						"COMPRA EXITOSA, SALDO DE TARJETA",
						"INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE, null);

				this.setVisible(false);
				Encuesta encuesta = new Encuesta(home, cliente);
	
				encuesta.setVisible(true);
				encuesta.setLocationRelativeTo(null);
			}
		}

		for (

				int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (e.getSource() == matriz[i][j]) {
					matriz[i][j].setBackground(Color.GREEN);
					puestoSelec.add(puestos[i][j]);
				}
			}
		}

	}
}