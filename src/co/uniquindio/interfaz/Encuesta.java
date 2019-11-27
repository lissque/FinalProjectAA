package co.uniquindio.interfaz;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import co.uniquindio.mundo.Respuesta;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.JInternalFrame;
import javax.swing.SwingConstants;
import java.awt.Component;

public class Encuesta extends JFrame implements ActionListener {

	private JPanel contentPane;
	private Home home;
	private JComboBox cbPregunta1;
	private JComboBox cbPregunta2;
	private JComboBox cbPregunta5;
	private JComboBox cbPregunta6;
	private JComboBox cbPregunta4;
	private JComboBox cbPregunta3;
	private JButton btnOk;

	/**
	 * Create the frame.
	 */
	public Encuesta(Home home) {
		this.home = home;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 776, 371);
		setResizable(false);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblEncuesta = new JLabel("ENCUESTA");
		lblEncuesta.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblEncuesta.setBounds(58, 26, 218, 39);
		contentPane.add(lblEncuesta);

		JLabel lblcalifiqueSuExperiencia = new JLabel();
		lblcalifiqueSuExperiencia.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblcalifiqueSuExperiencia.setText("\u00BFCalifique su experiencia en el proceso de compra de boletas?");
		lblcalifiqueSuExperiencia.setBounds(28, 162, 492, 14);
		contentPane.add(lblcalifiqueSuExperiencia);

		JLabel lblqueTanProbable = new JLabel();
		lblqueTanProbable.setText("\u00BFQue tan probable seria que usted siga comprando con nosotros?");
		lblqueTanProbable.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblqueTanProbable.setBounds(28, 187, 492, 18);
		contentPane.add(lblqueTanProbable);

		JLabel lblqueTanRapido = new JLabel();
		lblqueTanRapido.setText("\u00BFQue tan rapido considera que fue el servicio?");
		lblqueTanRapido.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblqueTanRapido.setBounds(28, 216, 492, 14);
		contentPane.add(lblqueTanRapido);

		JLabel lblqueTanVersatil = new JLabel();
		lblqueTanVersatil.setText("\u00BFQue tan versatil considera el manejo de la aplicacion?");
		lblqueTanVersatil.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblqueTanVersatil.setBounds(28, 245, 492, 14);
		contentPane.add(lblqueTanVersatil);

		JLabel lblqueTanProbable_1 = new JLabel();
		lblqueTanProbable_1.setText("\u00BFQue tan probable seria que recomendara esta aplicacion?");
		lblqueTanProbable_1.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblqueTanProbable_1.setBounds(28, 272, 492, 14);
		contentPane.add(lblqueTanProbable_1);

		JLabel lblqueTanSeguro = new JLabel();
		lblqueTanSeguro
				.setText("\u00BFQue tan seguro se sintio con el manejo sus datos y usando nuestras formas de pago?");
		lblqueTanSeguro.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblqueTanSeguro.setBounds(28, 297, 492, 18);
		contentPane.add(lblqueTanSeguro);

		cbPregunta1 = new JComboBox();
		cbPregunta1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		cbPregunta1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cbPregunta1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		cbPregunta1.setModel(new DefaultComboBoxModel(Respuesta.values()));
		cbPregunta1.setBounds(530, 161, 207, 20);
		contentPane.add(cbPregunta1);

		cbPregunta2 = new JComboBox();
		cbPregunta2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		cbPregunta2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		cbPregunta2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cbPregunta2.setModel(new DefaultComboBoxModel(Respuesta.values()));
		cbPregunta2.setBounds(530, 187, 207, 20);
		contentPane.add(cbPregunta2);

		cbPregunta3 = new JComboBox();
		cbPregunta3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		cbPregunta3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cbPregunta3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		cbPregunta3.setModel(new DefaultComboBoxModel(Respuesta.values()));
		cbPregunta3.setBounds(530, 214, 207, 20);
		contentPane.add(cbPregunta3);

		cbPregunta4 = new JComboBox();
		cbPregunta4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		cbPregunta4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cbPregunta4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		cbPregunta4.setModel(new DefaultComboBoxModel(Respuesta.values()));
		cbPregunta4.setBounds(530, 243, 207, 20);
		contentPane.add(cbPregunta4);

		cbPregunta5 = new JComboBox();
		cbPregunta5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		cbPregunta5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cbPregunta5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		cbPregunta5.setModel(new DefaultComboBoxModel(Respuesta.values()));
		cbPregunta5.setBounds(530, 270, 207, 20);
		contentPane.add(cbPregunta5);

		cbPregunta6 = new JComboBox();
		cbPregunta6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cbPregunta6.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		cbPregunta6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		cbPregunta6.setModel(new DefaultComboBoxModel(Respuesta.values()));
		cbPregunta6.setBounds(530, 297, 207, 20);
		contentPane.add(cbPregunta6);

		JLabel lblText = new JLabel(
				"Responda la siguiente encuesta teniendo en cuenta la escala linkert.s permite medir actitudes y conocer el grado de conformidad del encuestado ");
		lblText.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblText.setBounds(28, 94, 738, 14);
		contentPane.add(lblText);

		JLabel lblLaEscalaDe = new JLabel(
				" La escala de Likert es una herramienta de medici\u00F3n que, a diferencia de preguntas dicot\u00F3micas con respuesta s\u00ED/no, nos permite medir actitudes");
		lblLaEscalaDe.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblLaEscalaDe.setBounds(28, 72, 738, 17);
		contentPane.add(lblLaEscalaDe);

		JLabel lblYConocerEl = new JLabel(
				"con cualquier afirmaci\u00F3n que le propongamos, y conocer el grado de conformidad del encuestado con cualquier afirmaci\u00F3n que le propongamos.");
		lblYConocerEl.setHorizontalAlignment(SwingConstants.LEFT);
		lblYConocerEl.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblYConocerEl.setBounds(28, 114, 738, 14);
		contentPane.add(lblYConocerEl);

		btnOk = new JButton("OK");
		btnOk.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		btnOk.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnOk.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnOk.setBounds(330, 337, 89, 23);
		contentPane.add(btnOk);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(445, 62, -212, -21);
		contentPane.add(scrollPane);
		setLocationRelativeTo(null);
		btnOk.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnOk) {

			ArrayList<Respuesta> respuestas = new ArrayList<>();
			respuestas.add((Respuesta) cbPregunta1.getSelectedItem());
			respuestas.add((Respuesta) cbPregunta2.getSelectedItem());
			respuestas.add((Respuesta) cbPregunta3.getSelectedItem());
			respuestas.add((Respuesta) cbPregunta4.getSelectedItem());
			respuestas.add((Respuesta) cbPregunta5.getSelectedItem());
			respuestas.add((Respuesta) cbPregunta6.getSelectedItem());
			
			

			this.dispose();
			home.setVisible(true);
			home.setLocationRelativeTo(null);
		}
	}
}
