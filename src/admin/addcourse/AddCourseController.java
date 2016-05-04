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
			
			
				courseName = view.getCourseName();
				courseCap = view.getSelectedCap();
				courseCredits = view.getSelectedCredits();
				courseDate = view.getSelectedDate();
				courseTime = view.getSelectedTime();
				courseTerm = view.getSelectedTerm();
				
				model.setCourseName(courseName);
				model.setCourseCap(courseCap);
				model.setCourseCredits(courseCredits);
				model.setCourseDate(courseDate);
				model.setCourseTime(courseTime);
				model.setCourseTerm(courseTerm);
				
				
				if(model.createCourse() == true) {
					view.displayMessage("Added Course Successfully!");
					view.dispose();
				} else {
					view.displayError("Please fill in ALL of the fields.");	
				}
				
			}
			
			
		}
		
	}

