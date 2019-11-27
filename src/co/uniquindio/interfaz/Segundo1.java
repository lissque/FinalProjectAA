package co.uniquindio.interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Segundo1 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private Secciones inicio;
	private JButton btnVolver;

	/**
	 * Create the frame.
	 */
	public Segundo1(Secciones inicio) {
		setUndecorated(true);
		setResizable(false);
		
		this.inicio = inicio;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 220);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn00 = new JButton("00");
		btn00.setBounds(10, 11, 53, 23);
		contentPane.add(btn00);
		
		JButton btn01 = new JButton("01");
		btn01.setBounds(73, 11, 53, 23);
		contentPane.add(btn01);
		
		JButton btn02 = new JButton("02");
		btn02.setBounds(136, 11, 53, 23);
		contentPane.add(btn02);
		
		JButton btn03 = new JButton("03");
		btn03.setBounds(199, 11, 53, 23);
		contentPane.add(btn03);
		
		JButton btn04 = new JButton("04");
		btn04.setBounds(262, 11, 53, 23);
		contentPane.add(btn04);
		
		JButton btn11 = new JButton("11");
		btn11.setBounds(73, 45, 53, 23);
		contentPane.add(btn11);
		
		JButton btn12 = new JButton("12");
		btn12.setBounds(136, 45, 53, 23);
		contentPane.add(btn12);
		
		JButton btn13 = new JButton("13");
		btn13.setBounds(199, 45, 53, 23);
		contentPane.add(btn13);
		
		JButton btn14 = new JButton("14");
		btn14.setBounds(262, 45, 53, 23);
		contentPane.add(btn14);
		
		JButton btn22 = new JButton("22");
		btn22.setBounds(136, 79, 53, 23);
		contentPane.add(btn22);
		
		JButton btn23 = new JButton("23");
		btn23.setBounds(199, 79, 53, 23);
		contentPane.add(btn23);
		
		JButton btn24 = new JButton("24");
		btn24.setBounds(262, 79, 53, 23);
		contentPane.add(btn24);
		
		JButton btn33 = new JButton("33");
		btn33.setBounds(199, 113, 53, 23);
		contentPane.add(btn33);
		
		JButton btn34 = new JButton("34");
		btn34.setBounds(262, 113, 53, 23);
		contentPane.add(btn34);
		
		JButton btn44 = new JButton("44");
		btn44.setBounds(262, 147, 53, 23);
		contentPane.add(btn44);
		
		btnVolver = new JButton("\u21A7");
		btnVolver.setBounds(10, 147, 48, 23);
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
