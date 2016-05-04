package admin.addcourse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCourseController {
	
	private AddCourseView view;
	private AddCourseModel model;
	
	public AddCourseController(AddCourseView view, AddCourseModel model) {
		this.view = view;
		this.model = model;
		
		this.view.addNewCourseListener( new addNewCourseListener());
	}

	
	class addNewCourseListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			String courseName = "";
			String courseCap = "";
			String courseCredits = "";
			String courseDate = "";
			String courseTime = "";
			String courseTerm = "";
			
			try {
				courseName = view.getCourseName();
				courseCap = view.getSelectedCap();
				courseCredits = view.getCourseCredits();
				courseDate = view.getCourseDate();
				courseTime = view.getCourseTime();
				courseTerm = view.getCourseTerm();
				
				model.setCourseName(courseName);
				model.setCourseCap(courseCap);
				model.setCourseCredits(courseCredits);
				model.setCourseDate(courseDate);
				model.setCourseTime(courseTime);
				model.setCourseTerm(courseTerm);
				
				//Change this later to bring up acknowledgment
				if(model.createCourse() == true) {
					view.dispose();
				}
				
			}	catch(IllegalArgumentException ex){
				view.displayError("Please fill in ALL of the fields.");	
			}
				
			}
			
			
		}
		
	}

