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
import javax.swing.border.SoftBevelBorder;

public class ResultadosEstadisticas extends JFrame implements ActionListener {

	private JPanel contentPane;

	private Home home;

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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("VOLVER");
		button.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		button.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		button.setBounds(352, 270, 88, 19);
		contentPane.add(button);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
