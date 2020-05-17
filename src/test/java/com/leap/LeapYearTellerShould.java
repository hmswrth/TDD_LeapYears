package test.java.com.leap;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import main.java.com.leap.LeapYearTeller;

class LeapYearTellerShould {

	@Test
	public void confirm_year_divisible_by_400_are_leap_years() {
		LeapYearTeller leap = new LeapYearTeller(2000);
		boolean res = leap.isYearDivisibleBy400();
		Assert.assertTrue(res == true);
	}

	@Test
	public void confirm_year_divisible_by_100_but_not_by_400_are_not_leap_years() {
		LeapYearTeller leap2100 = new LeapYearTeller(2100);
		boolean res2100 = leap2100.isYearDivisibleBy100ButNotBy400();
		Assert.assertEquals(false, res2100);

		LeapYearTeller leap1700 = new LeapYearTeller(1700);
		boolean res1700 = leap1700.isYearDivisibleBy100ButNotBy400();
		Assert.assertEquals(false, res1700);

		LeapYearTeller leap1800 = new LeapYearTeller(1800);
		boolean res1800 = leap1800.isYearDivisibleBy100ButNotBy400();
		Assert.assertEquals(false, res1800);

		LeapYearTeller leap1900 = new LeapYearTeller(1900);
		boolean res1900 = leap1900.isYearDivisibleBy100ButNotBy400();
		Assert.assertEquals(false, res1900);
	}

	@Test
	public void confirm_year_divisible_by_4_but_not_by_100_are_leap_years() {
		LeapYearTeller leap = new LeapYearTeller(2008);
		boolean res = leap.isDivisibleBy4ButNotBy100();
		Assert.assertEquals(true, res);

		LeapYearTeller leap2012 = new LeapYearTeller(2012);
		boolean res2012 = leap2012.isDivisibleBy4ButNotBy100();
		Assert.assertEquals(true, res2012);

		LeapYearTeller leap2016 = new LeapYearTeller(2016);
		boolean res2016 = leap2016.isDivisibleBy4ButNotBy100();
		Assert.assertEquals(true, res2016);
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
		Assert.assertEquals(true, res);

		LeapYearTeller leap0 = new LeapYearTeller(0);
		boolean res0 = leap0.isInvalidYear();
		Assert.assertEquals(true, res0);
	}
	@Test
	public void confirm_leap_year() {
		LeapYearTeller leap = new LeapYearTeller(new int[] {2000,1800,2016,0,-2103});
		boolean[] res = leap.isLeapYear();
		Assert.assertArrayEquals(new boolean[] {true,false,true,false,false}, res);
		
	}

}
