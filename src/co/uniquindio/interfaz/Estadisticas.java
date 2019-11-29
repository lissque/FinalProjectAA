package co.uniquindio.interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.IllegalFormatCodePointException;
import java.util.TreeMap;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import co.uniquindio.mundo.Cliente;
import co.uniquindio.mundo.EstadoCivil;
import co.uniquindio.mundo.EstadoPuesto;
import co.uniquindio.mundo.Genero;
import co.uniquindio.mundo.NivelEstudio;
import co.uniquindio.mundo.Puesto;
import co.uniquindio.mundo.Seccion;

import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Cursor;

public class Estadisticas extends JFrame implements ActionListener {

	private JPanel contentPane;

	private Home home;
	private JButton btnVolver;
	private JButton btnListadoDeAsistentes;
	private JButton btnListadoDePuestos;
	private JButton btnListadoOrdenadoDe;
	private JButton btnListadoDeAsistentesEstrato;
	private JButton btnGenero;
	private JButton btnResulEncuesta;
	private JButton btnEstadoCivil;
	private JButton btnNivelEstudio;

	public Estadisticas(Home home) {

		this.home = home;
		setUndecorated(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 218, 185));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnVolver = new JButton("VOLVER");
		btnVolver.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVolver.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnVolver.addActionListener(this);
		btnVolver.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnVolver.setBounds(459, 547, 113, 29);
		contentPane.add(btnVolver);

		JLabel Encuesta = new JLabel("ESTAD\u00CDSTICAS");
		Encuesta.setFont(new Font("Gabriola", Font.BOLD, 30));
		Encuesta.setBounds(70, 46, 248, 36);
		contentPane.add(Encuesta);

		btnListadoDeAsistentes = new JButton("LISTADO DE ASISTENTES");
		btnListadoDeAsistentes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnListadoDeAsistentes.addActionListener(this);
		btnListadoDeAsistentes.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnListadoDeAsistentes.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnListadoDeAsistentes.setBounds(54, 103, 485, 29);
		contentPane.add(btnListadoDeAsistentes);

		btnListadoOrdenadoDe = new JButton("LISTADO ORDENADO DE ASISTENTES");
		btnListadoOrdenadoDe.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnListadoOrdenadoDe.addActionListener(this);
		btnListadoOrdenadoDe.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnListadoOrdenadoDe.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnListadoOrdenadoDe.setBounds(54, 154, 485, 29);
		contentPane.add(btnListadoOrdenadoDe);

		btnListadoDePuestos = new JButton("LISTADO DE PUESTOS NO OCUPADOS");
		btnListadoDePuestos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnListadoDePuestos.addActionListener(this);
		btnListadoDePuestos.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnListadoDePuestos.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnListadoDePuestos.setBounds(54, 205, 485, 29);
		contentPane.add(btnListadoDePuestos);

		btnListadoDeAsistentesEstrato = new JButton("LISTADO DE ASISTENTES POR SU ESTRATO SOCIOECON\u00D3MICO");
		btnListadoDeAsistentesEstrato.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnListadoDeAsistentesEstrato.addActionListener(this);
		btnListadoDeAsistentesEstrato.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnListadoDeAsistentesEstrato.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnListadoDeAsistentesEstrato.setBounds(54, 258, 485, 29);
		contentPane.add(btnListadoDeAsistentesEstrato);

		btnResulEncuesta = new JButton("GRAFICAS ENCUESTAS");
		btnResulEncuesta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnResulEncuesta.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnResulEncuesta.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnResulEncuesta.setBounds(54, 483, 485, 29);
		btnResulEncuesta.addActionListener(this);
		contentPane.add(btnResulEncuesta);

		btnGenero = new JButton("GR\u00C1FICA SOCIODEMOGR\u00C1FICA DE G\u00C9NERO");
		btnGenero.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGenero.addActionListener(this);
		btnGenero.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnGenero.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnGenero.setBounds(54, 311, 485, 29);
		contentPane.add(btnGenero);

