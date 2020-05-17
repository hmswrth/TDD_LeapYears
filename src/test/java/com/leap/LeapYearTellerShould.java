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

}
