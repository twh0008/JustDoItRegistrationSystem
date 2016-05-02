package admin.homepage;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AdminView extends JFrame{

	private JButton btRemoveCourse = new JButton("Remove Course");
	private JButton btAddCourse = new JButton("Add Course");
	private JButton btRemoveUser = new JButton("Remove User");
	private JButton btAddUser = new JButton("Add User");
	private JButton btUpdateRegistrationStatus = new JButton("Update Registration Status");

	public AdminView(){
		
		JPanel panel = new JPanel();
		this.setSize(800, 200);
		panel.add(btRemoveCourse);
		panel.add(btAddCourse);
		panel.add(btRemoveUser);
		panel.add(btAddUser);
		panel.add(btUpdateRegistrationStatus);
		
		this.add(panel);
		
	}
	
	public void addRemoveCourseListener(ActionListener listenForRemoveCourse){
		btRemoveCourse.addActionListener(listenForRemoveCourse);
	}
	
	public void addAddCourseListener(ActionListener listenForAddCourse){
		btAddCourse.addActionListener(listenForAddCourse);
	}
	public void addRemoveUserListener(ActionListener listenForRemoveUser){
		btRemoveUser.addActionListener(listenForRemoveUser);
	}
	public void addAddUserListener(ActionListener listenForAddUsers){
		btAddUser.addActionListener(listenForAddUsers);
	}
	public void addUpdateRegistrationStatusListener(ActionListener listenForRegistrationStatus){
		btUpdateRegistrationStatus.addActionListener(listenForRegistrationStatus);
	}
	
	
	
}
