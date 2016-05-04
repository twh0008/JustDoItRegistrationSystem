package admin.addcourse;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.*;

import javax.swing.*;

public class AddCourseView extends JFrame {
	
	private JLabel lbCourseName = new JLabel("Enter Course Name:");
	private JTextField _CourseName = new JTextField(20);
	private JLabel lbCourseCap = new JLabel("Enter Course Capacity:");
	private JTextField _CourseCap = new JTextField(5);
	private JLabel lbCourseCredits = new JLabel("Enter Course Credits:");
	private JTextField _CourseCredits = new JTextField(5);
	private JLabel lbCourseDate = new JLabel("Enter Course Date:");
	private JTextField _CourseDate = new JTextField(5);
	private JLabel lbCourseTime = new JLabel("Enter Course Time:");
	private JTextField _CourseTime = new JTextField(5);
	private JLabel lbCourseTerm = new JLabel("Enter Course Term:");
	private JTextField _CourseTerm = new JTextField(5);
	private JButton btnAddCourse = new JButton("Add Course");
	private JButton btnBack = new JButton("Back To Home");
	
	JComboBox capCombo;
	public AddCourseView() {
		
		JPanel addCoursePanel = new JPanel(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(10, 10, 10, 10);
		
		//courseName
		constraints.gridx = 0;
		constraints.gridy = 0;
		addCoursePanel.add(lbCourseName, constraints);
		constraints.gridx = 1;
		addCoursePanel.add(_CourseName, constraints);
		//courseCap
		DefaultComboBoxModel cap = new DefaultComboBoxModel();
		cap.addElement("25");
		cap.addElement("30");
		cap.addElement("50");
		cap.addElement("75");
		capCombo = new JComboBox(cap);
		capCombo.setSelectedIndex(0);
		
		constraints.gridx = 0;
		constraints.gridy = 1;
		addCoursePanel.add(lbCourseCap, constraints);
		constraints.gridx = 1;
		constraints.gridy = 1;
		addCoursePanel.add(capCombo, constraints);
		//courseCredits
		constraints.gridx = 0;
		constraints.gridy = 2;
		addCoursePanel.add(lbCourseCredits, constraints);
		constraints.gridx = 1;
		constraints.gridy = 2;
		addCoursePanel.add(_CourseCredits, constraints);
		//courseDate
		constraints.gridx = 0;
		constraints.gridy = 3;
		addCoursePanel.add(lbCourseDate, constraints);
		constraints.gridx = 1;
		constraints.gridy = 3;
		addCoursePanel.add(_CourseDate, constraints);
		//courseTime
		constraints.gridx = 0;
		constraints.gridy = 4;
		addCoursePanel.add(lbCourseTime, constraints);
		constraints.gridx = 1;
		constraints.gridy = 4;
		addCoursePanel.add(_CourseTime, constraints);
		//courseTerm
		constraints.gridx = 0;
		constraints.gridy = 5;
		addCoursePanel.add(lbCourseTerm, constraints);
		constraints.gridx = 1;
		constraints.gridy = 5;
		addCoursePanel.add(_CourseTerm, constraints);
		
		//addUserBtn
		constraints.gridx = 0;
		constraints.gridy = 6;
		constraints.gridwidth = 2;
		constraints.anchor = GridBagConstraints.CENTER;
		addCoursePanel.add(btnAddCourse, constraints);
		
		add(addCoursePanel);
		pack();
		setLocationRelativeTo(null);
		
	}	
	public String getCourseName() {
		if(_CourseName.getText().isEmpty()) throw new IllegalArgumentException();
		return _CourseName.getText();
	}
	public String getSelectedCap(){
		return (String) capCombo.getSelectedItem();
	}
	
	public String getCourseCredits() {
		if(_CourseCredits.getText().isEmpty()) throw new IllegalArgumentException();
		return _CourseCredits.getText();
	}
	public String getCourseDate() {
		if(_CourseDate.getText().isEmpty()) throw new IllegalArgumentException();
		return _CourseDate.getText();
	}
	public String getCourseTime() {
		if(_CourseTime.getText().isEmpty()) throw new IllegalArgumentException();
		return _CourseTime.getText();
	}
	public String getCourseTerm() {
		if(_CourseTerm.getText().isEmpty()) throw new IllegalArgumentException();
		return _CourseTerm.getText();
	}
	
	public void addNewCourseListener(ActionListener listenForAddCourseButton){
		btnAddCourse.addActionListener(listenForAddCourseButton);
	}
	
	public void AddBackListener(ActionListener backButtonListener){
		btnBack.addActionListener(backButtonListener);
	}

	public void displayError(String message) {
		JOptionPane.showMessageDialog(this, message, "Error", 
				JOptionPane.INFORMATION_MESSAGE);
		
	}
	

}