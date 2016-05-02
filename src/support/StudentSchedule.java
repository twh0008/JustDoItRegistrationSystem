package support;

import java.util.ArrayList;

public class StudentSchedule extends Schedule {
	private int credits;
	private int maxCredits;
	private ArrayList<String> coursesGrades;
	
	public StudentSchedule(ArrayList<String> list, int credits, int maxCredits, ArrayList<String> crsGrades){
		super(list);
		this.credits = credits;
		this.maxCredits = maxCredits;	
		this.setCoursesGrades(crsGrades);
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public int getMaxCredits() {
		return maxCredits;
	}

	public void setMaxCredits(int maxCredits) {
		this.maxCredits = maxCredits;
	}

	public ArrayList<String> getCoursesGrades() {
		return coursesGrades;
	}

	public void setCoursesGrades(ArrayList<String> coursesGrades) {
		this.coursesGrades = coursesGrades;
	}
	
}
