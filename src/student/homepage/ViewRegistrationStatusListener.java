package student.homepage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import student.viewregistrationstatus.ViewRegistrationStatusController;
import student.viewregistrationstatus.ViewRegistrationStatusModel;
import student.viewregistrationstatus.ViewRegistrationStatusView;
import support.Student;

public class ViewRegistrationStatusListener implements ActionListener {
	private Student user;
	public ViewRegistrationStatusListener(Student user) {
		this.user = user;
	}

	public void actionPerformed(ActionEvent ae) {
		System.out.println("Button CLicked in add");
		ViewRegistrationStatusView view = new ViewRegistrationStatusView();
		ViewRegistrationStatusModel model = new ViewRegistrationStatusModel(user);
		ViewRegistrationStatusController control = new ViewRegistrationStatusController(view, model);
		
		view.setVisible(true);
		
	}
}
