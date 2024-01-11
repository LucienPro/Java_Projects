package fr.nfp121.baudimont.dp.observe.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.nfp121.baudimont.dp.observe.controller.Controlleur;
import fr.nfp121.baudimont.dp.observe.dpobserve.IObservateur;
import fr.nfp121.baudimont.dp.observe.model.Bassin;

public class Montre implements IObservateur {

	private Bassin obs;
	private int val;
	private JFrame frame;
	JLabel lblTemp;
	private Controlleur monControl;
	
	public Montre() {
		initialize();
	}
	
	public Montre(Bassin pObs) {
		this();
		this.obs = pObs;
	}
	
	public Montre(Controlleur pCont) {
		this();
		this.monControl  = pCont;
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
		//String val = String.valueOf(obs.getTemp());
		String val = String.valueOf(monControl.getMonBassin().getTemp());
		lblTemp.setText(val);
	}

	

	public JFrame getFrame() {
		return frame;
	}

	public Controlleur getMonControl() {
		return monControl;
	}

}
