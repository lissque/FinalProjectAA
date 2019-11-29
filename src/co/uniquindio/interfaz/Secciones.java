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

import co.uniquindio.mundo.Cliente;
import co.uniquindio.mundo.Escenario;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class Secciones extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnM1;
	private JButton btnM4;
	private JButton btnM2;
	private JButton btnM5;
	private JButton btnM3;
	private JButton btnVolver;
	private Ingresar anterior;
	private Cliente cliente;
	private Home home;

	/**
	 * Create the frame.
	 */
	public Secciones(Ingresar anterior, Home home, Cliente cliente) {

		setUndecorated(true);
		setResizable(false);

		this.cliente = cliente;
		this.anterior = anterior;
		this.home = home;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 218, 185));
		contentPane.setBorder(new LineBorder(new Color(64, 64, 64), 5, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnM1 = new JButton("PLATEA");
		btnM1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnM1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnM1.setFont(new Font("Gabriola", Font.BOLD, 25));
		btnM1.setBounds(24, 108, 128, 124);
		contentPane.add(btnM1);
		btnM1.addActionListener(this);

		btnM2 = new JButton("CLUB DE FANS");
		btnM2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnM2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnM2.setFont(new Font("Gabriola", Font.BOLD, 25));
		btnM2.setBounds(169, 141, 165, 103);
		btnM2.addActionListener(this);
		contentPane.add(btnM2);

		btnM3 = new JButton("PLATEA");
		btnM3.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnM3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnM3.setFont(new Font("Gabriola", Font.BOLD, 25));
		btnM3.setBounds(349, 108, 128, 124);
		btnM3.addActionListener(this);
		contentPane.add(btnM3);

		btnM4 = new JButton("SEGUNDO PISO");
		btnM4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnM4.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnM4.setFont(new Font("Gabriola", Font.BOLD, 23));
		btnM4.setBounds(93, 255, 149, 82);
		btnM4.addActionListener(this);
		contentPane.add(btnM4);

		btnM5 = new JButton("SEGUNDO PISO");
		btnM5.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnM5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnM5.setFont(new Font("Gabriola", Font.BOLD, 23));
		btnM5.setBounds(266, 255, 149, 82);
		btnM5.addActionListener(this);
		contentPane.add(btnM5);

		btnVolver = new JButton("\u21A9");
		btnVolver.setFont(new Font("Arial Unicode MS", Font.BOLD, 25));
		btnVolver.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnVolver.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVolver.addActionListener(this);
		btnVolver.setBounds(202, 348, 97, 29);
		contentPane.add(btnVolver);

		JLabel lblTarima = new JLabel("TARIMA");
		lblTarima.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		lblTarima.setBackground(new Color(233, 150, 122));
		lblTarima.setHorizontalAlignment(SwingConstants.CENTER);
		lblTarima.setBorder(new LineBorder(Color.GRAY, 3, true));
		lblTarima.setFont(new Font("Gabriola", Font.BOLD, 35));
		lblTarima.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTarima.setBounds(169, 27, 165, 103);
		contentPane.add(lblTarima);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnM1) {

			this.setVisible(false);
			Platea1 m1 = new Platea1(anterior.getHome().getMiEscenario(), home, cliente);
			m1.setVisible(true);
			m1.setLocationRelativeTo(null);

		}
		if (e.getSource() == btnM2) {

			this.setVisible(false);
			ClubFans m2 = new ClubFans(anterior.getHome().getMiEscenario(), home, cliente);
			m2.setVisible(true);
			m2.setLocationRelativeTo(null);

		}
		if (e.getSource() == btnM3) {

			this.setVisible(false);
			Platea2 m3 = new Platea2(anterior.getHome().getMiEscenario(), home, cliente);
			m3.setVisible(true);
			m3.setLocationRelativeTo(null);

		}
		if (e.getSource() == btnM4) {

			this.setVisible(false);
			Segundo1 m4 = new Segundo1(anterior.getHome().getMiEscenario(), home, cliente);
			m4.setVisible(true);
			m4.setLocationRelativeTo(null);

		}
		if (e.getSource() == btnM5) {

			this.setVisible(false);
			Segundo2 m5 = new Segundo2(anterior.getHome().getMiEscenario(), home, cliente);
			m5.setVisible(true);
			m5.setLocationRelativeTo(null);

		}
		if (e.getSource() == btnVolver) {
			this.dispose();
			anterior.setVisible(true);
			anterior.setLocationRelativeTo(null);
		}
	}
}
