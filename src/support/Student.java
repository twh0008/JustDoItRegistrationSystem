package support;

public class Student extends User {

	private boolean regStatus;
	private int credits;
	private double gpa;
	private Schedule schedule;
	
	
	public Student(String firstName, String lastName, String username, String password, int userType, int userId,
			boolean regStatus, int credits, double gpa, Schedule schedule) {
		super(firstName, lastName, username, password, userType, userId);
		this.regStatus = regStatus;
		this.credits = credits;
		this.gpa = gpa;
		this.schedule = schedule;
	}

	public boolean isRegStatus() {
		return regStatus;
	}
	
	public void setRegStatus(boolean regStatus) {
		this.regStatus = regStatus;
	}
	
	public int getCredits() {
		return credits;
	}
	
	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public Schedule getSchedule() {
		return schedule;
	}
	
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	
}
