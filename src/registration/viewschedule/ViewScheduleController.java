package registration.viewschedule;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class ViewScheduleController {
	private ViewScheduleView view;
	private ViewScheduleModel model;
	
	public ViewScheduleController(ViewScheduleView view, ViewScheduleModel model) {

		this.view = view;
		this.model = model;
		this.view.addGetScheduleListener(new GetScheduleListener());
	}
	
	public class GetScheduleListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			

			view.addJTable(model.processSchedule(view.getSelected()));
		}

	}
}
