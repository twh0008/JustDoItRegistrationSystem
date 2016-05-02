package registration.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import admin.homepage.AdminView;
import professor.homepage.ProfessorView;
import student.homepage.StudentHomeController;
import student.homepage.StudentView;
import support.Administrator;
import support.Professor;
import support.Student;
import support.User;




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
							StudentView view = new StudentView();
							StudentHomeController controller = new StudentHomeController(view, std);
							view.setVisible(true);
							break;
						case 1:
							/*
							loginView.dispose();
							Professor prof = (Professor) user;
							ProfessorView view = new ProfessorView();
							ProfessorHomeController controller = new StudentHomeController(view, view);
							view.setVisible(true);
							*/
							break;
						case 0:
							/*
							loginView.dispose();
							Administrator admin = (Administrator) user;
							AdminView view = new AdminView();
							AdminHomeController controller = new StudentHomeController(view, admin);
							view.setVisible(true);
							*/
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
