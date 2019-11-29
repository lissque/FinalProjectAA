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

/**
 * Ventana del administrador
 * 
 * @author LISSETTE QUEBRADA LANCHEROS
 * @author LUISA FERNANDA COTTE SÁNCHEZ
 * @author ANDRÉS FELIPE CORTÉS RODRÍGUEZ
 */
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
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 218, 185));
		contentPane.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblId = new JLabel("INGRESAR ID:");
		lblId.setFont(new Font("Gabriola", Font.BOLD, 20));
		lblId.setBounds(79, 107, 125, 19);
		contentPane.add(lblId);

		JLabel lblContrasena = new JLabel("CONTRASE\u00D1A:");
		lblContrasena.setFont(new Font("Gabriola", Font.BOLD, 20));
		lblContrasena.setBounds(79, 164, 125, 19);
		contentPane.add(lblContrasena);

		password = new JPasswordField();
		password.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		password.setFont(new Font("Gabriola", Font.PLAIN, 20));
		password.setBounds(214, 159, 196, 29);
		contentPane.add(password);

		JLabel lblAdministrador = new JLabel("ADMINISTRADOR");
		lblAdministrador.setFont(new Font("Gabriola", Font.BOLD, 30));
		lblAdministrador.setLabelFor(lblAdministrador);
		lblAdministrador.setBounds(45, 43, 286, 36);
		contentPane.add(lblAdministrador);

		btnIngresar = new JButton("INGRESAR");
		btnIngresar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIngresar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnIngresar.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnIngresar.setBounds(242, 247, 105, 29);
		contentPane.add(btnIngresar);
		btnIngresar.addActionListener(this);

		btnVolver = new JButton("VOLVER");
		btnVolver.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVolver.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnVolver.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnVolver.setBounds(371, 247, 105, 29);
		contentPane.add(btnVolver);
		btnVolver.addActionListener(this);

		txtId = new JTextField();
		txtId.setFont(new Font("Gabriola", Font.PLAIN, 20));
		txtId.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtId.setBounds(214, 102, 196, 29);
		contentPane.add(txtId);
		txtId.setColumns(10);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String id = txtId.getText();
		String pass = password.getText();

		if (e.getSource() == btnIngresar) {

			/**
			 * Permite el ingreso del administrador
			 */
			if (home.getMiEvento().getAdmin().getId().equals(id)
					&& home.getMiEvento().getAdmin().getContraseña().equals(pass)) {

				this.dispose();
				Estadisticas estadisticas = new Estadisticas(home);
				estadisticas.setLocationRelativeTo(null);
				estadisticas.setVisible(true);

			} else {
				JOptionPane.showMessageDialog(null, "ID O CONTRASEÑA INCORRECTA, INTÉNTELO DE NUEVO.", "ADVERTENCIA!",
						JOptionPane.WARNING_MESSAGE, null);
			}
		}

		if (e.getSource() == btnVolver) {
			this.dispose();
			home.setVisible(true);
			home.setLocationRelativeTo(null);
		}
	}
}
