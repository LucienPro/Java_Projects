package Main_Package;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Cadran implements I_Observateur {
	
	private Bassin monBassin;
	private int valeur;
	JFrame frame;
	JLabel lblTemp;

	public Cadran() {
		initialize();
	}
	
	public Cadran(Bassin pBassin) {
		this();
		this.monBassin = pBassin;
	}
	
	private void initialize() {
		frame = new JFrame("Cadran");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("La températeur est de :");
		panel.add(lblNewLabel);
		
		lblTemp = new JLabel("");
		panel.add(lblTemp);
		
		
	}

	@Override
	public void miseAJour() {
		String val = String.valueOf(monBassin.getTemp());
		lblTemp.setText(val);
	}

	public void setMonBassin(Bassin monBassin) {
		this.monBassin = monBassin;
	}
	public void afficher() {
		System.out.println("Cadran :Nouvelle temperature : "  + valeur);
	}

	public JFrame getFrame() {
		return frame;
	}
}
