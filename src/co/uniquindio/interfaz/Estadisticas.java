package co.uniquindio.interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.TreeMap;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.text.html.HTMLDocument.Iterator;

import co.uniquindio.mundo.Cliente;
import co.uniquindio.mundo.EstadoPuesto;
import co.uniquindio.mundo.Puesto;
import co.uniquindio.mundo.Registro;
import co.uniquindio.mundo.Seccion;

import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
//		contentPane.setBackground(Color.LIGHT_GRAY);
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

		if (e.getSource() == btnListadoDeAsistentes) {
			String salida = "Listado de asistentes: \n";
			for (Cliente miCliente : home.getMiEvento().getRegistro().getClientes()) {
				salida += miCliente.toString();
				salida += "\n";
			}
			JOptionPane.showMessageDialog(null, salida, "Informacion*", JOptionPane.INFORMATION_MESSAGE);
		}
		if (e.getSource() == btnListadoOrdenadoDe) {
			TreeMap<String, String> ordenado = new TreeMap<String, String>();
			for (Cliente miCliente : home.getMiEvento().getRegistro().getClientes()) {
				ordenado.put(miCliente.getNombre() + miCliente.getApellido(), miCliente.getId());

			}
			JOptionPane.showMessageDialog(null, ordenado.values(), "Informacion*", JOptionPane.INFORMATION_MESSAGE);

		}
		if (e.getSource() == btnListadoDeAsistentesEstrato) {
			String estrato1 = "Listado de asistentes por estrato 1: \n";
			String estrato2 = "Listado de asistentes por estrato 2: \n";
			String estrato3 = "Listado de asistentes por estrato 3: \n";
			for (Cliente miCliente : home.getMiEvento().getRegistro().getClientes()) {
				if (miCliente.getEstrato() == 1) {
					estrato1 += miCliente.toString();
				}
				if (miCliente.getEstrato() == 2) {
					estrato2 += miCliente.toString();
				}
				if (miCliente.getEstrato() == 3) {
					estrato3 += miCliente.toString();
				}
				estrato1 += "\n";
				estrato2 += "\n";
				estrato3 += "\n";
			}
			JOptionPane.showMessageDialog(null, estrato1 + estrato2 + estrato3, "Informacion*",
					JOptionPane.INFORMATION_MESSAGE);
		}
		if (e.getSource() == btnListadoDePuestos) {
			String puestos = "Listado de puestos libres \n";
			for (Seccion seccion : home.getMiEvento().getEscenario().getSecciones()) {
				puestos+=seccion;
				for (int i = 0; i < seccion.getPuestos().length; i++) {
					for (int j = 0; j < seccion.getPuestos()[i].length; j++) {
						Puesto miP = seccion.getPuestos()[i][j];
						if (miP.getEstado()==EstadoPuesto.LIBRE) {
							puestos+=miP.getEstado();
						}
					}
					puestos+="\n";
				}
				puestos+="\n";

			}
			JOptionPane.showMessageDialog(null, puestos, "Informacion*",
					JOptionPane.INFORMATION_MESSAGE);
		}
		if (e.getSource() == btnVolver) {

			this.dispose();
			home.setLocationRelativeTo(null);
			home.setVisible(true);
		}

	}

}
