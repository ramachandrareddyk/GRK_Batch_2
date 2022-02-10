package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Utilities.Constents;

public class HomePageTest extends BaseTest{
	WebDriver driver;
	
	
	@Test
	public void verifyHomePageTitleTest() {
		String HomePageTitle=home.getHomePageTitle();
		Assert.assertEquals(HomePageTitle, Constents.HomePaheTitle);
	}
	
	@Test
	public void verifySearchBoxIsDisplayedTest() {
		Assert.assertTrue(home.isSearchBoxDisplayed());
	}
	
	@Test
	public void verifySearchButtonDisplayedTest() {
		Assert.assertTrue(home.isSearchButtonDisplayed());
	}
	
	@Test
	public void verifyCurrencyDropDownDisplayTest() {
		Assert.assertTrue(home.isCurrencyDropDownDisplayed());
	}
	
	
	
	
	

}
