package professor.ViewPSchedule;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewPScheduleController {
	private ViewPScheduleView view;
	private ViewPScheduleModel model;
	
	public ViewPScheduleController(ViewPScheduleView v, ViewPScheduleModel m) {
		this.view = v;
		this.model = m;
		
		this.view.addGetPScheduleListener(new GetPScheduleListener());
	}
	
	public class GetPScheduleListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			

			view.addJTable(model.processSchedule(view.getSelected()));
		}

	}
}
