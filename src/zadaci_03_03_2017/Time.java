package zadaci_03_03_2017;

public class Time {

	private long hour;
	private long minute;
	private long second;

	public Time() {
		long milliseconds = System.currentTimeMillis();

		long totalSeconds = milliseconds / 1000 + 3600;
		second = totalSeconds % 60;

		long totalMinutes = totalSeconds / 60;
		minute = totalMinutes % 60;

		long totalHours = totalMinutes / 60;
		hour = totalHours % 24;
	}

	public Time(long elapsedTimeInMillis) {
		long totalSeconds = elapsedTimeInMillis / 1000;
		second = totalSeconds % 60;

		long totalMinutes = totalSeconds / 60;
		minute = totalMinutes % 60;

		long totalHours = totalMinutes / 60;
		hour = totalHours % 24;
	}

	public Time(long hour, long minute, long second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public long getHour() {
		return hour;
	}

	public long getMinute() {
		return minute;
	}

	public long getSecond() {
		return second;
	}

	// metoda koja postavlja vrijeme objekta prema specificnom proteklom vremenu
	public void setTime(long elapsedTime) {
		Time time = new Time(elapsedTime);

		this.hour = time.getHour();
		this.minute = time.getMinute();
		this.second = time.getSecond();
	}

	public String toString() {
		return hour + ":" + minute + ":" + second;
	}

}
