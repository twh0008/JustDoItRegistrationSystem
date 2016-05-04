package student.homepage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import student.dropclass.DropClassController;
import student.dropclass.DropClassModel;
import student.dropclass.DropClassView;
import support.Student;
import support.User;

public class DropClassListener implements ActionListener {
	private Student user;
	
	public DropClassListener(Student user) {
		this.user = user;
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("Button CLicked in add");
		DropClassView view = new DropClassView();
		DropClassModel model = new DropClassModel(user);
		DropClassController control = new DropClassController(view, model);
		
		view.setVisible(true);

	}

}
