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

	public void setCourses(ArrayList<String> courses) {
		this.courses = courses;
	}
	
}