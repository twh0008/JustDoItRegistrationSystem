


import registration.login.LoginController;
import registration.login.LoginModel;
import registration.login.LoginView;

	public class JustDoItRegistration {

		public static void main(String[] args){
			
			

			DBConnect connect = new DBConnect();
			connect.connect();
			
			LoginView view = new LoginView();
			LoginModel model = new LoginModel();
			LoginController controller = new LoginController(view, model);
			
			view.setVisible(true);
			
			connect.disconnect();
			
			
			
		}
	}