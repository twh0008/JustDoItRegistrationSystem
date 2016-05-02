package admin.homepage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import admin.removeuser.*;
import support.Administrator;

public class RemoveUserListener implements ActionListener {
	private Administrator user;
	
	public RemoveUserListener(Administrator a) {
		this.user = a;
	}


	public void actionPerformed(ActionEvent e) {
		System.out.println("Remove User Btn Pressed");
		removeUserView view = new removeUserView();
		removeUserModel model = new removeUserModel();
		removeUserController control = new removeUserController(view, model);
		

	}

}
