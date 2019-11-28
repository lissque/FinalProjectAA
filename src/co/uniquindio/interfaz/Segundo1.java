package co.uniquindio.interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import co.uniquindio.mundo.Escenario;
import co.uniquindio.mundo.EstadoPuesto;
import co.uniquindio.mundo.Puesto;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Segundo1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnVolver;	
	private JButton[][] matriz;
	private JButton btnComprar;
	private JPanel panel;
	
	private Puesto[][] puestos;
	private Escenario escenario;

	/**
	 * Create the frame.
	 */
	public Segundo1(Escenario escenario) {

		setUndecorated(true);
		setResizable(false);

		matriz = new JButton[5][5];
		this.escenario = escenario;
		puestos = escenario.getSecciones().get(1).getPuestos();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 403, 336);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				JButton newBtn = new JButton();

				newBtn.setSize(53, 23);			
				matriz[i][j] = newBtn;
				matriz[i][j].addActionListener(this);
			}
		}
	
		btnVolver = new JButton("\u21A7");
		btnVolver.setBounds(342, 11, 48, 23);
		btnVolver.addActionListener(this);
		contentPane.add(btnVolver);
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
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
		// TODO Auto-generated method stub
		for (int i = 0; i < puestos.length; i++) {
			for (int j = 0; j < puestos.length; j++) {
				if (puestos[i][j].getEstado().equals(EstadoPuesto.OCUPADO)) {
					matriz[i][j].setEnabled(false);
				}
			}
		}
		
	}

	private void crearPuestos() {
		// TODO Auto-generated method stub
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {

				JButton newBtn = new JButton();

				newBtn.setBounds(i + 10, j + 10, 50, 50);
				// newBtn.setToolTipText(Integer.toString(i) + "," + Integer.toString(j));
				matriz[i][j] = newBtn;
				matriz[i][j].addActionListener(this);
				panel.add(matriz[i][j]);
				dibujar();

				if (i > j) {
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
		// TODO Auto-generated method stub

		if (e.getSource() == btnVolver) {
			this.dispose();
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (e.getSource() == matriz[i][j]) {
					matriz[i][j].setBackground(Color.GREEN);
					escenario.agregarPuesto(puestos[i][j]);
				}
			}
		}
	}
}
