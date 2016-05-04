package admin.homepage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import admin.removecourse.*;
import support.Administrator;

public class RemoveCourseListener implements ActionListener {
	private Administrator user;
	
	public RemoveCourseListener(Administrator user) {
	this.user = user;	
	}

	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button Pressed");
		RemoveCourseView view = new RemoveCourseView();
		RemoveCourseModel model = new RemoveCourseModel();
		RemoveCourseController control = new RemoveCourseController(view, model);
		
		view.setVisible(true);
	}

}
