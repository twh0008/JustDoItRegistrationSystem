package student.addclass;
import java.awt.event.*;
import javax.swing.*;

public class AddClassView extends JFrame {

	private JLabel lbCnr = new JLabel("Enter CRN:");
	private JTextField _Cnr = new JTextField(5);
	private JButton btCnr = new JButton("Add Course");
	
	
	public AddClassView(){
		
		JPanel acvPanel = new JPanel();
		
		//	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 200);
		
		acvPanel.add(lbCnr);
		acvPanel.add(_Cnr);
		acvPanel.add(btCnr);
		
		this.add(acvPanel);
		
	}
	
	public int getCRN(){
		return Integer.parseInt(_Cnr.getText());
	}
	
	public void addCnrListener(ActionListener cnrButtonListener){
		btCnr.addActionListener(cnrButtonListener);
	}
	
	public void displayError(String message){
		JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.INFORMATION_MESSAGE);
	}
}

