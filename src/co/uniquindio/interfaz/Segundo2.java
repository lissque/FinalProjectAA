package co.uniquindio.interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;

public class Segundo2 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private Secciones inicio;
	private JButton btnVolver;

	/**
	 * Create the frame.
	 */
	public Segundo2(Secciones inicio) {
		setUndecorated(true);
		setResizable(false);
		
		this.inicio = inicio;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 230);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn00 = new JButton("00");
		btn00.setBounds(10, 11, 52, 23);
		contentPane.add(btn00);
		
		JButton btn01 = new JButton("01");
		btn01.setBounds(72, 11, 52, 23);
		contentPane.add(btn01);
		
		JButton btn02 = new JButton("02");
		btn02.setBounds(134, 11, 52, 23);
		contentPane.add(btn02);
		
		JButton btn03 = new JButton("03");
		btn03.setBounds(196, 11, 52, 23);
		contentPane.add(btn03);
		
		JButton btn04 = new JButton("04");
		btn04.setBounds(258, 11, 52, 23);
		contentPane.add(btn04);
		
		JButton btn10 = new JButton("10");
		btn10.setBounds(10, 45, 52, 23);
		contentPane.add(btn10);
		
		JButton btn11 = new JButton("11");
		btn11.setBounds(72, 45, 52, 23);
		contentPane.add(btn11);
		
		JButton btn12 = new JButton("12");
		btn12.setBounds(134, 45, 52, 23);
		contentPane.add(btn12);
		
		JButton btn13 = new JButton("13");
		btn13.setBounds(196, 45, 52, 23);
		contentPane.add(btn13);
		
		JButton btn20 = new JButton("20");
		btn20.setBounds(10, 79, 52, 23);
		contentPane.add(btn20);
		
		JButton btn21 = new JButton("21");
		btn21.setBounds(72, 79, 52, 23);
		contentPane.add(btn21);
		
		JButton btn22 = new JButton("22");
		btn22.setBounds(134, 79, 52, 23);
		contentPane.add(btn22);
		
		JButton btn30 = new JButton("30");
		btn30.setBounds(10, 113, 52, 23);
		contentPane.add(btn30);
		
		JButton btn31 = new JButton("31");
		btn31.setBounds(72, 113, 52, 23);
		contentPane.add(btn31);
		
		JButton btn40 = new JButton("40");
		btn40.setBounds(10, 147, 52, 23);
		contentPane.add(btn40);
		
		btnVolver = new JButton("\u21A7");
		btnVolver.setBounds(262, 147, 48, 23);
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
