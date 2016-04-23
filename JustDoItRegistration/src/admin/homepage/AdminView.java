package admin.homepage;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AdminView extends JFrame{

	private JButton btRemoveCourse = new JButton("Remove Course");
	private JButton btAddCourse = new JButton("Add Course");
	private JButton btRemoveUsers = new JButton("Remove Users");
	private JButton btAddUsers = new JButton("Add Users");
	private JButton btUpdateRegistrationStatus = new JButton("Update Registration Status");

	public AdminView(){
		
		JPanel panel = new JPanel();
		
		panel.add(btRemoveCourse);
		panel.add(btAddCourse);
		panel.add(btRemoveUsers);
		panel.add(btAddUsers);
		panel.add(btUpdateRegistrationStatus);
		
		this.add(panel);
		
	}
	
	public void addRemoveCourseListener(ActionListener listenForRemoveCourse){
		btRemoveCourse.addActionListener(listenForRemoveCourse);
	}
	
	public void addAddCourseListener(ActionListener listenForAddCourse){
		btRemoveCourse.addActionListener(listenForAddCourse);
	}
	public void addRemoveUsersListener(ActionListener listenForRemoveUsers){
		btRemoveCourse.addActionListener(listenForRemoveUsers);
	}
	public void addAddUsersListener(ActionListener listenForAddUsers){
		btRemoveCourse.addActionListener(listenForAddUsers);
	}
	public void addUpdateRegistrationStatusListener(ActionListener listenForRegistrationStatus){
		btRemoveCourse.addActionListener(listenForRegistrationStatus);
	}
	
	
	
}
