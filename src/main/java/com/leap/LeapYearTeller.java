package main.java.com.leap;

public class LeapYearTeller {
	private  int year;
	private  boolean isYearDivisibleBy400;
	private boolean isYearDivisibleBy100ButNotBy400;
	private boolean  isDivisibleBy4ButNotBy100;
	public LeapYearTeller(int year) {
		this.year = year;
	    this.isYearDivisibleBy400 = (this.year % 400 == 0);
	    this.isYearDivisibleBy100ButNotBy400 = (this.year % 100 == 0) && (this.year %400 != 0);
	}
	public boolean isYearDivisibleBy400() {
		return isYearDivisibleBy400;
	}
	public boolean isYearDivisibleBy100ButNotBy400() {
		return !isYearDivisibleBy100ButNotBy400;
	}
	public boolean isDivisibleBy4ButNotBy100() {
		return isDivisibleBy4ButNotBy100;
	}

}
