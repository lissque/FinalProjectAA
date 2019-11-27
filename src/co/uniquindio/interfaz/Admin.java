package co.uniquindio.interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import co.uniquindio.mundo.Administrador;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;

public class Admin extends JFrame implements ActionListener {

	private JPanel contentPane;
	private Home home;
	private JPasswordField password;
	private JButton btnIngresar;
	private JButton btnVolver;
	private JTextField txtId;

	/**
	 * Create the frame.
	 */
	public Admin(Home home) {

		setUndecorated(true);
		setResizable(false);
		setLocationRelativeTo(null);
		this.home = home;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 407, 211);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblId = new JLabel("INGRESAR ID:");
		lblId.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		lblId.setBounds(64, 72, 92, 19);
		contentPane.add(lblId);

		JLabel lblContrasena = new JLabel("CONTRASE\u00D1A:");
		lblContrasena.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		lblContrasena.setBounds(64, 113, 92, 19);
		contentPane.add(lblContrasena);

		password = new JPasswordField();
		password.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		password.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		password.setBounds(214, 112, 133, 20);
		contentPane.add(password);

		JLabel lblAdministrador = new JLabel("ADMINISTRADOR");
		lblAdministrador.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblAdministrador.setLabelFor(lblAdministrador);
		lblAdministrador.setBounds(30, 22, 248, 36);
		contentPane.add(lblAdministrador);

		btnIngresar = new JButton("INGRESAR");
		btnIngresar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIngresar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnIngresar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		btnIngresar.setBounds(189, 166, 89, 23);
		contentPane.add(btnIngresar);
		btnIngresar.addActionListener(this);

		btnVolver = new JButton("VOLVER");
		btnVolver.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVolver.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		btnVolver.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnVolver.setBounds(308, 166, 89, 23);
		contentPane.add(btnVolver);
		btnVolver.addActionListener(this);

		txtId = new JTextField();
		txtId.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		txtId.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtId.setBounds(214, 71, 133, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String id = txtId.getText();
		String pass = password.getText();

		if (e.getSource() == btnIngresar) {

			if (home.getMiEvento().getAdmin().getId().equals(id)
					&& home.getMiEvento().getAdmin().getContraseña().equals(pass)) {

				this.dispose();

			} else {

				JOptionPane.showMessageDialog(null, "ID O CONTRASEÑA INCORRECTA, INTÉNTELO DE NUEVO.", "ADVERTENCIA!",
						JOptionPane.WARNING_MESSAGE, null);
			}

		}

		if (e.getSource() == btnVolver) {
			this.dispose();
			home.setVisible(true);
		}
	}
}
