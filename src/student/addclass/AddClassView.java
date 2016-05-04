package student.addclass;
import java.awt.event.*;
import javax.swing.*;

public class AddClassView extends JFrame {

	private JLabel lbCrn = new JLabel("Enter CRN:");
	private JTextField _Crn = new JTextField(5);
	private JButton btCrn = new JButton("Add Course");
	
	
	public AddClassView(){
		
		JPanel acvPanel = new JPanel();
		
		//	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 200);
		
		acvPanel.add(lbCrn);
		acvPanel.add(_Crn);
		acvPanel.add(btCrn);
		
		this.add(acvPanel);
		
	}
	
	public void clearCRN(){
		_Crn.setText("");
	}
	public int getCRN(){
		return Integer.parseInt(_Crn.getText());
	}
	
	public void addCnrListener(ActionListener cnrButtonListener){
		btCrn.addActionListener(cnrButtonListener);
	}
	
	public void displayError(String message){
		JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.INFORMATION_MESSAGE);
	}
	public void displayMessage(String message){
		JOptionPane.showMessageDialog(this, message, "Success", JOptionPane.INFORMATION_MESSAGE);
	}
}

