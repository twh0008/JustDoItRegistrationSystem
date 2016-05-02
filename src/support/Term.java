package support;

public class Term {

	private String startDate;
	private String endDate;
	private String semester;
	private int year;
	private Course[] courseAvailable;
	
	public Term(String startDate, String endDate, String semester, int year, Course[] courseAvailable) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.semester = semester;
		this.year = year;
		this.courseAvailable = courseAvailable;
	}

	public String getStartDate() {
		return startDate;
	}
	
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	public String getEndDate() {
		return endDate;
	}
	
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	public String getSemester() {
		return semester;
	}
	
	public void setSemester(String semester) {
		this.semester = semester;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public Course[] getCourseAvailable() {
		return courseAvailable;
	}
	
	public void setCourseAvailable(Course[] courseAvailable) {
		this.courseAvailable = courseAvailable;
	}
}
