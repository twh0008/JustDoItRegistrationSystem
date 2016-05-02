package admin.homepage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import admin.updateregistrationstatus.*;
import support.Administrator;

public class UpdateRegistrationStatusListener implements ActionListener {

	private Administrator user;
	
	public UpdateRegistrationStatusListener(Administrator a) {
	this.user = a;	
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button Pressed");
		updateRegistrationStatusView view = new updateRegistrationStatusView();
		updateRegistrationStatusModel model = new updateRegistrationStatusModel();
		updateRegistrationStatusController control = new updateRegistrationStatusController(view, model);
		
//		view.setVisible(true);
	}

}
