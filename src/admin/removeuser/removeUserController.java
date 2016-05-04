package admin.removeuser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import admin.removecourse.RemoveCourseController.RemoveCourseListener;

public class RemoveUserController {
	private RemoveUserView view;
	private RemoveUserModel model;
	
	public RemoveUserController(RemoveUserView v, RemoveUserModel m) {
		this.view = v;
		this.model = m;
		this.view.addDropCnrListener(new RemoveUserListener());
	}
	public class RemoveUserListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int crn = view.getCRN();
			boolean success = model.RemoveUser(crn);
			
			if(!success){
				view.displayError("Could not Delete User!, Check to see if thats the,"
						+ " right ID Number.");
				
			}
			else{
				view.displayMessage("Removed that User!");
				view.clearCRN();
			}
			
			
		}
	
}

}