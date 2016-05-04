package student.homepage;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.*;

import javax.swing.*;

import support.Student;

public class StudentView extends JFrame {
	private JButton btAddClass = new JButton("Add Class");
	private JButton btDropClass = new JButton("Drop Class");
	private JButton btViewSchedule = new JButton("View Schedule");
	private JButton btViewRegistrationStatus = new JButton("View Registration Status");
	private JButton btViewGrades = new JButton("View Grades");
	private JButton btSearchCourses = new JButton("Search Courses");
	public Student user;
	public String name;
	
	public StudentView(Student std){
		setTitle(std.getFirstName()+ " Homepage");
		this.user = std;
		name = user.getFirstName() + " "
				+ user.getLastName();
		
		
//		 JPanel studentPanel = new JPanel();
		 
			JPanel studentPanel = new JPanel(new GridBagLayout());
			GridBagConstraints constraints = new GridBagConstraints();
			constraints.anchor = GridBagConstraints.CENTER;
			constraints.insets = new Insets(5, 5, 5, 5);
			constraints.gridx = 0;
			constraints.gridy = 0;
			studentPanel.add(btAddClass, constraints);
			constraints.gridy = 1;
			studentPanel.add(btDropClass, constraints);
			constraints.gridy = 2;
			studentPanel.add(btViewSchedule, constraints);
			constraints.gridy = 3;
			studentPanel.add(btViewRegistrationStatus, constraints);
			constraints.gridy = 4;
			studentPanel.add(btViewGrades, constraints);
			constraints.gridy = 5;
			studentPanel.add(btSearchCourses, constraints);
			constraints.gridy = 6;
			pack();
			
		 
//			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setSize(600, 400);
			
//			studentPanel.add(btAddClass);
//			studentPanel.add(btDropClass);
//			studentPanel.add(btViewSchedule);
//			studentPanel.add(btViewRegistrationStatus);
//			studentPanel.add(btViewGrades);
//			studentPanel.add(btSearchCourses);
//			
			add(studentPanel);

	}
	
	public void addAddClassListener(ActionListener listenForAddClass){
		btAddClass.addActionListener(listenForAddClass);
	}
	
	public void addDropClassListener(ActionListener listenForDropClass){
		btDropClass.addActionListener(listenForDropClass);
	}
	
	public void addViewScheduleListener(ActionListener listenForViewSchedule){
		btViewSchedule.addActionListener(listenForViewSchedule);
	}
	
	public void addViewRegistrationStatusListener(ActionListener listenForViewReg){
		btViewRegistrationStatus.addActionListener(listenForViewReg);
	}
	
	public void addViewGradesListener(ActionListener listenForViewGrades){
		btViewGrades.addActionListener(listenForViewGrades);
	}
	
	public void addSearchCoursesListener(ActionListener listenForSearchCourses){
		btSearchCourses.addActionListener(listenForSearchCourses);
	}

}
