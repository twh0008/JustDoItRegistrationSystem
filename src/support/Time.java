package support;

public class Time {
	private String weekDay;
	private String time;
	
	
	public Time(String weekDay, String time) {
		this.weekDay = weekDay;
		this.time = time;
	}

	public String getWeekDay() {
		return weekDay;
	}
	
	public void setWeekDay(String weekDay) {
		this.weekDay = weekDay;
	}
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
}
