package professor.viewenrollmentsummary;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewEnrollmentSummaryController {

	private ViewEnrollmentSummaryView view;
	private ViewEnrollmentSummaryModel model;
	
	public ViewEnrollmentSummaryController(ViewEnrollmentSummaryView v, ViewEnrollmentSummaryModel m) {
		this.view = v;
		this.model = m;
		
		this.view.addGetCourseListener(new ListenForCourse());
		
	}
	
	public class ListenForCourse implements ActionListener {

		
		public void actionPerformed(ActionEvent arg0) {
			int crn = view.getCrn();
			
			model.setCrn(crn);
			
			view.addJTable(model.prepareTable());
			
		}
		
	}
	
}
