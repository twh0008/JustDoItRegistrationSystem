package admin.homepage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import admin.adduser.*;
import support.Administrator;

public class AddUserListener implements ActionListener {

	private Administrator user;
	
	public AddUserListener(Administrator a) {
		this.user = a;
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button Pressed");
		AddUserView view = new AddUserView();
		AddUserModel model = new AddUserModel();
		AddUserController control = new AddUserController(view, model);
		view.setVisible(true);

	}

}
