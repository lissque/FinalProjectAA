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
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import javax.swing.border.TitledBorder;
import co.uniquindio.mundo.NivelEstudio;
import co.uniquindio.mundo.EstadoCivil;
import co.uniquindio.mundo.Genero;

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
	private JButton btnVolver;
	private Home home;
	private JComboBox cbEstrato;
	private JComboBox cbNivelEstudio;
	private JComboBox cbEstadoCivil;
	private JComboBox cbGenero;

	/**
	 * Create the frame.
	 */
	public Inscripcion(Home home) {
		setBackground(Color.LIGHT_GRAY);

		this.home = home;
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 413);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNombre = new JLabel("NOMBRE:");
		lblNombre.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		lblNombre.setBounds(20, 23, 112, 14);
		contentPane.add(lblNombre);

		JLabel lblApellido = new JLabel("APELLIDO:");
		lblApellido.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		lblApellido.setBounds(20, 54, 112, 14);
		contentPane.add(lblApellido);

		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		lblId.setBounds(20, 85, 112, 14);
		contentPane.add(lblId);

		JLabel lblDireccin = new JLabel("DIRECCI\u00D3N:");
		lblDireccin.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		lblDireccin.setBounds(20, 110, 112, 14);
		contentPane.add(lblDireccin);

		JLabel lblFechaNacimiento = new JLabel("FECHA NACIMIENTO:");
		lblFechaNacimiento.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		lblFechaNacimiento.setBounds(20, 142, 131, 14);
		contentPane.add(lblFechaNacimiento);

		JLabel lblEmail = new JLabel("E-MAIL:");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		lblEmail.setBounds(20, 176, 112, 14);
		contentPane.add(lblEmail);

		JLabel lblEstrato = new JLabel("ESTRATO:");
		lblEstrato.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		lblEstrato.setBounds(20, 211, 112, 14);
		contentPane.add(lblEstrato);

		JLabel lblNivelEstudio = new JLabel("NIVEL ESTUDIO:");
		lblNivelEstudio.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		lblNivelEstudio.setBounds(20, 248, 118, 14);
		contentPane.add(lblNivelEstudio);

		JLabel lblEstadoCivil = new JLabel("ESTADO CIVIL:");
		lblEstadoCivil.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		lblEstadoCivil.setBounds(20, 283, 118, 14);
		contentPane.add(lblEstadoCivil);

		JLabel lblGenero = new JLabel("GENERO:");
		lblGenero.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		lblGenero.setBounds(20, 322, 112, 14);
		contentPane.add(lblGenero);

		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		txtNombre.setBounds(161, 20, 137, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		txtApellido = new JTextField();
		txtApellido.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		txtApellido.setText("");
		txtApellido.setBounds(161, 51, 137, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);

		txtId = new JTextField();
		txtId.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		txtId.setBounds(161, 82, 137, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);

		txtDireccion = new JTextField();
		txtDireccion.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		txtDireccion.setBounds(161, 107, 137, 20);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);

		txtDia = new JTextField();
		txtDia.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		txtDia.setBounds(161, 139, 46, 20);
		contentPane.add(txtDia);
		txtDia.setColumns(10);

		txtMes = new JTextField();
		txtMes.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		txtMes.setText("");
		txtMes.setBounds(217, 139, 46, 20);
		contentPane.add(txtMes);
		txtMes.setColumns(10);

		txtAnio = new JTextField();
		txtAnio.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		txtAnio.setBounds(273, 139, 46, 20);
		contentPane.add(txtAnio);
		txtAnio.setColumns(10);

		txtMail = new JTextField();
		txtMail.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		txtMail.setBounds(161, 173, 137, 20);
		contentPane.add(txtMail);
		txtMail.setColumns(10);

		btnVolver = new JButton("VOLVER");
		btnVolver.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		btnVolver.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVolver.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnVolver.setBounds(301, 357, 112, 31);
		btnVolver.addActionListener(this);
		contentPane.add(btnVolver);

		btnAgregar = new JButton("AGERGAR");
		btnAgregar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAgregar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnAgregar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		btnAgregar.setActionCommand("AGREGAR");
		btnAgregar.addActionListener(this);
		btnAgregar.setBounds(173, 357, 118, 31);
		contentPane.add(btnAgregar);

		cbEstrato = new JComboBox();
		cbEstrato.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cbEstrato.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		cbEstrato.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		cbEstrato.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3" }));
		cbEstrato.setBounds(161, 208, 137, 20);
		contentPane.add(cbEstrato);
		
		cbNivelEstudio = new JComboBox();
		cbNivelEstudio.setModel(new DefaultComboBoxModel(NivelEstudio.values()));
		cbNivelEstudio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cbNivelEstudio.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		cbNivelEstudio.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		cbNivelEstudio.setBounds(161, 245, 137, 20);
		contentPane.add(cbNivelEstudio);
		
		cbEstadoCivil = new JComboBox();
		cbEstadoCivil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cbEstadoCivil.setModel(new DefaultComboBoxModel(EstadoCivil.values()));
		cbEstadoCivil.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		cbEstadoCivil.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		cbEstadoCivil.setBounds(161, 280, 137, 20);
		contentPane.add(cbEstadoCivil);
		
		cbGenero = new JComboBox();
		cbGenero.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cbGenero.setModel(new DefaultComboBoxModel(Genero.values()));
		cbGenero.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		cbGenero.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		cbGenero.setBounds(161, 319, 137, 20);
		contentPane.add(cbGenero);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnVolver) {

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
				Cliente miCliente = new Cliente(id, nombre, apellido, direccion, email, fechaNacimiento, estrato, null, null, null, null, null);
				home.agregarClientes(miCliente);

				System.out.println(miCliente.toString());
				
			} catch (Exception err) {
				err.printStackTrace();
			}

			this.setVisible(false);
			home.setVisible(true);

		}
	}
}
