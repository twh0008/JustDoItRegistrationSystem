package student.homepage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import registration.viewschedule.ViewScheduleController;
import registration.viewschedule.ViewScheduleModel;
import registration.viewschedule.ViewScheduleView;

import support.Student;
import support.User;

public class ViewScheduleListener implements ActionListener {
	private Student user;
	
	public ViewScheduleListener(Student user) {
		this.user = user;
	}

	public void actionPerformed(ActionEvent e) {
		ViewScheduleView view = new ViewScheduleView();
		ViewScheduleModel model = new ViewScheduleModel(user);
		ViewScheduleController control = new ViewScheduleController(view, model);
		
		view.setVisible(true);


	}

}
