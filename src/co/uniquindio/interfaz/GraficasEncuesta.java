package co.uniquindio.interfaz;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import co.uniquindio.mundo.Registro;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Cursor;

public class GraficasEncuesta extends JFrame implements ActionListener{

	private JPanel contentPane;
	private Home home;
	private JButton btnPregunta1;

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
		btnPregunta1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPregunta1.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnPregunta1.setBounds(35, 73, 319, 29);
		contentPane.add(btnPregunta1);
		
		JButton btnGraficaPregunta = new JButton("GRAFICA PREGUNTA 2");
		btnGraficaPregunta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGraficaPregunta.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnGraficaPregunta.setBounds(35, 113, 319, 29);
		contentPane.add(btnGraficaPregunta);
		
		JButton btnGraficaPregunta_1 = new JButton("GRAFICA PREGUNTA 3");
		btnGraficaPregunta_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGraficaPregunta_1.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnGraficaPregunta_1.setBounds(35, 153, 319, 29);
		contentPane.add(btnGraficaPregunta_1);
		
		JButton btnGraficaPregunta_2 = new JButton("GRAFICA PREGUNTA 4");
		btnGraficaPregunta_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGraficaPregunta_2.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnGraficaPregunta_2.setBounds(35, 193, 319, 29);
		contentPane.add(btnGraficaPregunta_2);
		
		JButton btnGraficaPregunta_3 = new JButton("GRAFICA PREGUNTA 5");
		btnGraficaPregunta_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGraficaPregunta_3.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnGraficaPregunta_3.setBounds(35, 233, 319, 29);
		contentPane.add(btnGraficaPregunta_3);
		
		JButton btnGraficaPregunta_4 = new JButton("GRAFICA PREGUNTA 6");
		btnGraficaPregunta_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGraficaPregunta_4.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnGraficaPregunta_4.setBounds(35, 272, 319, 29);
		contentPane.add(btnGraficaPregunta_4);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVolver.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnVolver.setBounds(214, 312, 166, 29);
		contentPane.add(btnVolver);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	
	public int contar (int pregunta) {
		int cont = 0;
		for (Registro registro : home.getMiEvento().getMisRegistros()) {
			for (Cliente cliente : registro.get) {
				
			}
		}
	}
}
