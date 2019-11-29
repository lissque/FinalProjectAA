package co.uniquindio.interfaz;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;

import co.uniquindio.mundo.Cliente;
import co.uniquindio.mundo.Escenario;
import co.uniquindio.mundo.EstadoPuesto;
import co.uniquindio.mundo.Puesto;
import co.uniquindio.mundo.Registro;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class Segundo2 extends JFrame implements ActionListener {

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
	public Segundo2(Escenario escenario, Home home, Cliente cliente) {

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
		contentPane.setBackground(new Color(255, 218, 185));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnVolver = new JButton("\u21A7");
		btnVolver.setBounds(342, 11, 48, 23);
		btnVolver.addActionListener(this);
		contentPane.add(btnVolver);

		panel = new JPanel();
		panel.setBackground(new Color(255, 218, 185));
		panel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(10, 45, 380, 253);
		panel.setLayout(new GridLayout(5, 5));
		contentPane.add(panel);

		btnComprar = new JButton("Comprar");
		btnComprar.setBounds(152, 302, 89, 23);
		btnComprar.addActionListener(this);
		contentPane.add(btnComprar);

		crearPuestos();
		actualizar();

	}

	private void actualizar() {
		for (int i = 0; i < puestos.length; i++) {
			for (int j = 0; j < puestos.length; j++) {
				if (puestos[i][j].getEstado().equals(EstadoPuesto.OCUPADO)) {
					matriz[i][j].setEnabled(false);
				}
			}
		}

	}

	private void crearPuestos() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {

				String codigo = escenario.getSecciones().get(3).codigoSeccion();

				JButton newBtn = new JButton(codigo + " " + i + "-" + j);
				newBtn.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
				newBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

				newBtn.setSize(53, 23);
				matriz[i][j] = newBtn;
				matriz[i][j].addActionListener(this);
				panel.add(matriz[i][j]);
				dibujar();

				if (i + j > matriz.length - 1) {
					matriz[i][j].setVisible(false);
				}
			}
		}
	}

	private void dibujar() {

		panel.validate();
		panel.repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnVolver) {
			this.setVisible(false);
			Secciones seccion = new Secciones(new Ingresar(home), home, cliente);
			seccion.setVisible(true);
			seccion.setLocationRelativeTo(null);
		}

		if (e.getSource() == btnComprar) {

			Registro registro = new Registro(cliente, puestoSelec);

			if (puestoSelec.isEmpty()) {

				JOptionPane.showMessageDialog(null, "NO HA SELECCIONADO NINGÚN PUESTO", "INFORMACIÓN",
						JOptionPane.INFORMATION_MESSAGE, null);

			} else {

				JOptionPane.showMessageDialog(null, "COMPRA EXITOSA", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE,
						null);

				this.setVisible(false);
				Encuesta encuesta = new Encuesta(home, cliente);

				encuesta.setVisible(true);
				encuesta.setLocationRelativeTo(null);
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (e.getSource() == matriz[i][j]) {
					matriz[i][j].setBackground(Color.GREEN);
					puestoSelec.add(puestos[i][j]);
				}
			}
		}
	}
}