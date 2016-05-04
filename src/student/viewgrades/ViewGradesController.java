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
		
			String[][] data = model.processGrades();
			if(data == null){
				view.displayError("You don't have anys Courses");
			}
			else{
				view.addJTable(model.processGrades());
			}
		}

	}
}