		btnEstadoCivil = new JButton("GR\u00C1FICA SOCIODEMOGR\u00C1FICA DE ESTADO CIVIL");
		btnEstadoCivil.addActionListener(this);
		btnEstadoCivil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEstadoCivil.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnEstadoCivil.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnEstadoCivil.setBounds(54, 367, 485, 29);
		contentPane.add(btnEstadoCivil);

		btnNivelEstudio = new JButton("GR\u00C1FICA SOCIODEMOGR\u00C1FICA DEL NIVEL DE ESTUDIO");
		btnNivelEstudio.addActionListener(this);
		btnNivelEstudio.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnNivelEstudio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNivelEstudio.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNivelEstudio.setBounds(54, 427, 485, 29);
		contentPane.add(btnNivelEstudio);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		/**
		 * if (e.getSource() == btnListadoDeAsistentes) { String salida = "Listado de
		 * asistentes: \n"; for (Cliente miCliente :
		 * home.getMiEvento().getRegistro().getClientes()) { salida +=
		 * miCliente.toString(); salida += "\n"; } JOptionPane.showMessageDialog(null,
		 * salida, "Informacion*", JOptionPane.INFORMATION_MESSAGE); }
		 **/
		/**
		 * if (e.getSource() == btnListadoOrdenadoDe) { TreeMap<String, String> ordenado
		 * = new TreeMap<String, String>(); for (Cliente miCliente :
		 * home.getMiEvento().getRegistro().getClientes()) {
		 * ordenado.put(miCliente.getNombre() + miCliente.getApellido(),
		 * miCliente.getId());
		 * 
		 * } JOptionPane.showMessageDialog(null, ordenado.values(), "Informacion*",
		 * JOptionPane.INFORMATION_MESSAGE);
		 * 
		 * }
		 **/
		/**
		 * if (e.getSource() == btnListadoDeAsistentesEstrato) {
		 * 
		 * String estrato1 = "Listado de asistentes por estrato 1: \n"; String estrato2
		 * = "Listado de asistentes por estrato 2: \n"; String estrato3 = "Listado de
		 * asistentes por estrato 3: \n";
		 * 
		 * for (Cliente miCliente : home.getMiEvento().getRegistro().getClientes()) { if
		 * (miCliente.getEstrato() == 1) { estrato1 += miCliente.toString(); } if
		 * (miCliente.getEstrato() == 2) { estrato2 += miCliente.toString(); } if
		 * (miCliente.getEstrato() == 3) { estrato3 += miCliente.toString(); } estrato1
		 * += "\n"; estrato2 += "\n"; estrato3 += "\n"; }
		 * 
		 * JOptionPane.showMessageDialog(null, estrato1 + estrato2 + estrato3,
		 * "Informacion*", JOptionPane.INFORMATION_MESSAGE);
		 * 
		 * }
		 **/
		/**if (e.getSource() == btnListadoDePuestos) {

			String puestos = "Listado de puestos libres \n";
			for (Seccion seccion : home.getMiEvento().getEscenario().getSecciones()) {
				puestos += seccion;
				for (int i = 0; i < seccion.getPuestos().length; i++) {
					for (int j = 0; j < seccion.getPuestos()[i].length; j++) {
						Puesto miP = seccion.getPuestos()[i][j];
						if (miP.getEstado() == EstadoPuesto.LIBRE) {
							puestos += miP.getEstado();
						}
					}
					puestos += "\n";
				}
				puestos += "\n";

			}
			JOptionPane.showMessageDialog(null, puestos, "Informacion*", JOptionPane.INFORMATION_MESSAGE);
		}**/
		if (e.getSource() == btnResulEncuesta) {
			this.dispose();
			GraficasEncuesta graficas = new GraficasEncuesta(home);
			graficas.setVisible(true);
			graficas.setLocationRelativeTo(null);
		}
		if (e.getSource() == btnGenero) {
			DefaultCategoryDataset ds = new DefaultCategoryDataset();
			ds.addValue(contarGenero(Genero.HOMBRE), "HOMBRE", "");
			ds.addValue(contarGenero(Genero.MUJER), "MUJER", "");
			ds.addValue(contarGenero(Genero.OTRO), "OTRO", "");
			JFreeChart jf = ChartFactory.createBarChart3D("INFORMACION SOCIO-DEMOGRAFICA", "GENERO", "CANTIDAD", ds,
					PlotOrientation.VERTICAL, true, true, true);
			ChartFrame f = new ChartFrame("", jf);
			f.setSize(700, 600);
			f.setLocationRelativeTo(null);
			f.setVisible(true);
		}
		if (e.getSource()==btnEstadoCivil) {
			DefaultCategoryDataset ds = new DefaultCategoryDataset();
			ds.addValue(contarEstadoCivil(EstadoCivil.CASADO), "CASADO", "");
			ds.addValue(contarEstadoCivil(EstadoCivil.SOLTERO), "SOLTERO", "");
			ds.addValue(contarEstadoCivil(EstadoCivil.DIVORCIADO), "DIVORCIADO", "");
			ds.addValue(contarEstadoCivil(EstadoCivil.UNION_LIBRE), "UNION LIBRE", "");
			JFreeChart jf = ChartFactory.createBarChart3D("INFORMACION SOCIO-DEMOGRAFICA", "ESTADO CIVIL", "CANTIDAD", ds,
					PlotOrientation.VERTICAL, true, true, true);
			ChartFrame f = new ChartFrame("", jf);
			f.setSize(700, 600);
			f.setLocationRelativeTo(null);
			f.setVisible(true);
		}
		if (e.getSource()==btnNivelEstudio) {
			DefaultCategoryDataset ds = new DefaultCategoryDataset();
			ds.addValue(contarNivelEstudio(NivelEstudio.BACHILLER), "BACHILLER", "");
			ds.addValue(contarNivelEstudio(NivelEstudio.PREGRADO), "PREGRADO", "");
			ds.addValue(contarNivelEstudio(NivelEstudio.MAESTRIA), "MAESTRIA", "");
			ds.addValue(contarNivelEstudio(NivelEstudio.DOCTORADO), "DOCTORADO", "");
			ds.addValue(contarNivelEstudio(NivelEstudio.POSTDOCTORADO), "POSTDOCTORADO", "");
			JFreeChart jf = ChartFactory.createBarChart3D("INFORMACION SOCIO-DEMOGRAFICA", "NIVEL DE ESTUDIO", "CANTIDAD", ds,
					PlotOrientation.VERTICAL, true, true, true);
			ChartFrame f = new ChartFrame("", jf);
			f.setSize(700, 600);
			f.setLocationRelativeTo(null);
			f.setVisible(true);
		}
		if (e.getSource() == btnVolver) {
			this.dispose();
			home.setLocationRelativeTo(null);
			home.setVisible(true);
		}
	}

	public int contarGenero(Genero genero) {
		int cont = 0;
		for (Cliente cliente : home.getMiEvento().getMisClientes()) {
			if (cliente.getGenero() == genero) {
				cont++;
			}
		}
		return cont;
	}

	public int contarEstadoCivil(EstadoCivil estado) {
		int contador = 0;
		for (Cliente cliente : home.getMiEvento().getMisClientes()) {
			if (cliente.getEstadoCivil() == estado) {
				contador++;
			}
		}
		return contador;
	}

	public int contarNivelEstudio(NivelEstudio estudio) {
		int contador = 0;
		for (Cliente cliente : home.getMiEvento().getMisClientes()) {
			if (cliente.getNivelEstudio() == estudio) {
				contador++;
			}
		}
		return contador;
	}
}
