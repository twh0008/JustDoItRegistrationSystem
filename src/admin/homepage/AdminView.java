package admin.homepage;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AdminView extends JFrame{
	private JLabel lbHello = new JLabel("Hello Administrator");
	private JButton btRemoveCourse = new JButton("Remove Course");
	private JButton btAddCourse = new JButton("Add Course");
	private JButton btRemoveUser = new JButton("Remove User");
	private JButton btAddUser = new JButton("Add User");
	private JButton btUpdateRegistrationStatus = new JButton("Update User Registration Status");
	private JButton btLogout = new JButton("Logout");

	public AdminView() {
		
		super("Administrator");
		JPanel panel = new JPanel(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(2, 2, 2, 2);
		constraints.gridx = 0;
		constraints.gridy = 2;
		panel.add(lbHello, constraints);
		constraints.gridx = 4;
		constraints.gridy = 0;
		constraints.anchor = GridBagConstraints.EAST;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		panel.add(btRemoveCourse, constraints);
		constraints.gridy = 1;
		panel.add(btAddCourse, constraints);
		constraints.gridy = 2;
		panel.add(btRemoveUser, constraints);
		constraints.gridy = 3;
		panel.add(btAddUser, constraints);
		constraints.gridy = 4;
		panel.add(btUpdateRegistrationStatus, constraints);
		constraints.anchor = GridBagConstraints.PAGE_END;
		constraints.gridy = 6;
		panel.add(btLogout, constraints);

		
		
		this.add(panel);
		pack();
		
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
	public void addLogoutListener(ActionListener listenForLogout){
		btLogout.addActionListener(listenForLogout);
	}

	public void displayMessage(String message) {
		JOptionPane.showMessageDialog(this, message, "Success", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	
	
}
