package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Utilities.Constents;

public class LoginTst extends BaseTest{
	
	
	
	
	
	
	
	
	@Test
	public void verifyLoginPageTest() {
		home.clickOnMyAccount();
		home.clickOnLogin();
		String loginpagetitle= login.getLoginPageTitle();
		
		Assert.assertEquals(loginpagetitle, Constents.LoginPageTitle);
	}
	
	@Test
	public void verifyReturningCustmertextTest() {
		home.clickOnMyAccount();
		home.clickOnLogin();
		Assert.assertTrue(login.returningCustomerText());
	}
	
	@Test
	public void verifyForgetPasswordLink() {
		home.clickOnMyAccount();
		home.clickOnLogin();
		Assert.assertTrue(login.forgetPasswordLink());
	}
	
	@Test
	public void doLoginWithValodValidCredntials() {
		home.clickOnMyAccount();
		home.clickOnLogin();
		login.doLogin(prop.getProperty("validusername"), prop.getProperty("validpassword"));
		
	}
	@Test
	public void doLoginWithinValodValidCredntialsWithValidUsernameAndInvalidPassword() {
		home.clickOnMyAccount();
		home.clickOnLogin();
		login.doLogin(prop.getProperty("invalidUserName"), prop.getProperty("validpassword"));
		Assert.assertTrue(login.LoginErrorMessage());
	}

}
