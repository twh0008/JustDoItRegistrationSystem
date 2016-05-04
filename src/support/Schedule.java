package support;
import java.util.*;


public class Schedule {
	
	private ArrayList<String> courses;

	
	public Schedule(ArrayList<String> list){
		courses = list;
	}

	public ArrayList<String> getCourses() {
		return courses;
	}
	
	public void addCourse(String course){
		courses.add(course);
	}
	public void removeCourse(String course){
		courses.remove(course);
	}
	public void setCourses(ArrayList<String> courses) {
		this.courses = courses;
	}
	
}
