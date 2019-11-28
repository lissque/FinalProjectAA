package co.uniquindio.interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;

import co.uniquindio.mundo.Cliente;
import co.uniquindio.mundo.Escenario;
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
	private JButton btnRegistrarse;
	private JButton btnIngresar;
	private JButton btnX;
	private JButton btnAdministrador;
	private Evento miEvento;
	private Escenario miEscenario;

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
		miEscenario = new Escenario();

		setLocationRelativeTo(null);
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 235, 205));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblGestionDeEspectaculos = new JLabel("GESTIÓN DE ESPECTÁCULOS");
		lblGestionDeEspectaculos.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblGestionDeEspectaculos.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblGestionDeEspectaculos.setFont(new Font("Gabriola", Font.BOLD, 50));
		lblGestionDeEspectaculos.setForeground(Color.BLACK);
		lblGestionDeEspectaculos.setBounds(68, 63, 601, 73);
		contentPane.add(lblGestionDeEspectaculos);

		btnX = new JButton("X");
		btnX.setForeground(Color.BLACK);
		btnX.setBackground(Color.RED);
		btnX.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnX.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnX.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnX.setBounds(660, 11, 30, 26);
		contentPane.add(btnX);
		btnX.addActionListener(this);

		btnRegistrarse = new JButton("REGISTRARSE");
		btnRegistrarse.setBackground(new Color(240, 128, 128));
		btnRegistrarse.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnRegistrarse.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistrarse.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnRegistrarse.setBounds(216, 193, 267, 37);
		contentPane.add(btnRegistrarse);
		btnRegistrarse.addActionListener(this);

		btnIngresar = new JButton("INGRESAR");
		btnIngresar.setBackground(new Color(240, 128, 128));
		btnIngresar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnIngresar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIngresar.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnIngresar.setBounds(216, 367, 267, 37);
		contentPane.add(btnIngresar);
		btnIngresar.addActionListener(this);

		btnAdministrador = new JButton("ADMINISTRADOR");
		btnAdministrador.setBackground(new Color(240, 128, 128));
		btnAdministrador.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnAdministrador.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnAdministrador.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdministrador.setBounds(216, 282, 267, 37);
		contentPane.add(btnAdministrador);
		btnAdministrador.addActionListener(this);
	}

	public void agregarClientes(Cliente cliente) {
		miEvento.agregarCliente(cliente);
	}

	public Escenario getMiEscenario() {
		return miEscenario;
	}

	public void setMiEscenario(Escenario miEscenario) {
		this.miEscenario = miEscenario;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnX) {

			System.exit(0);
		}

		if (e.getSource() == btnRegistrarse) {

			this.dispose();
			Inscripcion inscripcion = new Inscripcion(this);
			inscripcion.setLocationRelativeTo(null);
			inscripcion.setVisible(true);
		}

		if (e.getSource() == btnAdministrador) {

			this.dispose();
			Admin admin = new Admin(this);
			admin.setLocationRelativeTo(null);
			admin.setVisible(true);
		}

		if (e.getSource() == btnIngresar) {

			this.dispose();
			Ingresar ingresar = new Ingresar(this);
			ingresar.setLocationRelativeTo(null);
			ingresar.setVisible(true);

		}
	}
}
