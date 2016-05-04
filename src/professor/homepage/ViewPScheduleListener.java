package professor.homepage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import professor.ViewPSchedule.*;

import support.Professor;

public class ViewPScheduleListener implements ActionListener {

private Professor user;

public ViewPScheduleListener(Professor user) {
	this.user = user;
	
}
	
	public void actionPerformed(ActionEvent ae) {
		System.out.println("Btn Pressed");

		ViewPScheduleView view = new ViewPScheduleView();
		ViewPScheduleModel model = new ViewPScheduleModel(user);
		ViewPScheduleController control = new ViewPScheduleController(view, model);
		
		view.setVisible(true);
	}

}
