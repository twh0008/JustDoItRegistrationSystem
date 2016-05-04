package admin.updateregistrationstatus;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.*;

public class UpdateRegistrationStatusView extends JFrame {
	
	private JLabel lbUserID = new JLabel("Enter UserID");
	private JTextField _UserID = new JTextField(20);
	private JLabel lbUserReg = new JLabel("Update Registration Status to: ");
	JComboBox regCombo;
	private JButton btnUpdate = new JButton("Update");
	
	public UpdateRegistrationStatusView() {
		
		
		JPanel updateRegPanel = new JPanel(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(10, 10, 10, 10);
		
		//userid
		constraints.gridx = 0;
		constraints.gridy = 0;
		updateRegPanel.add(lbUserID, constraints);
		constraints.gridx = 1;
		updateRegPanel.add(_UserID, constraints);
		
		//Reg
		DefaultComboBoxModel reg = new DefaultComboBoxModel();
		reg.addElement("True");
		reg.addElement("False");
		regCombo = new JComboBox(reg);
		regCombo.setSelectedIndex(0);
		constraints.gridx = 0;
		constraints.gridy = 1;
		updateRegPanel.add(lbUserReg, constraints);
		constraints.gridx = 1;
		constraints.gridy = 1;
		updateRegPanel.add(regCombo, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.gridwidth = 2;
		constraints.anchor = GridBagConstraints.CENTER;
		updateRegPanel.add(btnUpdate, constraints);
		
		add(updateRegPanel);
		pack();
		setLocationRelativeTo(null);
		
	}
	
	public int getUserID() {
		if(_UserID.getText().isEmpty()) throw new IllegalArgumentException();
		return Integer.parseInt(_UserID.getText());
	}
	public String getSelectedReg(){
		return (String) (regCombo.getSelectedItem());
	}
	public void UpdateRegListener(ActionListener listenForUpdateReg){
		btnUpdate.addActionListener(listenForUpdateReg);
	}

	public void displayError(String message) {
		JOptionPane.showMessageDialog(this, message, "Error", 
				JOptionPane.INFORMATION_MESSAGE);	
	}

	public void displayMessage(String message){
		JOptionPane.showMessageDialog(this, message, "Success", JOptionPane.INFORMATION_MESSAGE);
	}
	public void clearID() {
		_UserID.setText("");
	}

}