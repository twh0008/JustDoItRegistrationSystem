package registration.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import admin.homepage.*;
import professor.homepage.*;
import student.homepage.*;
import support.*;




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
				
				
				User user = loginModel.verifyAccount();
				if(user == null){
					loginView.clearUsername();
					loginView.clearPassword();
					loginView.displayError("Username and Password Invalid");
				}
				else{
					switch(user.getUserType()){
				
						case 2:
							loginView.dispose();
							Student std = (Student) user;
							StudentView sView = new StudentView(std);
							StudentHomeController sController = new StudentHomeController(sView, std);
							sView.setVisible(true);
							break;
						case 1:
							
							loginView.dispose();
							Professor prof = (Professor) user;
							ProfessorView pView = new ProfessorView();
							ProfessorHomeController pController = new ProfessorHomeController(pView, prof);
							pView.setVisible(true);
							
							break;
						case 0:
							
							loginView.dispose();
							Administrator admin = (Administrator) user;
							AdminView aView = new AdminView();
							AdminHomeController aController = new AdminHomeController(aView, admin);
							aView.setVisible(true);
							
							break;
						default:
							break;
					}
				}
					
			}
			catch(IllegalArgumentException ex){
				loginView.displayError("Please enter Username AND Password");	
			}
			
		}	
	}
	
}
