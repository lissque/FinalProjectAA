package co.uniquindio.interfaz;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import co.uniquindio.mundo.Cliente;
import co.uniquindio.mundo.EstadoCivil;
import co.uniquindio.mundo.Registro;
import co.uniquindio.mundo.Respuesta;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Cursor;

public class GraficasEncuesta extends JFrame implements ActionListener{

	private JPanel contentPane;
	private Home home;
	private JButton btnPregunta1;
	private JButton btnPregunta2;
	private JButton btnPregunta3;
	private JButton btnPregunta4;
	private JButton btnPregunta5;
	private JButton btnPregunta6;
	private JButton btnVolver;

	/**
	 * Create the frame.
	 */
	public GraficasEncuesta(Home home) {
		this.home = home;
		setUndecorated(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 405, 365);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 218, 185));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSeleccioneUnaOpcion = new JLabel("SELECCIONE UNA OPCION");
		lblSeleccioneUnaOpcion.setFont(new Font("Gabriola", Font.BOLD, 30));
		lblSeleccioneUnaOpcion.setBounds(35, 26, 319, 36);
		contentPane.add(lblSeleccioneUnaOpcion);
		
		btnPregunta1 = new JButton("GRAFICA PREGUNTA 1");
		btnPregunta1.addActionListener(this);
		btnPregunta1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPregunta1.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnPregunta1.setBounds(35, 73, 319, 29);
		contentPane.add(btnPregunta1);
		
		btnPregunta2 = new JButton("GRAFICA PREGUNTA 2");
		btnPregunta2.addActionListener(this);
		btnPregunta2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPregunta2.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnPregunta2.setBounds(35, 113, 319, 29);
		contentPane.add(btnPregunta2);
		
		btnPregunta3 = new JButton("GRAFICA PREGUNTA 3");
		btnPregunta3.addActionListener(this);
		btnPregunta3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPregunta3.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnPregunta3.setBounds(35, 153, 319, 29);
		contentPane.add(btnPregunta3);
		
		btnPregunta4 = new JButton("GRAFICA PREGUNTA 4");
		btnPregunta4.addActionListener(this);
		btnPregunta4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPregunta4.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnPregunta4.setBounds(35, 193, 319, 29);
		contentPane.add(btnPregunta4);
		
		btnPregunta5 = new JButton("GRAFICA PREGUNTA 5");
		btnPregunta5.addActionListener(this);
		btnPregunta5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPregunta5.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnPregunta5.setBounds(35, 233, 319, 29);
		contentPane.add(btnPregunta5);
		
		btnPregunta6 = new JButton("GRAFICA PREGUNTA 6");
		btnPregunta6.addActionListener(this);
		btnPregunta6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPregunta6.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnPregunta6.setBounds(35, 272, 319, 29);
		contentPane.add(btnPregunta6);
		
		btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(this);
		btnVolver.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVolver.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnVolver.setBounds(214, 312, 166, 29);
		contentPane.add(btnVolver);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()== btnPregunta1) {
			DefaultCategoryDataset ds = new DefaultCategoryDataset();
			ds.addValue(contar(0, Respuesta.MUY_DE_ACUERDO), "MUY DE ACUERDO", "");
			ds.addValue(contar(0, Respuesta.ALGO_DE_ACUERDO), "ALGO DE ACUERDO", "");
			ds.addValue(contar(0, Respuesta.NI_DE_ACUERDO_NI_DESACUERDO), "NI DE ACUERDO NI DESACUERDO", "");
			ds.addValue(contar(0, Respuesta.ALGO_EN_DESACUERDO), "ALGO EN DESACUERDO", "");
			ds.addValue(contar(0, Respuesta.MUY_EN_DESACUERDO), "MUY EN DESACUERDO", "");
			JFreeChart jf = ChartFactory.createBarChart3D("RESPUESTAS DE LA ENCUESTA", "PREGUNTA 1", "CANTIDAD", ds,
					PlotOrientation.VERTICAL, true, true, true);
			ChartFrame f = new ChartFrame("", jf);
			f.setSize(700, 600);
			f.setLocationRelativeTo(null);
			f.setVisible(true);
		}
		if (e.getSource()== btnPregunta2) {
			DefaultCategoryDataset ds = new DefaultCategoryDataset();
			ds.addValue(contar(1, Respuesta.MUY_DE_ACUERDO), "MUY DE ACUERDO", "");
			ds.addValue(contar(1, Respuesta.ALGO_DE_ACUERDO), "ALGO DE ACUERDO", "");
			ds.addValue(contar(1, Respuesta.NI_DE_ACUERDO_NI_DESACUERDO), "NI DE ACUERDO NI DESACUERDO", "");
			ds.addValue(contar(1, Respuesta.ALGO_EN_DESACUERDO), "ALGO EN DESACUERDO", "");
			ds.addValue(contar(1, Respuesta.MUY_EN_DESACUERDO), "MUY EN DESACUERDO", "");
			JFreeChart jf = ChartFactory.createBarChart3D("RESPUESTAS DE LA ENCUESTA", "PREGUNTA 2", "CANTIDAD", ds,
					PlotOrientation.VERTICAL, true, true, true);
			ChartFrame f = new ChartFrame("", jf);
			f.setSize(700, 600);
			f.setLocationRelativeTo(null);
			f.setVisible(true);
		}
		if (e.getSource()== btnPregunta3) {
			DefaultCategoryDataset ds = new DefaultCategoryDataset();
			ds.addValue(contar(2, Respuesta.MUY_DE_ACUERDO), "MUY DE ACUERDO", "");
			ds.addValue(contar(2, Respuesta.ALGO_DE_ACUERDO), "ALGO DE ACUERDO", "");
			ds.addValue(contar(2, Respuesta.NI_DE_ACUERDO_NI_DESACUERDO), "NI DE ACUERDO NI DESACUERDO", "");
			ds.addValue(contar(2, Respuesta.ALGO_EN_DESACUERDO), "ALGO EN DESACUERDO", "");
			ds.addValue(contar(2, Respuesta.MUY_EN_DESACUERDO), "MUY EN DESACUERDO", "");
			JFreeChart jf = ChartFactory.createBarChart3D("RESPUESTAS DE LA ENCUESTA", "PREGUNTA 3", "CANTIDAD", ds,
					PlotOrientation.VERTICAL, true, true, true);
			ChartFrame f = new ChartFrame("", jf);
			f.setSize(700, 600);
			f.setLocationRelativeTo(null);
			f.setVisible(true);
		}
		if (e.getSource()== btnPregunta4) {
			DefaultCategoryDataset ds = new DefaultCategoryDataset();
			ds.addValue(contar(3, Respuesta.MUY_DE_ACUERDO), "MUY DE ACUERDO", "");
			ds.addValue(contar(3, Respuesta.ALGO_DE_ACUERDO), "ALGO DE ACUERDO", "");
			ds.addValue(contar(3, Respuesta.NI_DE_ACUERDO_NI_DESACUERDO), "NI DE ACUERDO NI DESACUERDO", "");
			ds.addValue(contar(3, Respuesta.ALGO_EN_DESACUERDO), "ALGO EN DESACUERDO", "");
			ds.addValue(contar(3, Respuesta.MUY_EN_DESACUERDO), "MUY EN DESACUERDO", "");
			JFreeChart jf = ChartFactory.createBarChart3D("RESPUESTAS DE LA ENCUESTA", "PREGUNTA 4", "CANTIDAD", ds,
					PlotOrientation.VERTICAL, true, true, true);
			ChartFrame f = new ChartFrame("", jf);
			f.setSize(700, 600);
			f.setLocationRelativeTo(null);
			f.setVisible(true);
		}
		if (e.getSource()== btnPregunta5) {
			DefaultCategoryDataset ds = new DefaultCategoryDataset();
			ds.addValue(contar(4, Respuesta.MUY_DE_ACUERDO), "MUY DE ACUERDO", "");
			ds.addValue(contar(4, Respuesta.ALGO_DE_ACUERDO), "ALGO DE ACUERDO", "");
			ds.addValue(contar(4, Respuesta.NI_DE_ACUERDO_NI_DESACUERDO), "NI DE ACUERDO NI DESACUERDO", "");
			ds.addValue(contar(4, Respuesta.ALGO_EN_DESACUERDO), "ALGO EN DESACUERDO", "");
			ds.addValue(contar(4, Respuesta.MUY_EN_DESACUERDO), "MUY EN DESACUERDO", "");
			JFreeChart jf = ChartFactory.createBarChart3D("RESPUESTAS DE LA ENCUESTA", "PREGUNTA 5", "CANTIDAD", ds,
					PlotOrientation.VERTICAL, true, true, true);
			ChartFrame f = new ChartFrame("", jf);
			f.setSize(700, 600);
			f.setLocationRelativeTo(null);
			f.setVisible(true);
		}
		if (e.getSource()== btnPregunta6) {
			DefaultCategoryDataset ds = new DefaultCategoryDataset();
			ds.addValue(contar(5, Respuesta.MUY_DE_ACUERDO), "MUY DE ACUERDO", "");
			ds.addValue(contar(5, Respuesta.ALGO_DE_ACUERDO), "ALGO DE ACUERDO", "");
			ds.addValue(contar(5, Respuesta.NI_DE_ACUERDO_NI_DESACUERDO), "NI DE ACUERDO NI DESACUERDO", "");
			ds.addValue(contar(5, Respuesta.ALGO_EN_DESACUERDO), "ALGO EN DESACUERDO", "");
			ds.addValue(contar(5, Respuesta.MUY_EN_DESACUERDO), "MUY EN DESACUERDO", "");
			JFreeChart jf = ChartFactory.createBarChart3D("RESPUESTAS DE LA ENCUESTA", "PREGUNTA 5", "CANTIDAD", ds,
					PlotOrientation.VERTICAL, true, true, true);
			ChartFrame f = new ChartFrame("", jf);
			f.setSize(700, 600);
			f.setLocationRelativeTo(null);
			f.setVisible(true);
		}
		if (e.getSource()==btnVolver) {
			this.dispose();
			Estadisticas estadisticas = new Estadisticas(home);
			estadisticas.setVisible(true);
			estadisticas.setLocationRelativeTo(null);
		} 
	}
	
	
	public int contar (int pregunta, Respuesta res) {
		int cont = 0;
		for (Registro registro : home.getMiEvento().getMisRegistros()) {
			Cliente miCliente = registro.getCliente();
			if (miCliente.getRespuestas().get(pregunta)==res) {
				cont++;
			}
		}
		return cont;
	}
}
