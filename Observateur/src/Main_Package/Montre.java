package Main_Package;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Montre implements I_Observateur {

	private Bassin obs;
	private int val;
	private JFrame frame;
	JLabel lblTemp;
	
	public Montre() {
		initialize();
	}
	
	public Montre(Bassin pObs) {
		this();
		this.obs = pObs;
	}
	private void initialize() {
		frame = new JFrame("Montre");
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
		String val = String.valueOf(obs.getTemp());
		lblTemp.setText(val);
	}

	

	public JFrame getFrame() {
		return frame;
	}

}
