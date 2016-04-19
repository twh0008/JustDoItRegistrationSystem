
import reg.controllers.LoginController;
import reg.models.LoginModel;
import reg.views.LoginView;

	public class JustDoItRegistration {

		public static void main(String[] args){
			
			LoginView view = new LoginView();
			LoginModel model = new LoginModel();
			LoginController controller = new LoginController(view, model);
			
			view.setVisible(true);
			
			
			
		}
	}