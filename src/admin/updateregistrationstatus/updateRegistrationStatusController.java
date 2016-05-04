package admin.updateregistrationstatus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import admin.removecourse.RemoveCourseController.RemoveCourseListener;

public class UpdateRegistrationStatusController {

	private UpdateRegistrationStatusView view;
	private UpdateRegistrationStatusModel model;
	
	public UpdateRegistrationStatusController(UpdateRegistrationStatusView v, UpdateRegistrationStatusModel m) {
		this.view = v;
		this.model = m;
		this.view.UpdateRegListener(new UpdateRegListener());
	}
	
	public class UpdateRegListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int crn = view.getUserID();
			String status = view.getSelectedReg();
			if (status == "True") {
				status = "1";
			} else if (status == "False") {
				status = "0";
			}
			int iStatus = Integer.parseInt(status);
			
			boolean success = model.UpdateRegistration(crn, iStatus);
			
			if(!success){
				view.displayError("Could not Update Registration Status. Check to see if ");
				
			}
			else{
				view.displayMessage("Updated Registration Status!");
				view.clearID();
				view.dispose();
			}
			
			
		}
	
}
}