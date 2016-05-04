package student.homepage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




import registration.login.LoginController;
import registration.login.LoginModel;
import registration.login.LoginView;


public class LogoutListener implements ActionListener {

	StudentView v;
	
	public LogoutListener(StudentView v) {
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