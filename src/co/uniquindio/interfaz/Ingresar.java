package co.uniquindio.interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.accessibility.Accessible;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.DebugGraphics;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;

public class Ingresar extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnAcceder;
	private JButton btnVolver;

	private Home home;

	/**
	 * Create the frame.
	 */
	public Ingresar(Home home) {

		this.home = home;

		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 149);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblIngresarId = new JLabel("INGRESAR ID:");
		lblIngresarId.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		lblIngresarId.setBounds(32, 35, 97, 14);
		contentPane.add(lblIngresarId);

		textField = new JTextField();
		textField.setToolTipText("HOLA");
		textField.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		textField.setBounds(139, 32, 243, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		btnAcceder = new JButton("\u221A");
		btnAcceder.addActionListener(this);
		btnAcceder.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAcceder.setBackground(Color.GREEN);
		btnAcceder.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnAcceder.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnAcceder.setBounds(392, 31, 35, 23);
		contentPane.add(btnAcceder);

		btnVolver = new JButton("VOLVER");
		btnVolver.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVolver.addActionListener(this);
		btnVolver.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		btnVolver.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnVolver.setBounds(443, 80, 112, 31);
		contentPane.add(btnVolver);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnVolver) {

			this.dispose();
			home.setLocationRelativeTo(null);
			home.setVisible(true);
		}

	}
}
