package co.uniquindio.interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Platea1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private Matrices inicio;
	private JButton btnVolver;

	/**
	 * Create the frame.
	 */
	public Platea1() {
		setUndecorated(true);
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 321, 185);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn00 = new JButton("00");
		btn00.setBounds(10, 11, 53, 23);
		contentPane.add(btn00);
		
		JButton btn10 = new JButton("10");
		btn10.setBounds(10, 45, 53, 23);
		contentPane.add(btn10);
		
		JButton btn11 = new JButton("11");
		btn11.setBounds(73, 45, 52, 23);
		contentPane.add(btn11);
		
		JButton btn20 = new JButton("20");
		btn20.setBounds(10, 79, 53, 23);
		contentPane.add(btn20);
		
		JButton btn21 = new JButton("21");
		btn21.setBounds(73, 79, 52, 23);
		contentPane.add(btn21);
		
		JButton btn22 = new JButton("22");
		btn22.setBounds(135, 79, 52, 23);
		contentPane.add(btn22);
		
		JButton btn30 = new JButton("30");
		btn30.setBounds(10, 113, 53, 23);
		contentPane.add(btn30);
		
		JButton btn31 = new JButton("31");
		btn31.setBounds(73, 113, 52, 23);
		contentPane.add(btn31);
		
		JButton btn32 = new JButton("32");
		btn32.setBounds(135, 113, 52, 23);
		contentPane.add(btn32);
		
		JButton btn33 = new JButton("33");
		btn33.setBounds(197, 113, 53, 23);
		contentPane.add(btn33);
		
		JButton btn40 = new JButton("40");
		btn40.setBounds(10, 147, 53, 23);
		contentPane.add(btn40);
		
		JButton btn41 = new JButton("41");
		btn41.setBounds(73, 147, 52, 23);
		contentPane.add(btn41);
		
		JButton btn42 = new JButton("42");
		btn42.setBounds(135, 147, 52, 23);
		contentPane.add(btn42);
		
		JButton btn43 = new JButton("43");
		btn43.setBounds(197, 147, 53, 23);
		contentPane.add(btn43);
		
		JButton btn44 = new JButton("44");
		btn44.setBounds(260, 147, 48, 23);
		contentPane.add(btn44);
		
		btnVolver = new JButton("\u21A7");
		btnVolver.setBounds(260, 11, 48, 23);
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
