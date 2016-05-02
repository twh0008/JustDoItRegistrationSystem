package support;

public class Course {
	private String courseName;
	private int courseId;
	private int courseSize;
	private int courseCapacity;
	private int courseCredits;
	private Student studentsEnrolled[];
	private Time courseTime;
	private Student waitList[];
	
	
	public Course(String courseName, int courseId, int courseSize, int courseCapacity, int courseCredits,
			Student[] studentsEnrolled, Time courseTime, Student[] waitList) {

		this.courseName = courseName;
		this.courseId = courseId;
		this.courseSize = courseSize;
		this.courseCapacity = courseCapacity;
		this.courseCredits = courseCredits;
		this.studentsEnrolled = studentsEnrolled;
		this.courseTime = courseTime;
		this.waitList = waitList;
	}

	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public int getCourseId() {
		return courseId;
	}
	
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	public int getCourseSize() {
		return courseSize;
	}
	
	public void setCourseSize(int courseSize) {
		this.courseSize = courseSize;
	}
	
	public int getCourseCapacity() {
		return courseCapacity;
	}
	
	public void setCourseCapacity(int courseCapacity) {
		this.courseCapacity = courseCapacity;
	}
	
	public int getCourseCredits() {
		return courseCredits;
	}
	
	public void setCourseCredits(int courseCredits) {
		this.courseCredits = courseCredits;
	}
	
	public Student[] getStudentsEnrolled() {
		return studentsEnrolled;
	}
	
	public void setStudentsEnrolled(Student studentsEnrolled[]) {
		this.studentsEnrolled = studentsEnrolled;
	}
	
	public Time getCourseTime() {
		return courseTime;
	}
	
	public void setCourseTime(Time courseTime) {
		this.courseTime = courseTime;
	}
	
	public Student[] getWaitList() {
		return waitList;
	}
	
	public void setWaitList(Student waitList[]) {
		this.waitList = waitList;
	}
}
