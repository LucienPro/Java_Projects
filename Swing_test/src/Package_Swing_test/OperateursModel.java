package Package_Swing_test;

import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

public class OperateursModel extends DefaultComboBoxModel {
	private ArrayList<String> operateurs;

	public OperateursModel() {
		super();
		operateurs = new ArrayList<String>();
		operateurs.add("+");
		operateurs.add("-");
		operateurs.add("*");
		operateurs.add("/");
	}

	public String getSelectedOperateur() {
		return (String) getSelectedItem();
	}

	@Override
	public Object getElementAt(int index) {
		return operateurs.get(index);
	}

	@Override
	public int getSize() {
		return operateurs.size();
	}

	@Override
	public int getIndexOf(Object element) {
		return operateurs.indexOf(element);
	}
}