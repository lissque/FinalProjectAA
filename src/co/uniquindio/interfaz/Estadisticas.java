package co.uniquindio.interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.JLabel;

public class Estadisticas extends JFrame implements ActionListener {

	private JPanel contentPane;

	private Home home;
	private JButton btnVolver;
	private JButton btnListadoDeAsistentes;
	private JButton btnListadoDePuestos;
	private JButton btnListadoOrdenadoDe;
	private JButton btnListadoDeAsistentesEstrato;

	/**
	 * Create the frame.
	 */
	public Estadisticas(Home home) {

		this.home = home;
		setUndecorated(true);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane.setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnVolver = new JButton("VOLVER");
		btnVolver.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		btnVolver.addActionListener(this);
		btnVolver.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnVolver.setBounds(336, 254, 89, 23);
		contentPane.add(btnVolver);

		JLabel Encuesta = new JLabel("ESTAD\u00CDSTICAS");
		Encuesta.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		Encuesta.setBounds(28, 24, 248, 36);
		contentPane.add(Encuesta);

		btnListadoDeAsistentes = new JButton("LISTADO DE ASISTENTES");
		btnListadoDeAsistentes.addActionListener(this);
		btnListadoDeAsistentes.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		btnListadoDeAsistentes.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnListadoDeAsistentes.setBounds(28, 72, 397, 23);
		contentPane.add(btnListadoDeAsistentes);

		btnListadoOrdenadoDe = new JButton("LISTADO ORDENADO DE ASISTENTES");
		btnListadoOrdenadoDe.addActionListener(this);
		btnListadoOrdenadoDe.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		btnListadoOrdenadoDe.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnListadoOrdenadoDe.setBounds(28, 106, 397, 23);
		contentPane.add(btnListadoOrdenadoDe);

		btnListadoDePuestos = new JButton("LISTADO DE PUESTOS NO OCUPADOS");
		btnListadoDePuestos.addActionListener(this);
		btnListadoDePuestos.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		btnListadoDePuestos.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnListadoDePuestos.setBounds(28, 140, 397, 23);
		contentPane.add(btnListadoDePuestos);

		btnListadoDeAsistentesEstrato = new JButton("LISTADO DE ASISTENTES POR SU ESTRATO SOCIOECON\u00D3MICO");
		btnListadoDeAsistentesEstrato.addActionListener(this);
		btnListadoDeAsistentesEstrato.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		btnListadoDeAsistentesEstrato.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnListadoDeAsistentesEstrato.setBounds(28, 174, 397, 23);
		contentPane.add(btnListadoDeAsistentesEstrato);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnVolver) {

			this.dispose();
			home.setLocationRelativeTo(null);
			home.setVisible(true);
		}

	}

}
