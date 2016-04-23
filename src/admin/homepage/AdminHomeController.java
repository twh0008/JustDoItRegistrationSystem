package admin.homepage;

public class AdminHomeController {

	private AdminView adminView;
	
	public AdminHomeController(AdminView adminView){
		
		this.adminView = adminView;
		
		this.adminView.addAddCourseListener(new AddCourseListener());
		this.adminView.addRemoveCourseListener(new RemoveCourseListener());
		this.adminView.addRemoveUsersListener(new RemoveUsersListener());
		this.adminView.addAddUsersListener(new AddUsersListener());
		this.adminView.addUpdateRegistrationStatusListener(new UpdateRegistrationStatusListener());
		
	}
}
