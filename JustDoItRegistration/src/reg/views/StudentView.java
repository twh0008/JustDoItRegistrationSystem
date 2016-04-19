package reg.views;

import java.awt.event.*;
import javax.swing.*;

public class StudentView extends JFrame {
	private JButton btAddClass = new JButton("Add Class");
	private JButton btDropClass = new JButton("Drop Class");
	private JButton btViewSchedule = new JButton("View Schedule");
	private JButton btViewRegistrationStatus = new JButton("View Registration Status");
	private JButton btViewGrades = new JButton("View Grades");
	private JButton btSearchCourses = new JButton("Search Courses");
	
	
	public StudentView(){
		 JPanel studentPanel = new JPanel();
		 
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setSize(800, 200);
			
			studentPanel.add(btAddClass);
			studentPanel.add(btDropClass);
			studentPanel.add(btViewSchedule);
			studentPanel.add(btViewRegistrationStatus);
			studentPanel.add(btViewGrades);
			studentPanel.add(btSearchCourses);
			
			this.add(studentPanel);

	}
	
	public void addAddClassListener(ActionListener listenForAddClass){
		btAddClass.addActionListener(listenForAddClass);
	}
	
	public void addDropClassListener(ActionListener listenForDropClass){
		btAddClass.addActionListener(listenForDropClass);
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
