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
		this.home=home;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 407, 211);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("Ingresar ID:");
		lblId.setBounds(64, 72, 92, 19);
		contentPane.add(lblId);
		
		JLabel lblContrasena = new JLabel("Contrase\u00F1a: ");
		lblContrasena.setBounds(64, 113, 92, 19);
		contentPane.add(lblContrasena);
		
		password = new JPasswordField();
		password.setBounds(214, 112, 133, 20);
		contentPane.add(password);
		
		JLabel lblAdministrador = new JLabel("ADMINISTRADOR");
		lblAdministrador.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAdministrador.setLabelFor(lblAdministrador);
		lblAdministrador.setBounds(117, 25, 178, 36);
		contentPane.add(lblAdministrador);
		
		btnIngresar = new JButton("INGRESAR");
		btnIngresar.setBounds(238, 155, 89, 23);
		contentPane.add(btnIngresar);
		btnIngresar.addActionListener(this);
		
		btnVolver = new JButton("VOLVER");
		btnVolver.setBounds(85, 155, 89, 23);
		contentPane.add(btnVolver);
		btnVolver.addActionListener(this);
		
		txtId = new JTextField();
		txtId.setBounds(214, 71, 133, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnIngresar) {
			String id = txtId.getText();
			String pass = password.getText();
			
			for (Administrador usuario : home.getMiEvento().getMisUsuarios()) {
				if (usuario.getId().equals(id)) {
					if (usuario.getContraseña().equals(pass)) {
						JOptionPane.showConfirmDialog(null, "Existe!");
					}
				}
				else
					System.out.println("No existes :(");
			}
		}
		
		if (e.getSource()==btnVolver) {
			this.dispose();
			home.setVisible(true);
		}
	}
}
