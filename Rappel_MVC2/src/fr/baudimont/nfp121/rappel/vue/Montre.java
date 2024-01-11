//package fr.baudimont.nfp121.rappel.vue;
//
//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import java.awt.BorderLayout;
//import javax.swing.JLabel;
//import javax.swing.JTextField;
//
//import fr.baudimont.nfp121.rappel.controller.Controller;
//import fr.baudimont.nfp121.rappel.dpobserve.IObservateur;
//
//import javax.swing.JButton;
//
//public class Montre implements IObservateur {
//
//	private JFrame frame;
//	private JTextField textField;
//	private JTextField textField_1;
//	private Controller cont;
//
//
//	/**
//	 * Create the application.
//	 */
//	public Montre(Controller pCont) {
//		this.cont = pCont;
//		initialize();
//	}
//
//	/**
//	 * Initialize the contents of the frame.
//	 */
//	private void initialize() {
//		frame = new JFrame();
//		frame.setBounds(100, 100, 450, 300);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		JPanel panel = new JPanel();
//		frame.getContentPane().add(panel, BorderLayout.CENTER);
//		
//		JLabel lblNewLabel = new JLabel("Nom");
//		panel.add(lblNewLabel);
//		
//		textField = new JTextField();
//		panel.add(textField);
//		textField.setColumns(10);
//		
//		JLabel lblNewLabel_1 = new JLabel("Prénom");
//		panel.add(lblNewLabel_1);
//		
//		textField_1 = new JTextField();
//		panel.add(textField_1);
//		textField_1.setColumns(10);
//		
//		JButton btnNewButton = new JButton("Valider");
//		panel.add(btnNewButton);
//	}
//	
//	public JFrame getFrame() {
//		return frame;
//	}
//	
//	
//
//}
