package co.uniquindio.interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import co.uniquindio.mundo.Cliente;
import co.uniquindio.mundo.Fecha;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import javax.swing.border.TitledBorder;
import co.uniquindio.mundo.NivelEstudio;
import co.uniquindio.mundo.Respuesta;
import co.uniquindio.mundo.Tarjeta;
import co.uniquindio.mundo.EstadoCivil;
import co.uniquindio.mundo.Genero;

public class Inscripcion extends JFrame implements ActionListener {

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
	private JButton btnVolver;
	private Home home;
	private JComboBox cbEstrato;
	private JComboBox cbNivelEstudio;
	private JComboBox cbEstadoCivil;
	private JComboBox cbGenero;
	private JLabel lblRegistrarse;

	/**
	 * Create the frame.
	 */
	public Inscripcion(Home home) {

		this.home = home;

		setBackground(Color.LIGHT_GRAY);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 482);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNombre = new JLabel("NOMBRE:");
		lblNombre.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		lblNombre.setBounds(20, 109, 112, 14);
		contentPane.add(lblNombre);

		JLabel lblApellido = new JLabel("APELLIDO:");
		lblApellido.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		lblApellido.setBounds(20, 134, 112, 14);
		contentPane.add(lblApellido);

		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		lblId.setBounds(20, 159, 112, 14);
		contentPane.add(lblId);

		JLabel lblDireccin = new JLabel("DIRECCI\u00D3N:");
		lblDireccin.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		lblDireccin.setBounds(20, 184, 112, 14);
		contentPane.add(lblDireccin);

		JLabel lblFechaNacimiento = new JLabel("FECHA NACIMIENTO:");
		lblFechaNacimiento.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		lblFechaNacimiento.setBounds(20, 209, 131, 14);
		contentPane.add(lblFechaNacimiento);

		JLabel lblEmail = new JLabel("E-MAIL:");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		lblEmail.setBounds(20, 234, 112, 14);
		contentPane.add(lblEmail);

		JLabel lblEstrato = new JLabel("ESTRATO:");
		lblEstrato.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		lblEstrato.setBounds(20, 259, 112, 14);
		contentPane.add(lblEstrato);

		JLabel lblNivelEstudio = new JLabel("NIVEL ESTUDIO:");
		lblNivelEstudio.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		lblNivelEstudio.setBounds(20, 284, 112, 14);
		contentPane.add(lblNivelEstudio);

		JLabel lblEstadoCivil = new JLabel("ESTADO CIVIL:");
		lblEstadoCivil.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		lblEstadoCivil.setBounds(20, 309, 118, 14);
		contentPane.add(lblEstadoCivil);

		JLabel lblGenero = new JLabel("GENERO:");
		lblGenero.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		lblGenero.setBounds(20, 334, 112, 14);
		contentPane.add(lblGenero);

		txtNombre = new JTextField();
		txtNombre.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtNombre.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		txtNombre.setBounds(161, 103, 137, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		txtApellido = new JTextField();
		txtApellido.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtApellido.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		txtApellido.setText("");
		txtApellido.setBounds(161, 132, 137, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);

		txtId = new JTextField();
		txtId.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtId.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		txtId.setBounds(161, 157, 137, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);

		txtDireccion = new JTextField();
		txtDireccion.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtDireccion.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		txtDireccion.setBounds(161, 182, 137, 20);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);

		txtDia = new JTextField();
		txtDia.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtDia.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		txtDia.setBounds(161, 207, 46, 20);
		contentPane.add(txtDia);
		txtDia.setColumns(10);

		txtMes = new JTextField();
		txtMes.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtMes.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		txtMes.setText("");
		txtMes.setBounds(217, 207, 46, 20);
		contentPane.add(txtMes);
		txtMes.setColumns(10);

		txtAnio = new JTextField();
		txtAnio.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtAnio.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		txtAnio.setBounds(273, 207, 46, 20);
		contentPane.add(txtAnio);
		txtAnio.setColumns(10);

