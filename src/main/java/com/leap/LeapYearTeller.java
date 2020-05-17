package main.java.com.leap;

public class LeapYearTeller {
	private int year;
	private boolean isYearDivisibleBy400;
	private boolean isYearDivisibleBy100ButNotBy400;
	private boolean isDivisibleBy4ButNotBy100;
	private boolean notDivisibleBy4;
	private boolean isInvalidYear;
	private boolean isLeapYear;

	public LeapYearTeller(int year) {
		this.year = year;
		setIsYearDivisibleBy400();
		setIsYearDivisibleBy100ButNotBy400();
		setIsDivisibleBy4ButNotBy100();
		setNotDivisibleBy4();
		setIsInvalidYear();
		setIsLeapYear();
	}

	public boolean isYearDivisibleBy400() {
		return isYearDivisibleBy400;
	}

	public void setIsYearDivisibleBy400() {
		this.isYearDivisibleBy400 = (this.year % 400 == 0);
	}

	public boolean isYearDivisibleBy100ButNotBy400() {
		return !isYearDivisibleBy100ButNotBy400;
	}

	public void setIsYearDivisibleBy100ButNotBy400() {
		this.isYearDivisibleBy100ButNotBy400 = (this.year % 100 == 0) && (this.year % 400 != 0);
	}

	public boolean isDivisibleBy4ButNotBy100() {
		return isDivisibleBy4ButNotBy100;
	}

	public void setIsDivisibleBy4ButNotBy100() {
		this.isDivisibleBy4ButNotBy100 = (this.year % 4 == 0) && (this.year % 100 != 0);
	}

	public boolean notDivisibleBy4() {
		return !notDivisibleBy4;
	}

	public void setNotDivisibleBy4() {
		this.notDivisibleBy4 = (this.year % 4 != 0);
	}

	public boolean isInvalidYear() {
		return isInvalidYear;
	}

	public void setIsInvalidYear() {
		this.isInvalidYear = (this.year <= 0);
	}

	public boolean isLeapYear() {
		return isLeapYear;
	}

	private void setIsLeapYear() {
		if (this.isInvalidYear) {
			this.isLeapYear = false;
		} else {
			this.isLeapYear = isYearDivisibleBy400() || isDivisibleBy4ButNotBy100();
		}
	}

}
