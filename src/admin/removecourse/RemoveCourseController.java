package admin.removecourse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import student.dropclass.DropClassController.DropCnrListener;

public class RemoveCourseController {

	private RemoveCourseView view;
	private RemoveCourseModel model;
	
	public RemoveCourseController(RemoveCourseView v, RemoveCourseModel m) {
		this.view = v;
		this.model = m;
		this.view.addDropCnrListener(new RemoveCourseListener());
	}
	
	public class RemoveCourseListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int crn = view.getCRN();
			boolean success = model.RemoveCourse(crn);
			
			if(!success){
				view.displayError("Could not Delete Course, Check to see if thats the,"
						+ " right CRN Number.");
				
			}
			else{
				view.displayMessage("Removed that Course!");
				view.clearCRN();
			}
			
			
		}
	
}
}