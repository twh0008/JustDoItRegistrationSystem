package professor.entergrades;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EnterGradesView extends JFrame{
	private JLabel lbUser = new JLabel("Enter User ID:");
	private JTextField _User = new JTextField(5);
	private JLabel lbCrn = new JLabel("Enter CRN:");
	private JTextField _Crn = new JTextField(5);
	private JLabel lbGrade = new JLabel("Enter grade A, B, C, D, E, F:");
	private JTextField _Grade = new JTextField(1);
	private JButton btAddGrade = new JButton("Add the grade");
	private JPanel panel;
	
	public EnterGradesView(){
		this.setTitle("Enter Grades");
		panel = new JPanel();
		
		this.setSize(1000, 200);
		
		panel.add(lbUser);
		panel.add(_User);
		panel.add(lbCrn);
		panel.add(_Crn);
		panel.add(lbGrade);
		panel.add(_Grade);
		panel.add(btAddGrade);
		
		this.add(panel);
		
	}
	public int getCrn(){
		return Integer.parseInt(_Crn.getText());
	}
	public void clearCrn(){
		_Crn.setText("");
	}
	public String getGrade(){
		return _Grade.getText();
	}
	public void clearGrade(){
		_Grade.setText("");
	}
	public int getUser(){
		return Integer.parseInt(_User.getText());
	}
	public void clearUser(){
		_User.setText("");
	}
	
	public void addAddGradeListener(ActionListener listenForAddGrade){
		btAddGrade.addActionListener(listenForAddGrade);
	}
	
	public void displayError(String message){
		
		JOptionPane.showMessageDialog(this, message, "E", 
									JOptionPane.INFORMATION_MESSAGE);
	}
	public void displayMessage(String message){
		
		JOptionPane.showMessageDialog(this, message, "Alert", 
									JOptionPane.INFORMATION_MESSAGE);
	}
}
