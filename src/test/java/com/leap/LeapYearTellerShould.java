package test.java.com.leap;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import main.java.com.leap.LeapYearTeller;

class LeapYearTellerShould {

	@Test
	public void confirm_year_divisible_by_400_are_leap_years() {
		LeapYearTeller leap = new LeapYearTeller(2000);
		boolean res = leap.isLeapYear();
		Assert.assertTrue(res==true);	
	}
	@Test
	public void confirm_year_divisible_by_100_but_not_by_400_are_not_leap_years() {
		LeapYearTeller leap2100 = new LeapYearTeller(2100);
		boolean res2100 = leap2100.isLeapYear();
		Assert.assertTrue(res2100 == false);
	}
	
	

}