		txtMail = new JTextField();
		txtMail.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtMail.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		txtMail.setBounds(161, 232, 137, 20);
		contentPane.add(txtMail);
		txtMail.setColumns(10);

		btnVolver = new JButton("VOLVER");
		btnVolver.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		btnVolver.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVolver.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnVolver.setBounds(308, 393, 112, 31);
		btnVolver.addActionListener(this);
		contentPane.add(btnVolver);

		btnAgregar = new JButton("AGERGAR");
		btnAgregar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAgregar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnAgregar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		btnAgregar.setActionCommand("AGREGAR");
		btnAgregar.addActionListener(this);
		btnAgregar.setBounds(180, 393, 118, 31);
		contentPane.add(btnAgregar);

		cbEstrato = new JComboBox();
		cbEstrato.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cbEstrato.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		cbEstrato.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		cbEstrato.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3" }));
		cbEstrato.setBounds(161, 257, 137, 20);
		contentPane.add(cbEstrato);

		cbNivelEstudio = new JComboBox();
		cbNivelEstudio.setModel(new DefaultComboBoxModel(NivelEstudio.values()));
		cbNivelEstudio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cbNivelEstudio.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		cbNivelEstudio.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		cbNivelEstudio.setBounds(161, 282, 137, 20);
		contentPane.add(cbNivelEstudio);

		cbEstadoCivil = new JComboBox();
		cbEstadoCivil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cbEstadoCivil.setModel(new DefaultComboBoxModel(EstadoCivil.values()));
		cbEstadoCivil.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		cbEstadoCivil.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		cbEstadoCivil.setBounds(161, 307, 137, 20);
		contentPane.add(cbEstadoCivil);

		cbGenero = new JComboBox();
		cbGenero.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cbGenero.setModel(new DefaultComboBoxModel(Genero.values()));
		cbGenero.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		cbGenero.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		cbGenero.setBounds(161, 332, 137, 20);
		contentPane.add(cbGenero);

		lblRegistrarse = new JLabel("REGISTRARSE");
		lblRegistrarse.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblRegistrarse.setBounds(30, 30, 257, 20);
		contentPane.add(lblRegistrarse);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnVolver) {

			this.dispose();
			home.setLocationRelativeTo(null);
			home.setVisible(true);
		}

		if (e.getSource() == btnAgregar) {

			if (txtId == null || txtNombre == null || txtApellido == null || txtDireccion == null || txtMail == null
					|| txtDia == null || txtMes == null || txtAnio == null) {

				JOptionPane.showMessageDialog(null, "RELLENE TODOS LOS CAMPOS", "ADVERTENCIA!",
						JOptionPane.WARNING_MESSAGE, null);

			} else {

				String nombre = txtNombre.getText();
				String apellido = txtApellido.getText();
				String id = txtId.getText();
				String direccion = txtDireccion.getText();
				String diaN = txtDia.getText();
				String mesN = txtMes.getText();
				String anioN = txtAnio.getText();
				String email = txtMail.getText();

				int estrato = Integer.parseInt(cbEstrato.getSelectedItem().toString());
				NivelEstudio nivelEstudio = (NivelEstudio) cbNivelEstudio.getSelectedItem();
				EstadoCivil estadoCivil = (EstadoCivil) cbEstadoCivil.getSelectedItem();
				Genero genero = (Genero) cbGenero.getSelectedItem();

				Cliente miCliente = new Cliente(id, nombre, apellido, direccion, email, diaN, mesN, anioN, estrato,
						nivelEstudio, estadoCivil, genero, null);

				System.err.println(miCliente.getApellido());
				home.agregarClientes(miCliente);

				JOptionPane.showMessageDialog(null,
						"EL CLIENTE: " + miCliente.getNombre().toUpperCase() + ", FUE AGREGADO", "INFORMACIÓN",
						JOptionPane.INFORMATION_MESSAGE, null);

				this.setVisible(false);
				home.setVisible(true);
				home.setLocationRelativeTo(null);

			}
		}
	}
}
