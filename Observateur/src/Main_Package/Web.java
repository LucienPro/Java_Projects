package Main_Package;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class Web implements I_Observateur{

	private JFrame frame;
	private Bassin monBassin;
	private JLabel lblTemp;
	private final Action action = new SwingAction();
	private JTextField textField;


	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public Web() {
		initialize();
	}
	
	public Web(Bassin pBassin) {
		this();
		this.monBassin = pBassin;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Page Web");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("La températeur est de :");
		panel.add(lblNewLabel);
		
		lblTemp = new JLabel("");
		panel.add(lblTemp);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("Changer la température ");
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setAction(action);
		panel_1.add(btnNewButton);
	}

	public JFrame getFrame() {
		return frame;
	}
	
	@Override
	public void miseAJour() {
		String val = String.valueOf(monBassin.getTemp());
		lblTemp.setText(val);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Valider");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			monBassin.setTemp(Integer.parseInt(textField.getText()));
		}
	}
}

