package co.uniquindio.interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;

import co.uniquindio.mundo.Cliente;
import co.uniquindio.mundo.Evento;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.Cursor;
import java.awt.Dialog.ModalExclusionType;

public class Home extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnInscribirse;
	private JButton btnIngresar;
	private JButton btnX;
	private JButton btnAdministrador;
	private Admin ventanaAdmin;
	private Evento miEvento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Evento getMiEvento() {
		return miEvento;
	}

	public void setMiEvento(Evento miEvento) {
		this.miEvento = miEvento;
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);

		miEvento = new Evento();
		setLocationRelativeTo(null);
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 304);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblGestionDeEspectaculos = new JLabel("GESTIÓN DE ESPECTÁCULOS");
		lblGestionDeEspectaculos.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblGestionDeEspectaculos.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblGestionDeEspectaculos.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 28));
		lblGestionDeEspectaculos.setForeground(Color.WHITE);
		lblGestionDeEspectaculos.setBounds(65, 27, 421, 73);
		contentPane.add(lblGestionDeEspectaculos);

		btnX = new JButton("X");
		btnX.setForeground(Color.BLACK);
		btnX.setBackground(Color.RED);
		btnX.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnX.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		btnX.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnX.setBounds(532, 11, 30, 26);
		contentPane.add(btnX);
		btnX.addActionListener(this);

		btnInscribirse = new JButton("INSCRIBIRSE");
		btnInscribirse.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		btnInscribirse.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnInscribirse.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnInscribirse.setBounds(201, 111, 138, 37);
		contentPane.add(btnInscribirse);
		btnInscribirse.addActionListener(this);

		btnIngresar = new JButton("INGRESAR");
		btnIngresar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnIngresar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIngresar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		btnIngresar.setBounds(201, 207, 138, 37);
		contentPane.add(btnIngresar);
		btnIngresar.addActionListener(this);

		btnAdministrador = new JButton("ADMINISTRADOR");
		btnAdministrador.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnAdministrador.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		btnAdministrador.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdministrador.setBounds(201, 159, 138, 37);
		contentPane.add(btnAdministrador);
		btnAdministrador.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnX) {

			System.exit(0);
		}

		if (e.getSource() == btnInscribirse) {

			this.dispose();
			Inscripcion inscripcion = new Inscripcion(this);
			inscripcion.setLocationRelativeTo(null);
			inscripcion.setVisible(true);
		}
		
		if (e.getSource() == btnAdministrador) {
			this.dispose();
			ventanaAdmin = new  Admin(this);
			ventanaAdmin.setVisible(true);
		}

		if (e.getSource() == btnIngresar) {

			this.dispose();
			Ingresar ingresar = new Ingresar(this);
			ingresar.setLocationRelativeTo(null);
			ingresar.setVisible(true);

		}

	}

	public void agregarClientes(Cliente cliente) {
		miEvento.agregarCliente(cliente);
	}
}
