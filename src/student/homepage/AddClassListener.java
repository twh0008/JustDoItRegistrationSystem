package student.homepage;

import java.awt.event.ActionEvent;
import javax.swing.*;

import student.addclass.AddClassController;
import student.addclass.AddClassModel;
import student.addclass.AddClassView;
import support.Student;
import support.User;

import java.awt.event.ActionListener;

public class AddClassListener implements ActionListener{
	private Student user;
	public AddClassListener(Student user) {
		this.user = user;
	}

	public void actionPerformed(ActionEvent ae) {
		System.out.println("Button CLicked in add");
		AddClassView view = new AddClassView();
		AddClassModel model = new AddClassModel(user);
		AddClassController control = new AddClassController(view, model);
		
		view.setVisible(true);
		
	}

}