package reg.controllers;

import javax.swing.JFrame;

import reg.models.StudentModel;
import reg.views.AddClassView;


public class AddClassController{
	
	private AddClassView addClassView;
	private StudentModel studentModel;

	
	public AddClassController(AddClassView addClassView, StudentModel studentModel){
		this.addClassView = addClassView;
		this.studentModel = studentModel;
		
		//this.addClassView.addCnrListener(new CnrListener(this.addClassView, this.studentModel));
		//this.addClassView.AddBackListener(new BackListener(this.userModel));
	}

}
