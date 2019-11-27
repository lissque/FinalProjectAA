package co.uniquindio.interfaz;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import co.uniquindio.mundo.Respuesta;

public class Encuesta extends JFrame implements ActionListener{

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
		setBounds(100, 100, 762, 308);
		setResizable(false);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblEncuesta = new JLabel("ENCUESTA");
		lblEncuesta.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblEncuesta.setBounds(336, 11, 101, 39);
		contentPane.add(lblEncuesta);

		JLabel label = new JLabel();
		label.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		label.setText("¿Califique su experiencia en el proceso de compra de boletas?");
		label.setBounds(28, 108, 370, 14);
		contentPane.add(label);
		
		JLabel lblqueTanProbable = new JLabel();
		lblqueTanProbable.setText("\u00BFQue tan probable seria que usted siga comprando con nosotros?");
		lblqueTanProbable.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblqueTanProbable.setBounds(28, 133, 381, 18);
		contentPane.add(lblqueTanProbable);
		
		JLabel lblqueTanRapido = new JLabel();
		lblqueTanRapido.setText("\u00BFQue tan rapido considera que fue el servicio?");
		lblqueTanRapido.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblqueTanRapido.setBounds(28, 162, 281, 14);
		contentPane.add(lblqueTanRapido);
		
		JLabel lblqueTanVersatil = new JLabel();
		lblqueTanVersatil.setText("\u00BFQue tan versatil considera el manejo de la aplicacion?");
		lblqueTanVersatil.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblqueTanVersatil.setBounds(28, 187, 370, 14);
		contentPane.add(lblqueTanVersatil);
		
		JLabel lblqueTanProbable_1 = new JLabel();
		lblqueTanProbable_1.setText("\u00BFQue tan probable seria que recomendara esta aplicacion?");
		lblqueTanProbable_1.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblqueTanProbable_1.setBounds(28, 220, 370, 14);
		contentPane.add(lblqueTanProbable_1);
		
		JLabel lblqueTanSeguro = new JLabel();
		lblqueTanSeguro.setText("\u00BFQue tan seguro se sintio con el manejo sus datos y usando nuestras formas de pago?");
		lblqueTanSeguro.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblqueTanSeguro.setBounds(25, 245, 492, 18);
		contentPane.add(lblqueTanSeguro);
		
		cbPregunta1 = new JComboBox();
		cbPregunta1.setModel(new DefaultComboBoxModel(Respuesta.values()));
		cbPregunta1.setBounds(563, 106, 146, 20);
		contentPane.add(cbPregunta1);
		
		cbPregunta2 = new JComboBox();
		cbPregunta2.setModel(new DefaultComboBoxModel(Respuesta.values()));
		cbPregunta2.setBounds(563, 133, 146, 20);
		contentPane.add(cbPregunta2);
		
		cbPregunta3 = new JComboBox();
		cbPregunta3.setModel(new DefaultComboBoxModel(Respuesta.values()));
		cbPregunta3.setBounds(563, 160, 146, 20);
		contentPane.add(cbPregunta3);
		
		cbPregunta4 = new JComboBox();
		cbPregunta4.setModel(new DefaultComboBoxModel(Respuesta.values()));
		cbPregunta4.setBounds(563, 185, 146, 20);
		contentPane.add(cbPregunta4);
		
		cbPregunta5 = new JComboBox();
		cbPregunta5.setModel(new DefaultComboBoxModel(Respuesta.values()));
		cbPregunta5.setBounds(563, 214, 146, 20);
		contentPane.add(cbPregunta5);
		
		cbPregunta6 = new JComboBox();
		cbPregunta6.setModel(new DefaultComboBoxModel(Respuesta.values()));
		cbPregunta6.setBounds(563, 245, 146, 20);
		contentPane.add(cbPregunta6);
		
		JLabel lblText = new JLabel("Responda la siguiente encuesta teniendo en cuenta la escala linkert.");
		lblText.setBounds(28, 42, 692, 18);
		contentPane.add(lblText);
		
		JLabel lblLaEscalaDe = new JLabel(" La escala de Likert es una herramienta de medici\u00F3n que, a diferencia de preguntas dicot\u00F3micas con respuesta s\u00ED/no, nos permite medir actitudes");
		lblLaEscalaDe.setBounds(28, 61, 709, 14);
		contentPane.add(lblLaEscalaDe);
		
		JLabel lblYConocerEl = new JLabel(" y conocer el grado de conformidad del encuestado con cualquier afirmaci\u00F3n que le propongamos.");
		lblYConocerEl.setBounds(28, 80, 692, 14);
		contentPane.add(lblYConocerEl);
		
		btnOk = new JButton("OK");
		btnOk.setBounds(28, 274, 89, 23);
		contentPane.add(btnOk);
		setLocationRelativeTo(null);
		btnOk.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnOk) {
			JOptionPane.showMessageDialog(null, "OK");
		}
	}
	
	
}
