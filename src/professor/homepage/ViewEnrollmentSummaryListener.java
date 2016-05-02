package professor.homepage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import professor.viewenrollmentsummary.*;
import support.Professor;

public class ViewEnrollmentSummaryListener implements ActionListener {
private Professor user;

public ViewEnrollmentSummaryListener(Professor user) {
	this.user = user;

}

public void actionPerformed(ActionEvent ae) {
	System.out.println("Button Pressed");
	ViewEnrollmentSummaryView view = new ViewEnrollmentSummaryView();
	ViewEnrollmentSummaryModel model = new ViewEnrollmentSummaryModel();
	ViewEnrollmentSummaryController control = new ViewEnrollmentSummaryController(view, model);
}


}
