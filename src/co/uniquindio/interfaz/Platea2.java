package co.uniquindio.interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Platea2 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private Matrices inicio;
	private JButton btnVolver;

	/**
	 * Create the frame.
	 */
	public Platea2(Matrices inicio) {
		setUndecorated(true);
		setResizable(false);
		
		this.inicio = inicio;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 200);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn04 = new JButton("04");
		btn04.setBounds(255, 11, 53, 23);
		contentPane.add(btn04);
		
		JButton btn13 = new JButton("13");
		btn13.setBounds(193, 45, 52, 23);
		contentPane.add(btn13);
		
		JButton btn14 = new JButton("14");
		btn14.setBounds(255, 45, 53, 23);
		contentPane.add(btn14);
		
		JButton btn22 = new JButton("22");
		btn22.setBounds(130, 79, 53, 23);
		contentPane.add(btn22);
		
		JButton btn23 = new JButton("23");
		btn23.setBounds(193, 79, 52, 23);
		contentPane.add(btn23);
		
		JButton btn24 = new JButton("24");
		btn24.setBounds(255, 79, 53, 23);
		contentPane.add(btn24);
		
		JButton btn31 = new JButton("31");
		btn31.setBounds(67, 113, 53, 23);
		contentPane.add(btn31);
		
		JButton btn32 = new JButton("32");
		btn32.setBounds(130, 113, 53, 23);
		contentPane.add(btn32);
		
		JButton btn33 = new JButton("33");
		btn33.setBounds(193, 113, 52, 23);
		contentPane.add(btn33);
		
		JButton btn34 = new JButton("34");
		btn34.setBounds(255, 113, 53, 23);
		contentPane.add(btn34);
		
		JButton btn40 = new JButton("40");
		btn40.setBounds(10, 147, 53, 23);
		contentPane.add(btn40);
		
		JButton btn41 = new JButton("41");
		btn41.setBounds(67, 147, 53, 23);
		contentPane.add(btn41);
		
		JButton btn42 = new JButton("42");
		btn42.setBounds(130, 147, 53, 23);
		contentPane.add(btn42);
		
		JButton btn43 = new JButton("43");
		btn43.setBounds(193, 147, 52, 23);
		contentPane.add(btn43);
		
		JButton btn44 = new JButton("44");
		btn44.setBounds(255, 147, 53, 23);
		contentPane.add(btn44);
		
		btnVolver = new JButton("\u21A7");
		btnVolver.setBounds(10, 11, 48, 23);
		btnVolver.addActionListener(this);
		contentPane.add(btnVolver);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == btnVolver) {
			this.dispose();
		}
		
	}
}
