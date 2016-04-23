package student.addclass;

import javax.swing.JFrame;


public class AddClassController{
	
	private AddClassView addClassView;
	private AddClassModel addClassModel;

	
	public AddClassController(AddClassView addClassView, AddClassModel addClassModel){
		this.addClassView = addClassView;
		this.addClassModel = addClassModel;
		
		//this.addClassView.addCnrListener(new CnrListener(this.addClassView, this.studentModel));
		//this.addClassView.AddBackListener(new BackListener(this.userModel));
	}

}
