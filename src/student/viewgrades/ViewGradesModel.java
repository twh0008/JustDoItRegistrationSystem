package student.viewgrades;

import java.util.ArrayList;

import support.Student;

public class ViewGradesModel {

	private Student student;
	
	public ViewGradesModel(Student student){
		this.student = student;
		
	}
	
	public String[][] processGrades(){

		ArrayList<String> courses = student.getSchedule().getCourses();
		ArrayList<String> grades = student.getSchedule().getCoursesGrades();
		String[][] tableInfo = new String[courses.size()][2];
		
		for(int i = 0; i < courses.size(); i++){
			tableInfo[i][0] = courses.get(i);
			System.out.println(tableInfo[i][0]);
			tableInfo[i][1] = grades.get(i);
			System.out.println(tableInfo[i][1]);
		}
		System.out.println("Finished");
		return tableInfo;
	}
}
