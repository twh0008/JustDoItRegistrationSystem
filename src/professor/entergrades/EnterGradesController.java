package professor.entergrades;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnterGradesController {
	private EnterGradesView view;
	private EnterGradesModel model;
	
public EnterGradesController(EnterGradesView gradesView, EnterGradesModel gradesModel) {
	this.view = gradesView;
	this.model = gradesModel;
	
	this.view.addAddGradeListener(new AddGradeListener());
	
}
public class AddGradeListener implements ActionListener{

	
	public void actionPerformed(ActionEvent arg0) {
		int userid = view.getUser();
		String grade = view.getGrade();
		int crn = view.getCrn();
		model.setId(userid);
		model.setGrade(grade);
		model.setCrn(crn);
		
		if(model.addGrade()){
			view.displayMessage("Added the Grade");
			view.clearGrade();
			view.clearCrn();
			view.clearUser();
		}
		else{
			view.displayError("Something went wrong, check to "
					+ "see if all the information is correct");
		}
	}
	
}
	
}
