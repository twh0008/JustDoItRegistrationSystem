package admin.homepage;

import support.Administrator;

public class AdminHomeController {

	private AdminView adminView;
	private Administrator user;
	
	public AdminHomeController(AdminView v, Administrator a){
		
		this.adminView = v;
		this.user = a;
		
		this.adminView.addAddCourseListener(new AddCourseListener(user));
		this.adminView.addRemoveCourseListener(new RemoveCourseListener(user));
		this.adminView.addRemoveUserListener(new RemoveUserListener(user));
		this.adminView.addAddUserListener(new AddUserListener(user));
		this.adminView.addUpdateRegistrationStatusListener(new UpdateRegistrationStatusListener(user));
		this.adminView.addLogoutListener(new LogoutListener(v));
		
	}
}
