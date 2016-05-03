package student.viewregistrationstatus;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ViewRegistrationStatusView extends JFrame{


	private JLabel lbStatus = new JLabel("Your Registration Status is:");
	private JLabel lbUpdate = new JLabel("");

	
	
	public ViewRegistrationStatusView(){
		this.setTitle("Registration Status");
		JPanel acvPanel = new JPanel();
		
		//	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 200);
		
		acvPanel.add(lbStatus);
		acvPanel.add(lbUpdate);

		
		this.add(acvPanel);
		
	}
	
	void setRegistrationStatus(boolean status){
		if(status){
			lbUpdate.setText("True,"
					+ " feel free to register.");	
		}
		else{
			lbUpdate.setText("False,"
					+ " check with your advisor.");
		}
	}
	
	public void displayError(String message){
		JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.INFORMATION_MESSAGE);
	}
}
