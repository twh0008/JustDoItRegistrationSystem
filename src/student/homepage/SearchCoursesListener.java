package student.homepage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import student.searchcourse.*;
import support.Student;
import support.User;

public class SearchCoursesListener implements ActionListener {
	private Student user;
	
	public SearchCoursesListener(Student user) {
		this.user = user;
	}

	public void actionPerformed(ActionEvent e) {
		SearchCourseView view = new SearchCourseView();
		SearchCourseModel model = new SearchCourseModel();
		SearchCourseController control = new SearchCourseController(view, model);
		
		view.setVisible(true);

	}

}
