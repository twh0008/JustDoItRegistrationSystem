package support;

public class Time {
	private int weekDay;
	private int time;
	
	
	public Time(int weekDay, int time) {
		this.weekDay = weekDay;
		this.time = time;
	}

	public int getWeekDay() {
		return weekDay;
	}
	
	public void setWeekDay(int weekDay) {
		this.weekDay = weekDay;
	}
	
	public int getTime() {
		return time;
	}
	
	public void setTime(int time) {
		this.time = time;
	}
	
}
