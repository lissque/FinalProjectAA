package co.uniquindio.interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.LineBorder;

import co.uniquindio.mundo.Escenario;

import java.awt.Color;
import java.awt.Cursor;

public class Secciones extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnM1;
	private JButton btnM4;
	private JButton btnM2;
	private JButton btnM5;
	private JButton btnM3;
	private JButton btnVolver;
	private Ingresar anterior;

	/**
	 * Create the frame.
	 */
	public Secciones(Ingresar anterior) {

		setUndecorated(true);
		setResizable(false);

		this.anterior = anterior;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 409, 200);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(64, 64, 64), 5, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnM1 = new JButton("Platea");
		btnM1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		btnM1.setBounds(20, 31, 89, 61);
		contentPane.add(btnM1);
		btnM1.addActionListener(this);

		btnM2 = new JButton("Club Fans");
		btnM2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		btnM2.setBounds(145, 90, 97, 88);
		btnM2.addActionListener(this);
		contentPane.add(btnM2);

		btnM3 = new JButton("Platea");
		btnM3.setFont(new Font("Tahoma", Font.ITALIC, 11));
		btnM3.setBounds(278, 31, 89, 61);
		btnM3.addActionListener(this);
		contentPane.add(btnM3);

		btnM4 = new JButton("Segundo Piso");
		btnM4.setFont(new Font("Tahoma", Font.ITALIC, 11));
		btnM4.setBounds(20, 103, 115, 61);
		btnM4.addActionListener(this);
		contentPane.add(btnM4);

		btnM5 = new JButton("Segundo Piso");
		btnM5.setFont(new Font("Tahoma", Font.ITALIC, 11));
		btnM5.setBounds(252, 103, 115, 61);
		btnM5.addActionListener(this);
		contentPane.add(btnM5);

		btnVolver = new JButton("\u2190");
		btnVolver.addActionListener(this);
		btnVolver.setBounds(346, 166, 53, 23);
		contentPane.add(btnVolver);

		JLabel lblTarima = new JLabel("TARIMA");
		lblTarima.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		lblTarima.setBackground(Color.WHITE);
		lblTarima.setHorizontalAlignment(SwingConstants.CENTER);
		lblTarima.setBorder(new LineBorder(Color.GRAY, 3, true));
		lblTarima.setFont(new Font("NSimSun", Font.BOLD, 25));
		lblTarima.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTarima.setBounds(119, 11, 149, 52);
		contentPane.add(lblTarima);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnM1) {

			//this.dispose();
			Platea1 m1 = new Platea1(anterior.getHome().getMiEscenario());
			m1.setVisible(true);

		}
		if (e.getSource() == btnM2) {

			// this.dispose();
			ClubFans m2 = new ClubFans(anterior.getHome().getMiEscenario());
			m2.setVisible(true);

		}
		if (e.getSource() == btnM3) {

			// this.dispose();
			Platea2 m3 = new Platea2(anterior.getHome().getMiEscenario());
			m3.setVisible(true);

		}
		if (e.getSource() == btnM4) {

			// this.dispose();
			Segundo1 m4 = new Segundo1(anterior.getHome().getMiEscenario());
			m4.setVisible(true);

		}
		if (e.getSource() == btnM5) {

			// this.dispose();
			Segundo2 m5 = new Segundo2(anterior.getHome().getMiEscenario());
			m5.setVisible(true);

		}
		if (e.getSource() == btnVolver) {
			this.dispose();
			anterior.setVisible(true);
		}
	}
}
