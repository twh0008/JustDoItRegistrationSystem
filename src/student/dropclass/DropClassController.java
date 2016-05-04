package student.dropclass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DropClassController {
	
	private DropClassView view;
	private DropClassModel model;

	public DropClassController(DropClassView view, DropClassModel model){
		this.view = view;
		this.model = model;
		
		this.view.addDropCnrListener(new DropCnrListener());
	}
	
	public class DropCnrListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int crn = view.getCRN();
			boolean success = model.DropClass(crn);
			
			if(!success){
				view.displayError("Could not Drop Class, Check to see if thats the,"
						+ " right CRN Number in your schedule tab or Check Reg Status.");
				
			}
			else{
				view.displayMessage("Dropped that Class!");
				view.clearCRN();
			}
			
			
		}
	}
}
