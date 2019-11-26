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
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {

		miEvento = new Evento();

		setLocationRelativeTo(null);
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblGestionDeEspectaculos = new JLabel("Gestion de Espectaculos");
		lblGestionDeEspectaculos.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 35));
		lblGestionDeEspectaculos.setForeground(Color.WHITE);
		lblGestionDeEspectaculos.setBounds(43, 27, 447, 73);
		contentPane.add(lblGestionDeEspectaculos);

		btnX = new JButton("X");
		btnX.setBounds(443, 11, 47, 37);
		contentPane.add(btnX);
		btnX.addActionListener(this);

		btnInscribirse = new JButton("Inscribirse");
		btnInscribirse.setBounds(88, 213, 89, 23);
		contentPane.add(btnInscribirse);
		btnInscribirse.addActionListener(this);

		btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(313, 213, 89, 23);
		contentPane.add(btnIngresar);

		btnAdministrador = new JButton("Administrador");
		btnAdministrador.setBounds(194, 268, 104, 23);
		contentPane.add(btnAdministrador);
		btnIngresar.addActionListener(this);
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

	}

	public void agregarClientes(Cliente cliente) {
		miEvento.agregarCliente(cliente);
	}
}
