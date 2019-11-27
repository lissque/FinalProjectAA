package co.uniquindio.interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ClubFans extends JFrame implements ActionListener{

	private JPanel contentPane;
	private Matrices inicio;
	private JButton btnVolver;

	/**
	 * Create the frame.
	 */
	public ClubFans(Matrices inicio) {
		setUndecorated(true);
		setResizable(false);
		
		this.inicio = inicio;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 339, 225);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn00 = new JButton("00");
		btn00.setBounds(10, 55, 55, 23);
		contentPane.add(btn00);
		
		JButton btn01 = new JButton("01");
		btn01.setBounds(75, 55, 53, 23);
		contentPane.add(btn01);
		
		JButton btn02 = new JButton("02");
		btn02.setBounds(135, 55, 52, 23);
		contentPane.add(btn02);
		
		JButton btn03 = new JButton("03");
		btn03.setBounds(197, 55, 52, 23);
		contentPane.add(btn03);
		
		JButton btn04 = new JButton("04");
		btn04.setBounds(259, 55, 52, 23);
		contentPane.add(btn04);
		
		JButton btn10 = new JButton("10");
		btn10.setBounds(10, 89, 55, 23);
		contentPane.add(btn10);
		
		JButton btn11 = new JButton("11");
		btn11.setBounds(75, 89, 53, 23);
		contentPane.add(btn11);
		
		JButton btn12 = new JButton("12");
		btn12.setBounds(135, 89, 52, 23);
		contentPane.add(btn12);
		
		JButton btn13 = new JButton("13");
		btn13.setBounds(197, 89, 52, 23);
		contentPane.add(btn13);
		
		JButton btn14 = new JButton("14");
		btn14.setBounds(259, 89, 52, 23);
		contentPane.add(btn14);
		
		JButton btn20 = new JButton("20");
		btn20.setBounds(10, 123, 55, 23);
		contentPane.add(btn20);
		
		JButton btn21 = new JButton("21");
		btn21.setBounds(75, 123, 53, 23);
		contentPane.add(btn21);
		
		JButton btn22 = new JButton("22");
		btn22.setBounds(135, 123, 52, 23);
		contentPane.add(btn22);
		
		JButton btn23 = new JButton("23");
		btn23.setBounds(197, 123, 52, 23);
		contentPane.add(btn23);
		
		JButton btn24 = new JButton("24");
		btn24.setBounds(259, 123, 52, 23);
		contentPane.add(btn24);
		
		JButton btn30 = new JButton("30");
		btn30.setBounds(10, 157, 55, 23);
		contentPane.add(btn30);
		
		JButton btn31 = new JButton("31");
		btn31.setBounds(75, 157, 53, 23);
		contentPane.add(btn31);
		
		JButton btn32 = new JButton("32");
		btn32.setBounds(135, 157, 52, 23);
		contentPane.add(btn32);
		
		JButton btn33 = new JButton("33");
		btn33.setBounds(197, 157, 52, 23);
		contentPane.add(btn33);
		
		JButton btn34 = new JButton("34");
		btn34.setBounds(259, 157, 52, 23);
		contentPane.add(btn34);
		
		JButton btn40 = new JButton("40");
		btn40.setBounds(10, 191, 55, 23);
		contentPane.add(btn40);
		
		JButton btn41 = new JButton("41");
		btn41.setBounds(75, 191, 53, 23);
		contentPane.add(btn41);
		
		JButton btn42 = new JButton("42");
		btn42.setBounds(135, 191, 52, 23);
		contentPane.add(btn42);
		
		JButton btn43 = new JButton("43");
		btn43.setBounds(197, 191, 52, 23);
		contentPane.add(btn43);
		
		JButton btn44 = new JButton("44");
		btn44.addActionListener(this);			
		btn44.setBounds(259, 191, 52, 23);
		contentPane.add(btn44);
		
		btnVolver = new JButton("\u21A7");
		btnVolver.setBounds(279, 11, 48, 23);
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
