package admin.addcourse;
import java.awt.event.*;

import javax.swing.*;

public class AddCourseView extends JFrame {
	
	private JLabel lbCourseName = new JLabel("Enter Course Name:");
	private JTextField tfCourseName = new JTextField(20);
	private JLabel lbCourseId = new JLabel("Enter Course ID:");
	private JTextField tfCourseId = new JTextField(5);
	private JButton btnCnr = new JButton("Add Course");
	private JButton btnBack = new JButton("Back To Home");
	
	public AddCourseView() {
		
		JPanel coursePanel = new JPanel();
		this.setSize(800,200);
		coursePanel.add(lbCourseName);
		coursePanel.add(tfCourseName);
		coursePanel.add(lbCourseId);
		coursePanel.add(btnCnr);
		coursePanel.add(btnBack);
		this.add(coursePanel);
	}
	
	public void addCnrListener(ActionListener cnrButtonListener){
		btnCnr.addActionListener(cnrButtonListener);
	}
	
	public void AddBackListener(ActionListener backButtonListener){
		btnBack.addActionListener(backButtonListener);
	}
	

}