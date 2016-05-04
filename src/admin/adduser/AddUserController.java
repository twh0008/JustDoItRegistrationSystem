package admin.adduser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class AddUserController {

	private AddUserView view;
	private AddUserModel model;
	
	public AddUserController(AddUserView v, AddUserModel m) {
		this.view = v;
		this.model = m;
		
		this.view.addNewUserListener( new addNewUserListener());
	}
	
	class addNewUserListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			String userFirst = "";
			String userLast= "";
			String userName = "";
			String userPass = "";
			String userType = "";
			
			
			
				userFirst = view.getFirstName();
				userLast = view.getLastName();
				userName = view.getUserName();
				userPass = view.getUserPass();
				userType = view.getSelectedType();
	
				
				model.setUserFirst(userFirst);
				model.setUserLast(userLast);
				model.setUserName(userName);
				model.setUserPass(userPass);
				model.setUserType(userType);
				
				

				boolean t = model.createUser();
				if (t == true) 
				{
					view.displayMessage("Added user!");
					view.dispose();	
				} else {
					view.displayError("Please fill in ALL of the fields.");	
				}
				
				
			}
			
			
		}
		
	
}