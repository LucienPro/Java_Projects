package fr.baudimont.nfp121.rappel.vue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

import fr.baudimont.nfp121.rappel.controller.Controller;
import fr.baudimont.nfp121.rappel.dpobserve.IObservateur;

import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class Cadran implements IObservateur{

	private JFrame frame;
	private JTextField textField;
	private Controller cont;
	private final Action action = new SwingAction();

	/**
	 * Create the application.
	 */
	public Cadran(Controller pCont) {
		this.cont = pCont;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 763, 465);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("New label");
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		String value = String.valueOf(cont.monOcean.getTemperature());
		textField.setText(value);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setAction(action);
		panel.add(btnNewButton);
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
	@Override
	public void miseAJour() {
		String value = String.valueOf(cont.monOcean.getTemperature());
		textField.setText(value);
	}


	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			String newValue = textField.getText();
			cont.monOcean.setTemperature(Integer.valueOf(newValue));
		}
	}
}
