package student.searchcourse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SearchCourseController {
	private SearchCourseView view;
	private SearchCourseModel model;
	
	public SearchCourseController(SearchCourseView view, SearchCourseModel model) {

		this.view = view;
		this.model = model;
		this.view.addGetCoursesListener(new GetCoursesListener());
	}
	
	public class GetCoursesListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
			System.out.println(view.getSelected());
			view.addJTable(model.processCourses(view.getSelected()));
		}

	}
}
