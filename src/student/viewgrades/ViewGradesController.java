package student.viewgrades;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewGradesController {
	private ViewGradesView view;
	private ViewGradesModel model;
	
	public ViewGradesController(ViewGradesView view, ViewGradesModel model) {

		this.view = view;
		this.model = model;
		this.view.addGetGradesListener(new GetGradesListener());
	}
	
	public class GetGradesListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			view.addJTable(model.processCourses());
		}

	}
}
