package student.homepage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import student.viewgrades.ViewGradesController;
import student.viewgrades.ViewGradesModel;
import student.viewgrades.ViewGradesView;
import student.viewregistrationstatus.ViewRegistrationStatusController;
import student.viewregistrationstatus.ViewRegistrationStatusModel;
import student.viewregistrationstatus.ViewRegistrationStatusView;
import support.Student;
import support.User;

public class ViewGradesListener implements ActionListener {
	private Student user;
	
	public ViewGradesListener(Student user) {
		this.user = user;
	}

	public void actionPerformed(ActionEvent ae) {
		ViewGradesView view = new ViewGradesView();
		ViewGradesModel model = new ViewGradesModel(user);
		ViewGradesController control = new ViewGradesController(view, model);
		
		view.setVisible(true);
		
	}
}
