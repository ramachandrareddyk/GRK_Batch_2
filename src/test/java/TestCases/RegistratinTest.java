package TestCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseTest;
import Utilities.ExcelUtilities;

public class RegistratinTest extends BaseTest {

	
	
	@DataProvider
	public Object[][] gettestdata() {
		Object data[][]=ExcelUtilities.getTestData("registration");
		
		return data;
	}
	
	
	
	
	
	
	@Test(dataProvider ="gettestdata" )
	public void userRegistrationTest(String firstname, String lastname, String email, String telephone,String password, String subscribe) {

		home.clickOnMyAccount();
		home.clickonRegister();
		register.doRegistration(firstname, lastname, email, telephone, password, subscribe);
		Assert.assertTrue(created.userRegistrationSuccessMessage());

	}

}
