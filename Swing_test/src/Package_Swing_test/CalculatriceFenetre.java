package Package_Swing_test;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import javax.swing.JLabel;

public class CalculatriceFenetre extends JFrame {
	private JTextField field1;
	private JTextField field2;
	private JComboBox liste;
	private JLabel label;

	public CalculatriceFenetre() {
		super();
		build();// On initialise notre fenêtre
	}

	private void build() {
		setTitle("Calculatrice"); // On donne un titre à l'application
		setSize(400, 200); // On donne une taille à notre fenêtre
		setLocationRelativeTo(null); // On centre la fenêtre sur l'écran
		setResizable(false); // On interdit la redimensionnement de la fenêtre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // On dit à l'application de se fermer lors du
		setContentPane(buildContentPane());
	}

	private JPanel buildContentPane() {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setBackground(Color.white);
		field1 = new JTextField();
		field1.setColumns(10);
		panel.add(field1);
		liste = new JComboBox(new OperateursModel());
		panel.add(liste);
		field2 = new JTextField();
		field2.setColumns(10);
		panel.add(field2);
		JButton bouton = new JButton(new CalculAction(this, "Calculer"));
		panel.add(bouton);
		label = new JLabel("Résultat : Pas encore calculé");
		panel.add(label);
		return panel;
	}

	public JTextField getField1() {
		return field1;
	}

	public JTextField getField2() {
		return field2;
	}
	
	public OperateursModel getModelOperateurs(){
		 return (OperateursModel)liste.getModel();
		}

	public JLabel getLabel() {
		// TODO Auto-generated method stub
		return label;
	}




}
