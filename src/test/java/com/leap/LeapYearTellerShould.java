package test.java.com.leap;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import main.java.com.leap.LeapYearTeller;

class LeapYearTellerShould {

	@Test
	public void confirm_year_divisible_by_400_are_leap_years() {
		LeapYearTeller leap = new LeapYearTeller(2000);
		boolean res = leap.isYearDivisibleBy400();
		Assert.assertTrue(res==true);	
	}
	@Test
	public void confirm_year_divisible_by_100_but_not_by_400_are_not_leap_years() {
		LeapYearTeller leap2100 = new LeapYearTeller(2100);
		boolean res2100 = leap2100.isYearDivisibleBy100ButNotBy400();
		Assert.assertTrue(res2100 == false);
		
		LeapYearTeller leap1700 = new LeapYearTeller(1700);
		boolean res1700 = leap1700.isYearDivisibleBy100ButNotBy400();
		Assert.assertTrue(res1700 == false);
		
		LeapYearTeller leap1800 = new LeapYearTeller(1800);
		boolean res1800 = leap1800.isYearDivisibleBy100ButNotBy400();
		Assert.assertTrue(res1800 == false);
		
		LeapYearTeller leap1900 = new LeapYearTeller(1900);
		boolean res1900 = leap1900.isYearDivisibleBy100ButNotBy400();
		Assert.assertTrue(res1900 == false);
	}
	@Test
	public void confirm_year_divisible_by_4_but_not_by_100_are_leap_years() {
		LeapYearTeller leap = new LeapYearTeller(2008);
		boolean res = leap.isDivisibleBy4ButNotBy100();
		Assert.assertTrue(res == true);
		
		LeapYearTeller leap2012 = new LeapYearTeller(2012);
		res = leap2012.isDivisibleBy4ButNotBy100();
		Assert.assertTrue(res == true);
		
		LeapYearTeller leap2016 = new LeapYearTeller(2016);
		res = leap2016.isDivisibleBy4ButNotBy100();
		Assert.assertTrue(res == true);
	}
	
	@Test
	public void confirm_year_not_divisible_by_4_are_not_leap_years() {
		LeapYearTeller leap = new LeapYearTeller(2017);
		boolean res = leap.notDivisibleBy4();
		Assert.assertTrue(res == false);
	}
	@Test 
	public void identify_invalid_year_for_negative_and_0_integers() {
		LeapYearTeller leap = new LeapYearTeller(-201);
		boolean res = leap.isInvalidYear();
		Assert.assertEquals(true,res);
	}
	

}
