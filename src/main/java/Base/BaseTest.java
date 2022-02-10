package Base;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegisterPage;
import Pages.YourAccountHasBeenCreatedPage;

public class BaseTest {
	WebDriver driver;
	public static Properties prop;

	
	public static BasePage base;
	public static HomePage home;
	public static LoginPage login;
	public static RegisterPage register;
	public static YourAccountHasBeenCreatedPage created;
	
	
	
	@BeforeMethod
	
	public void initilizeBrwser() throws IOException {
		
		base= new BasePage();
		prop= base.initProperties();
		driver=base.initBrowser(base.initProperties().getProperty("browser"));
		
		driver.get(base.initProperties().getProperty("url"));
		
		home= new HomePage(driver);
		login= new LoginPage(driver);
		register = new RegisterPage(driver);
		created= new YourAccountHasBeenCreatedPage(driver);
		
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	
	
	
	
	
	
	
	
	
	
	
	

}
