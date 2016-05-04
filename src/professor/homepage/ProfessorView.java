package professor.homepage;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ProfessorView extends JFrame{
	private JButton btViewEnrollmentSummary = new JButton("View Enrollment Summary");
	private JButton btViewSchedule = new JButton("View Schedule");
	private JButton btEnterGrades = new JButton("Enter Grades");
	private JButton btLogout = new JButton("Logout");
	
	public ProfessorView() {

		JPanel studentPanel = new JPanel();
		 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 200);
		

		studentPanel.add(btViewEnrollmentSummary);
		studentPanel.add(btViewSchedule);
		studentPanel.add(btEnterGrades);
		studentPanel.add(btLogout);
		this.add(studentPanel);
	}
	
	public void addViewEnrollmentSummary(ActionListener listenForAddEnrollment){
		btViewEnrollmentSummary.addActionListener(listenForAddEnrollment);
	}
	
	public void addViewSchedule(ActionListener listenForViewSchedule){
		btViewSchedule.addActionListener(listenForViewSchedule);
	}
	
	public void addEnterGrades(ActionListener listenForEnterGrades){
		btEnterGrades.addActionListener(listenForEnterGrades);
	}
	public void addLogoutListener(ActionListener listenForLogout){
		btLogout.addActionListener(listenForLogout);
	}

	public void displayMessage(String message) {
		JOptionPane.showMessageDialog(this, message, "Success", JOptionPane.INFORMATION_MESSAGE);
		
	}
}
