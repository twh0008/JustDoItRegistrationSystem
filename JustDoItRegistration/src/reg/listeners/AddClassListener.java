package reg.listeners;

import java.awt.event.ActionEvent;
import javax.swing.*;

import reg.controllers.AddClassController;
import reg.models.StudentModel;
import reg.views.AddClassView;

import java.awt.event.ActionListener;

public class AddClassListener implements ActionListener{

	public void actionPerformed(ActionEvent ae) {
		System.out.println("Count of listeners: " + ((JButton) ae.getSource()).getActionListeners().length);
		System.out.println("Button CLicked in add");
		AddClassView view = new AddClassView();
		StudentModel model = new StudentModel();
		AddClassController control = new AddClassController(view, model);
		
		view.setVisible(true);
		
	}

}