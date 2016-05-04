package admin.removeuser;

import java.awt.event.ActionListener;

import javax.swing.*;

public class RemoveUserView extends JFrame {
	private JLabel lbCnr = new JLabel("Enter User ID:");
	private JTextField _Cnr = new JTextField(5);
	private JButton btCnr = new JButton("Delete User");
	
	
	public RemoveUserView(){
		
		JPanel rcvPanel = new JPanel();
		
		//	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 200);
		
		rcvPanel.add(lbCnr);
		rcvPanel.add(_Cnr);
		rcvPanel.add(btCnr);
		
		this.add(rcvPanel);
		
	}
	
	public int getCRN(){
		return Integer.parseInt(_Cnr.getText());
	}
	
	public void addDropCnrListener(ActionListener cnrButtonListener){
		btCnr.addActionListener(cnrButtonListener);
	}
	
	public void displayError(String message){
		JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.INFORMATION_MESSAGE);
	}

	public void clearCRN() {
		_Cnr.setText("");
	}

	public void displayMessage(String message) {
		JOptionPane.showMessageDialog(this, message, "Alert", JOptionPane.INFORMATION_MESSAGE);
		
	}
}

