
public class Professor extends User {

	private Schedule schedule;

	public Professor(String firstName, String lastName, String username, String password, int userType, int userId,
			Schedule schedule) {
		super(firstName, lastName, username, password, userType, userId);
		this.schedule = schedule;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
}
