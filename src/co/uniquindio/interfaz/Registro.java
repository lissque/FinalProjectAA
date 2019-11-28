package co.uniquindio.interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import co.uniquindio.mundo.Cliente;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
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
import com.toedter.calendar.JDateChooser;

public class Registro extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtId;
	private JTextField txtDireccion;
	private JTextField txtMail;
	private JButton btnAgregar;
	private JButton btnVolver;
	private Home home;
	private JComboBox cbEstrato;
	private JComboBox cbNivelEstudio;
	private JComboBox cbEstadoCivil;
	private JComboBox cbGenero;
	private JLabel lblRegistrarse;
	private JDateChooser fechaNacimiento;

	/**
	 * Create the frame.
	 */
	public Registro(Home home) {

		this.home = home;

		setBackground(Color.LIGHT_GRAY);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(233, 150, 122));
		contentPane.setBackground(new Color(255, 218, 185));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNombre = new JLabel("NOMBRE:");
		lblNombre.setFont(new Font("Gabriola", Font.BOLD, 18));
		lblNombre.setBounds(132, 98, 112, 14);
		contentPane.add(lblNombre);

		JLabel lblApellido = new JLabel("APELLIDO:");
		lblApellido.setFont(new Font("Gabriola", Font.BOLD, 18));
		lblApellido.setBounds(132, 134, 112, 14);
		contentPane.add(lblApellido);

		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Gabriola", Font.BOLD, 18));
		lblId.setBounds(132, 165, 112, 14);
		contentPane.add(lblId);

		JLabel lblDireccin = new JLabel("DIRECCI\u00D3N:");
		lblDireccin.setFont(new Font("Gabriola", Font.BOLD, 18));
		lblDireccin.setBounds(132, 196, 112, 14);
		contentPane.add(lblDireccin);

		JLabel lblFechaNacimiento = new JLabel("FECHA NACIMIENTO:");
		lblFechaNacimiento.setFont(new Font("Gabriola", Font.BOLD, 18));
		lblFechaNacimiento.setBounds(132, 228, 157, 20);
		contentPane.add(lblFechaNacimiento);

		JLabel lblEmail = new JLabel("E-MAIL:");
		lblEmail.setFont(new Font("Gabriola", Font.BOLD, 18));
		lblEmail.setBounds(132, 264, 112, 14);
		contentPane.add(lblEmail);

		JLabel lblEstrato = new JLabel("ESTRATO:");
		lblEstrato.setFont(new Font("Gabriola", Font.BOLD, 18));
		lblEstrato.setBounds(132, 300, 112, 14);
		contentPane.add(lblEstrato);

		JLabel lblNivelEstudio = new JLabel("NIVEL ESTUDIO:");
		lblNivelEstudio.setFont(new Font("Gabriola", Font.BOLD, 18));
		lblNivelEstudio.setBounds(132, 335, 112, 14);
		contentPane.add(lblNivelEstudio);

		JLabel lblEstadoCivil = new JLabel("ESTADO CIVIL:");
		lblEstadoCivil.setFont(new Font("Gabriola", Font.BOLD, 18));
		lblEstadoCivil.setBounds(132, 372, 118, 14);
		contentPane.add(lblEstadoCivil);

		JLabel lblGenero = new JLabel("GENERO:");
		lblGenero.setFont(new Font("Gabriola", Font.BOLD, 18));
		lblGenero.setBounds(132, 408, 112, 14);
		contentPane.add(lblGenero);

		txtNombre = new JTextField();
		txtNombre.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtNombre.setFont(new Font("Gabriola", Font.PLAIN, 18));
		txtNombre.setBounds(254, 91, 236, 25);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		txtApellido = new JTextField();
		txtApellido.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtApellido.setFont(new Font("Gabriola", Font.PLAIN, 18));
		txtApellido.setText("");
		txtApellido.setBounds(254, 127, 236, 25);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);

		txtId = new JTextField();
		txtId.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtId.setFont(new Font("Gabriola", Font.PLAIN, 18));
		txtId.setBounds(254, 158, 236, 25);
		contentPane.add(txtId);
		txtId.setColumns(10);

		txtDireccion = new JTextField();
		txtDireccion.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtDireccion.setFont(new Font("Gabriola", Font.PLAIN, 18));
		txtDireccion.setBounds(254, 189, 236, 25);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);

		txtMail = new JTextField();
		txtMail.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtMail.setFont(new Font("Gabriola", Font.PLAIN, 18));
		txtMail.setBounds(254, 259, 236, 25);
		contentPane.add(txtMail);
		txtMail.setColumns(10);

		btnVolver = new JButton("VOLVER");
		btnVolver.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnVolver.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVolver.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnVolver.setBounds(536, 444, 137, 31);
		btnVolver.addActionListener(this);
		contentPane.add(btnVolver);

		btnAgregar = new JButton("AGERGAR");
		btnAgregar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAgregar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnAgregar.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnAgregar.setActionCommand("AGREGAR");
		btnAgregar.addActionListener(this);
		btnAgregar.setBounds(395, 444, 131, 31);
		contentPane.add(btnAgregar);

		cbEstrato = new JComboBox();
		cbEstrato.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cbEstrato.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		cbEstrato.setFont(new Font("Gabriola", Font.PLAIN, 20));
		cbEstrato.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3" }));
		cbEstrato.setBounds(254, 295, 236, 25);
		contentPane.add(cbEstrato);

		cbNivelEstudio = new JComboBox();
		cbNivelEstudio.setModel(new DefaultComboBoxModel(NivelEstudio.values()));
		cbNivelEstudio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cbNivelEstudio.setFont(new Font("Gabriola", Font.PLAIN, 17));
		cbNivelEstudio.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		cbNivelEstudio.setBounds(254, 331, 236, 25);
		contentPane.add(cbNivelEstudio);

		cbEstadoCivil = new JComboBox();
		cbEstadoCivil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cbEstadoCivil.setModel(new DefaultComboBoxModel(EstadoCivil.values()));
		cbEstadoCivil.setFont(new Font("Gabriola", Font.PLAIN, 18));
		cbEstadoCivil.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		cbEstadoCivil.setBounds(254, 367, 236, 25);
		contentPane.add(cbEstadoCivil);

		cbGenero = new JComboBox();
		cbGenero.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cbGenero.setModel(new DefaultComboBoxModel(Genero.values()));
		cbGenero.setFont(new Font("Gabriola", Font.PLAIN, 18));
		cbGenero.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		cbGenero.setBounds(254, 403, 236, 25);
		contentPane.add(cbGenero);

		lblRegistrarse = new JLabel("REGISTRARSE");
		lblRegistrarse.setFont(new Font("Gabriola", Font.BOLD, 30));
		lblRegistrarse.setBounds(62, 31, 257, 26);
		contentPane.add(lblRegistrarse);
		
		fechaNacimiento = new JDateChooser();
		fechaNacimiento.setBounds(327, 223, 163, 25);
		contentPane.add(fechaNacimiento);

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
			String email = txtMail.getText();

			int estrato = Integer.parseInt(cbEstrato.getSelectedItem().toString());
			NivelEstudio nivelEstudio = (NivelEstudio) cbNivelEstudio.getSelectedItem();
			EstadoCivil estadoCivil = (EstadoCivil) cbEstadoCivil.getSelectedItem();
			Genero genero = (Genero) cbGenero.getSelectedItem();
			GregorianCalendar fecha = (GregorianCalendar)fechaNacimiento.getCalendar();

			if (nombre.length() < 1 || apellido.length() < 1 || id.length() < 1 || direccion.length() < 1
					|| email.length() < 1 || fecha==null) {

				JOptionPane.showMessageDialog(null, "RELLENE CORRECTAMENTE TODOS LOS CAMPOS", "ADVERTENCIA!", JOptionPane.ERROR_MESSAGE);

			} else {
				Cliente miCliente = new Cliente(id, nombre, apellido, direccion, email, fecha, estrato,
						nivelEstudio, estadoCivil, genero, null);

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
