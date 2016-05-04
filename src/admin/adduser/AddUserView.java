package admin.adduser;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.*;

import javax.swing.*;

public class AddUserView extends JFrame {
	
	
	private JLabel lbUserFirstName = new JLabel("Enter First Name:");
	private JTextField _FirstName = new JTextField(20);
	private JLabel lbUserLastName = new JLabel("Enter Last Name:");
	private JTextField _LastName = new JTextField(20);
	private JLabel lbUserName = new JLabel("Enter desired username:");
	private JTextField _UserName = new JTextField(5);
	private JLabel lbUserPass = new JLabel("Enter desired password:");
	private JTextField _UserPass = new JTextField(20);
	//combo
	private JLabel lbUserType = new JLabel("Enter User Type:");
	private JButton btnAddUser = new JButton("Add User");
	private JButton btnBack = new JButton("Back To Home");
	
	JComboBox typesCombo;
	
	public AddUserView() {
		
		JPanel addUserPanel = new JPanel(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(10, 10, 10, 10);
		
		//firstName
		constraints.gridx = 0;
		constraints.gridy = 0;
		addUserPanel.add(lbUserFirstName, constraints);
		constraints.gridx = 1;
		addUserPanel.add(_FirstName, constraints);
		//lastName
		constraints.gridx = 0;
		constraints.gridy = 1;
		addUserPanel.add(lbUserLastName, constraints);
		constraints.gridx = 1;
		constraints.gridy = 1;
		addUserPanel.add(_LastName, constraints);
		//userName
		constraints.gridx = 0;
		constraints.gridy = 2;
		addUserPanel.add(lbUserName, constraints);
		constraints.gridx = 1;
		constraints.gridy = 2;
		addUserPanel.add(_UserName, constraints);
		//password
		constraints.gridx = 0;
		constraints.gridy = 3;
		addUserPanel.add(lbUserPass, constraints);
		constraints.gridx = 1;
		constraints.gridy = 3;
		addUserPanel.add(_UserPass, constraints);
		//usertype
		DefaultComboBoxModel types = new DefaultComboBoxModel();
		types.addElement("Admin");
		types.addElement("Professor");
		types.addElement("Student");
		typesCombo = new JComboBox(types);
		typesCombo.setSelectedIndex(0);
		constraints.gridx = 0;
		constraints.gridy = 4;
		addUserPanel.add(lbUserType, constraints);
		constraints.gridx = 1;
		constraints.gridy = 4;
		addUserPanel.add(typesCombo, constraints);

		//addUserBtn
		constraints.gridx = 0;
		constraints.gridy = 5;
		constraints.gridwidth = 2;
		constraints.anchor = GridBagConstraints.CENTER;
		addUserPanel.add(btnAddUser, constraints);
		
		add(addUserPanel);
		pack();
		setLocationRelativeTo(null);
		
	}
//	public AddUserView(boolean t) {
//		
//		if (t == true)
//		{
//			JLabel lbAcknowledged = new JLabel("User has been added successfully!");
//			JPanel addUserAck = new JPanel(new GridBagLayout());
//			GridBagConstraints constraints = new GridBagConstraints();
//			constraints.anchor = GridBagConstraints.CENTER;
//			constraints.insets = new Insets(10, 10, 10, 10);
//			constraints.gridx = 0;
//			constraints.gridy = 0;
//			addUserAck.add(lbAcknowledged, constraints);
//			JButton btnBack = new JButton("Back to Home");
//			constraints.gridy = 1;
//			addUserAck.add(btnBack, constraints);
//			
//		} else {
//			
//			
//		}
//		
//	}
	public String getFirstName() {
		if(_FirstName.getText().isEmpty()) throw new IllegalArgumentException();
		return _FirstName.getText();
	}
	public String getLastName() {
		if(_LastName.getText().isEmpty()) throw new IllegalArgumentException();
		return _LastName.getText();
	}
	public String getUserName() {
		if(_UserName.getText().isEmpty()) throw new IllegalArgumentException();
		return _UserName.getText();
	}
	public String getUserPass() {
		if(_UserPass.getText().isEmpty()) throw new IllegalArgumentException();
		return _UserPass.getText();
	}
	public String getSelectedType(){
		return (String) typesCombo.getSelectedItem();
	}
	public void addNewUserListener(ActionListener listenForAddUserButton){
		btnAddUser.addActionListener(listenForAddUserButton);
	}
	
	public void AddBackListener(ActionListener backButtonListener){
		btnBack.addActionListener(backButtonListener);
	}

	public void displayError(String message) {
		JOptionPane.showMessageDialog(this, message, "Error", 
				JOptionPane.INFORMATION_MESSAGE);
		
	}
	
}
	
