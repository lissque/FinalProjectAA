package co.uniquindio.interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import co.uniquindio.mundo.Cliente;
import co.uniquindio.mundo.Fecha;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Inscripcion extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtId;
	private JTextField txtDireccion;
	private JTextField txtDia;
	private JTextField txtMes;
	private JTextField txtAnio;
	private JTextField txtMail;
	private JButton btnAgregar;
	private JButton btnCancelar;
	private Home home;
	private JComboBox cbEstrato;

	/**
	 * Create the frame.
	 */
	public Inscripcion(Home home) {

		this.home = home;
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(20, 23, 46, 14);
		contentPane.add(lblNombre);

		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(20, 54, 46, 14);
		contentPane.add(lblApellido);

		JLabel lblId = new JLabel("Id:");
		lblId.setBounds(20, 85, 46, 14);
		contentPane.add(lblId);

		JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
		lblDireccin.setBounds(20, 110, 61, 14);
		contentPane.add(lblDireccin);

		JLabel lblFechaNacimiento = new JLabel("Fecha nacimiento:");
		lblFechaNacimiento.setBounds(20, 142, 112, 14);
		contentPane.add(lblFechaNacimiento);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(20, 176, 46, 14);
		contentPane.add(lblEmail);

		JLabel lblEstrato = new JLabel("Estrato:");
		lblEstrato.setBounds(20, 211, 46, 14);
		contentPane.add(lblEstrato);

		JLabel lblNivelEstudio = new JLabel("Nivel Estudio:");
		lblNivelEstudio.setBounds(20, 248, 84, 14);
		contentPane.add(lblNivelEstudio);

		JLabel lblEstadoCivil = new JLabel("Estado Civil:");
		lblEstadoCivil.setBounds(20, 283, 84, 14);
		contentPane.add(lblEstadoCivil);

		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setBounds(20, 322, 46, 14);
		contentPane.add(lblGenero);

		txtNombre = new JTextField();
		txtNombre.setBounds(161, 20, 137, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		txtApellido = new JTextField();
		txtApellido.setText("");
		txtApellido.setBounds(161, 51, 137, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);

		txtId = new JTextField();
		txtId.setBounds(161, 82, 137, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);

		txtDireccion = new JTextField();
		txtDireccion.setBounds(161, 107, 137, 20);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);

		txtDia = new JTextField();
		txtDia.setBounds(161, 139, 46, 20);
		contentPane.add(txtDia);
		txtDia.setColumns(10);

		txtMes = new JTextField();
		txtMes.setText("");
		txtMes.setBounds(217, 139, 46, 20);
		contentPane.add(txtMes);
		txtMes.setColumns(10);

		txtAnio = new JTextField();
		txtAnio.setBounds(273, 139, 46, 20);
		contentPane.add(txtAnio);
		txtAnio.setColumns(10);

		txtMail = new JTextField();
		txtMail.setBounds(161, 173, 137, 20);
		contentPane.add(txtMail);
		txtMail.setColumns(10);

		btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(323, 432, 89, 23);
		btnCancelar.addActionListener(this);
		contentPane.add(btnCancelar);

		btnAgregar = new JButton("AGERGAR");
		btnAgregar.setActionCommand("AGREGAR");
		btnAgregar.addActionListener(this);
		btnAgregar.setBounds(209, 432, 89, 23);
		contentPane.add(btnAgregar);

		cbEstrato = new JComboBox();
		cbEstrato.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3" }));
		cbEstrato.setBounds(161, 208, 137, 20);
		contentPane.add(cbEstrato);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnCancelar) {

			this.dispose();
			home.setLocationRelativeTo(null);
			home.setVisible(true);
		}

		if (e.getSource() == btnAgregar) {

			String nombre = txtNombre.getText();
			String apellido = txtApellido.getText();
			String id = txtId.getText();
			String direccion = txtDireccion.getText();
			int diaN = Integer.parseInt(txtDia.getText());
			int mesN = Integer.parseInt(txtMes.getText());
			int anioN = Integer.parseInt(txtAnio.getText());
			Fecha fechaNacimiento = new Fecha(anioN, mesN, diaN);
			String email = txtMail.getText();
			// int estrato = Integer.parseInt(mnEstrato.getText());
			// String nivelEstudio = mnNivelEstudio.getText();
			// String estadoCivil = mnEstadoCivil.getText();
			// String genero = mnGenero.getText();
			// String gene = estrato.getSelectedItem();

			try {
				int estrato = Integer.parseInt(cbEstrato.getSelectedItem().toString());
				Cliente miCliente = new Cliente(id, nombre, apellido, direccion, email, fechaNacimiento, estrato, null, null, null, null);
				home.agregarClientes(miCliente);

				
			} catch (Exception err) {
				err.printStackTrace();
			}

			this.setVisible(false);
			home.setVisible(true);

		}
	}
}
