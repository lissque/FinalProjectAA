package co.uniquindio.interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;

public class Ingresar extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtIngreso;
	private JLabel lblIngresar;
	private JButton btnAcceder;
	private JButton btnVolver;

	private Home home;

	/**
	 * Create the frame.
	 */
	public Ingresar(Home home) {

		this.home = home;

		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 218, 185));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblIngresarId = new JLabel("INGRESAR ID:");
		lblIngresarId.setFont(new Font("Gabriola", Font.BOLD, 20));
		lblIngresarId.setBounds(37, 143, 122, 23);
		contentPane.add(lblIngresarId);

		txtIngreso = new JTextField();
		txtIngreso.setToolTipText("");
		txtIngreso.setFont(new Font("Gabriola", Font.PLAIN, 20));
		txtIngreso.setBounds(169, 143, 243, 23);
		contentPane.add(txtIngreso);
		txtIngreso.setColumns(10);

		btnAcceder = new JButton("\u221A");
		btnAcceder.addActionListener(this);
		btnAcceder.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAcceder.setBackground(Color.GREEN);
		btnAcceder.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnAcceder.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnAcceder.setBounds(422, 144, 42, 23);
		contentPane.add(btnAcceder);

		btnVolver = new JButton("VOLVER");
		btnVolver.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVolver.addActionListener(this);
		btnVolver.setFont(new Font("Gabriola", Font.BOLD, 20));
		btnVolver.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnVolver.setBounds(342, 235, 122, 31);
		contentPane.add(btnVolver);

		lblIngresar = new JLabel("INGRESAR");
		lblIngresar.setFont(new Font("Gabriola", Font.BOLD, 30));
		lblIngresar.setBounds(59, 43, 248, 36);
		contentPane.add(lblIngresar);
	}

	public Home getHome() {
		return home;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnAcceder) {

			String ingreso = txtIngreso.getText().toUpperCase();

			if (ingreso.length() > 0) {

				if (home.getMiEvento().getMisClientes().size() != 0) {

					for (int i = 0; i < home.getMiEvento().getMisClientes().size(); i++) {

						String cliente = home.getMiEvento().getMisClientes().get(i).getId().toUpperCase();

						if (ingreso.equals(cliente)) {

							this.dispose();
							Secciones ventanaMatrices = new Secciones(this);
							ventanaMatrices.setLocationRelativeTo(null);
							ventanaMatrices.setVisible(true);
							txtIngreso.setText("");

						} else {
							JOptionPane.showMessageDialog(null, "NO ESTA REGISTRADO", "ADVERTENCIA!",
									JOptionPane.WARNING_MESSAGE, null);
						}
					}
				} else {
					JOptionPane.showMessageDialog(null, "NO HAY CLIENTES REGISTRADOS", "ADVERTENCIA!",
							JOptionPane.WARNING_MESSAGE, null);
				}
			} else {
				JOptionPane.showMessageDialog(null, "CAMPO VACÍO", "ADVERTENCIA!", JOptionPane.WARNING_MESSAGE, null);
			}
		}

		if (e.getSource() == btnVolver) {

			this.dispose();
			home.setLocationRelativeTo(null);
			home.setVisible(true);
		}

	}
}
