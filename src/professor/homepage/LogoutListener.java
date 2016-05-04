package professor.homepage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;





import registration.login.LoginController;
import registration.login.LoginModel;
import registration.login.LoginView;
import student.homepage.StudentView;


public class LogoutListener implements ActionListener {

	ProfessorView v;
	
	public LogoutListener(ProfessorView v) {
		this.v = v;
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button Pressed");
		v.displayMessage("You've been logged out!");
		v.dispose();
		LoginView view = new LoginView();
		LoginModel model = new LoginModel();
		LoginController controller = new LoginController(view, model);
		view.setVisible(true);
		

	}

}