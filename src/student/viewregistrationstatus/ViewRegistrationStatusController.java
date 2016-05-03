package student.viewregistrationstatus;

import support.Student;

public class ViewRegistrationStatusController {

	private ViewRegistrationStatusView view;
	private ViewRegistrationStatusModel model;
	
	public ViewRegistrationStatusController(ViewRegistrationStatusView view, ViewRegistrationStatusModel model) {

		this.view = view;
		this.model = model;
		updateStatus();
	}
	
	public void updateStatus(){
		view.setRegistrationStatus(model.getStatus());
	}
	
	
}
