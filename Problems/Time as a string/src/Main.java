class Time {

	private int hours;
	private int minutes;
	private int seconds;

	public Time(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	@Override
	public String toString() {
		String s = "";
		if (hours <= 9) {
			s = "0" + hours + ":";
		}
		else s = hours + ":";
		if (minutes <= 9) {
			s += "0" + minutes + ":";
		}
		else s += minutes + ":";
		if (seconds <= 9) {
			s += "0" + seconds;
		}
		else s+= seconds;
		return s;
	}
}