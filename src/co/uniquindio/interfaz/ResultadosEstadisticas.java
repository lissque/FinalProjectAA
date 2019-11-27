package co.uniquindio.interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;

public class ResultadosEstadisticas extends JFrame implements ActionListener {

	private JPanel contentPane;

	private Home home;
	private JTextArea textArea;

	/**
	 * Create the frame.
	 */
	public ResultadosEstadisticas(Home home) {

		this.home = home;
		setResizable(false);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane.setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("VOLVER");
		button.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		button.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		button.setBounds(352, 270, 88, 19);
		contentPane.add(button);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(22, 23, 402, 236);
		contentPane.add(textArea);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}
}
