package main.java.com.leap;

public class LeapYearTeller {
	private  int year;
	private  boolean isLeapYear;

	public LeapYearTeller(int year) {
		this.year = year;
	    this.isLeapYear = (year % 400 == 0);
	}

	public boolean isLeapYear() {
		return isLeapYear;
	}

}
