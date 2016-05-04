package student.addclass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


public class AddClassController{
	
	private AddClassView view;
	private AddClassModel model;

	public AddClassController(AddClassView view, AddClassModel model){
		this.view = view;
		this.model = model;
		
		this.view.addCnrListener(new CnrListener());
	}
	
	public class CnrListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int crn = view.getCRN();
			boolean success = model.addClass(crn);
			
			if(!success){
				view.displayError("Could not Add Class, Check registration status,"
						+ " credits, etc");
				
			}
			else{
				view.displayMessage("Added that Class!");
				view.clearCRN();
			}
			
			
		}
	}

}
