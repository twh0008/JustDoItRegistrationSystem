package student.homepage;

import java.awt.event.ActionEvent;
import javax.swing.*;

import student.addclass.AddClassController;
import student.addclass.AddClassModel;
import student.addclass.AddClassView;

import java.awt.event.ActionListener;

public class AddClassListener implements ActionListener{

	public void actionPerformed(ActionEvent ae) {
		System.out.println("Count of listeners: " + ((JButton) ae.getSource()).getActionListeners().length);
		System.out.println("Button CLicked in add");
		AddClassView view = new AddClassView();
		AddClassModel model = new AddClassModel();
		AddClassController control = new AddClassController(view, model);
		
		view.setVisible(true);
		
	}

}