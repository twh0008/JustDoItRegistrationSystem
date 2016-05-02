package admin.homepage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import admin.addcourse.*;
import support.Administrator;

public class AddCourseListener implements ActionListener {

	private Administrator user;
	
	public AddCourseListener(Administrator user) {
		this.user = user;
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button Pressed");
		AddCourseView view = new AddCourseView();
		AddCourseModel model = new AddCourseModel();
		AddCourseController control = new AddCourseController(view, model);
		
		view.setVisible(true);

	}

}
