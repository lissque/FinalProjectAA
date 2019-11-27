package co.uniquindio.interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.uniquindio.mundo.Escenario;
import co.uniquindio.mundo.EstadoPuesto;
import co.uniquindio.mundo.Puesto;
import co.uniquindio.mundo.Seccion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Platea1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private Secciones inicio;
	private JButton btnVolver;
	private Escenario escenario;
	private JButton[][] matriz;

	/**
	 * Create the frame.
	 */
	public Platea1(Escenario escenario) {

		setUndecorated(true);
		setResizable(false);

		matriz = new JButton[5][5];

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 321, 185);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				JButton newBtn = new JButton();

				newBtn.setSize(53, 23);				
				//newBtn.setToolTipText(Integer.toString(i) + "," + Integer.toString(j));			
				matriz[i][j] = newBtn;
				matriz[i][j].addActionListener(this);
			}
		}
	
		btnVolver = new JButton("\u21A7");
		btnVolver.setBounds(260, 11, 48, 23);
		btnVolver.addActionListener(this);
		contentPane.add(btnVolver);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == btnVolver) {
			this.dispose();
		}

	}
}
