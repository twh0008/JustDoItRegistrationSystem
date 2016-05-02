package student.homepage;
import java.awt.event.*;

import javax.swing.JFrame;

import support.Student;
import support.User;

public class StudentHomeController {
	private StudentView studentView;
	private Student user;

	                                                                                                                                                                     
	public StudentHomeController(StudentView studentView, Student user){
		this.studentView = studentView;
		this.user = user;

		this.studentView.addAddClassListener(new AddClassListener(user));
		this.studentView.addDropClassListener(new DropClassListener(user));
		this.studentView.addViewScheduleListener(new ViewScheduleListener(user));
		this.studentView.addViewRegistrationStatusListener(new ViewRegistrationStatusListener(user));
		this.studentView.addViewGradesListener(new ViewGradesListener(user));
		this.studentView.addSearchCoursesListener(new SearchCoursesListener(user));	
	}
	
	
	
}
