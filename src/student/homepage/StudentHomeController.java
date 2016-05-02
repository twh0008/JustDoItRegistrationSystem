package student.homepage;
import java.awt.event.*;

import javax.swing.JFrame;

public class StudentHomeController {
	private StudentView studentView;

	                                                                                                                                                                     
	public StudentHomeController(StudentView studentView){
		this.studentView = studentView;

		this.studentView.addAddClassListener(new AddClassListener());
		this.studentView.addDropClassListener(new DropClassListener());
		this.studentView.addViewScheduleListener(new ViewScheduleListener());
		this.studentView.addViewRegistrationStatusListener(new ViewRegistrationStatusListener());
		this.studentView.addViewGradesListener(new ViewGradesListener());
		this.studentView.addSearchCoursesListener(new SearchCoursesListener());	
	}
	
	
	
}
