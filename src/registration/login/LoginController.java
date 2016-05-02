package registration.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import student.homepage.StudentHomeController;
import student.homepage.StudentView;




public class LoginController {
	
	private LoginView loginView;
	private LoginModel loginModel;
	
	public LoginController(LoginView loginView, LoginModel loginModel){
		this.loginView = loginView;
		this.loginModel = loginModel;

		
		this.loginView.addNewLoginListener(new LoginListener());
		
	}
	
	class LoginListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			String username = ""; 
			char[] password;
			try{
				username = loginView.getUsername();
				password = loginView.getPassword();
				
				loginModel.setPassword(password);
				loginModel.setUsername(username);
				
				
				int usertype = loginModel.verifyAccount();
				
				switch(usertype){
				
					case 2:
						loginView.dispose();
						StudentView view = new StudentView();
						StudentHomeController controller = new StudentHomeController(view);
						view.setVisible(true);
						break;
					case 1:
						// PROFESSOR
						break;
					case 0:
						// ADMIN
						break;
					case -1:
						loginView.clearUsername();
						loginView.clearPassword();
						loginView.displayError("Username and Password Invalid");
						break;
				}
				
					
			}
			catch(IllegalArgumentException ex){
				loginView.displayError("Please enter Username AND Password");	
			}
			
		}	
	}
	
}
