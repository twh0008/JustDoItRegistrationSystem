package Professor.homepage;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ProfessorView extends JFrame{
	private JButton btViewEnrollmentSummary = new JButton("View Enrollment Summary");
	private JButton btViewSchedule = new JButton("View Schedule");
	private JButton btEnterGrades = new JButton("Enter Grades");
	
	public ProfessorView() {

		JPanel studentPanel = new JPanel();
		 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 200);
		

		studentPanel.add(btViewEnrollmentSummary);
		studentPanel.add(btViewSchedule);
		studentPanel.add(btEnterGrades);
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
}
