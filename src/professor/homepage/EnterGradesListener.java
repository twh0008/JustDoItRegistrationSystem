package professor.homepage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import professor.entergrades.*;
import support.Professor;

public class EnterGradesListener implements ActionListener {

	private Professor user;
	public EnterGradesListener(Professor user) {
		this.user = user;
		
	}
	public void actionPerformed(ActionEvent ae) {
		System.out.println("Button Pressed");
		EnterGradesView view = new EnterGradesView();
		EnterGradesModel model = new EnterGradesModel(user);
		EnterGradesController control = new EnterGradesController(view, model);

		view.setVisible(true);
	}

}
