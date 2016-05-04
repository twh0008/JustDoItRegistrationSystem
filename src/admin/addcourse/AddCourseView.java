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
	private JLabel lbCourseCredits = new JLabel("Enter Course Credits:");
	private JLabel lbCourseDate = new JLabel("Enter Course Date:");
	private JLabel lbCourseTime = new JLabel("Enter Course Time:");
	private JLabel lbCourseTerm = new JLabel("Enter Course Term:");
	private JButton btnAddCourse = new JButton("Add Course");
	private JButton btnBack = new JButton("Back To Home");
	
	JComboBox capCombo;
	JComboBox creditsCombo;
	JComboBox dateCombo;
	JComboBox timeCombo;
	JComboBox termCombo;
	@SuppressWarnings({ "unchecked", "rawtypes" })
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
		DefaultComboBoxModel credits = new DefaultComboBoxModel();
		credits.addElement("3");
		credits.addElement("4");
		creditsCombo = new JComboBox(credits);
		creditsCombo.setSelectedIndex(0);
		constraints.gridx = 1;
		constraints.gridy = 2;
		addCoursePanel.add(creditsCombo, constraints);
		//courseDate
		constraints.gridx = 0;
		constraints.gridy = 3;
		DefaultComboBoxModel date = new DefaultComboBoxModel();
		date.addElement("MWF");
		date.addElement("TTR");
		dateCombo = new JComboBox(date);
		addCoursePanel.add(lbCourseDate, constraints);
		constraints.gridx = 1;
		constraints.gridy = 3;
		addCoursePanel.add(dateCombo, constraints);
		//courseTime
		constraints.gridx = 0;
		constraints.gridy = 4;
		DefaultComboBoxModel time = new DefaultComboBoxModel();
		time.addElement("8");
		time.addElement("9");
		time.addElement("10");
		time.addElement("11");
		time.addElement("12");
		time.addElement("1");
		time.addElement("2");
		time.addElement("3");
		timeCombo = new JComboBox(time);
		addCoursePanel.add(lbCourseTime, constraints);
		constraints.gridx = 1;
		constraints.gridy = 4;
		addCoursePanel.add(timeCombo, constraints);
		//courseTerm
		constraints.gridx = 0;
		constraints.gridy = 5;
		DefaultComboBoxModel term = new DefaultComboBoxModel();
		term.addElement("Spring 2016");
		term.addElement("Fall 2017");
		termCombo = new JComboBox(term);
		addCoursePanel.add(lbCourseTerm, constraints);
		constraints.gridx = 1;
		constraints.gridy = 5;
		addCoursePanel.add(termCombo, constraints);
		
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
	public String getSelectedCredits(){
		return (String) creditsCombo.getSelectedItem();
	}
	public String getSelectedDate(){
		return (String) dateCombo.getSelectedItem();
	}
	public String getSelectedTime(){
		return (String) timeCombo.getSelectedItem();
	}
	public String getSelectedTerm(){
		return (String) termCombo.getSelectedItem();
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
	public void displayMessage(String message){
		JOptionPane.showMessageDialog(this, message, "Success", JOptionPane.INFORMATION_MESSAGE);
	}
	

}