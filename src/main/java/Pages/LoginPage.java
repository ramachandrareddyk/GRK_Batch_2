	package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Base.BasePage;

public class LoginPage extends BasePage{
	
	WebDriver driver;
	
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
	}
	
	
	By Username = By.id("input-email");
	By Password = By.id("input-password");
	By LoginBtn = By.xpath("//input[@value='Login']");
	By ForgetPassword = By.linkText("Forgotten Password");
	By ReturnCustomer =By.xpath("//h2[text()='Returning Customer']");
	By WorningMessage = By.xpath("//i[@class='fa fa-exclamation-circle']");
	
	
	
	
	
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean returningCustomerText() {
		return driver.findElement(ReturnCustomer).isDisplayed();
	}
	
	public boolean forgetPasswordLink() {
		return driver.findElement(ForgetPassword).isDisplayed();
	}
	
	public MyAccountPage doLogin(String username, String password) {
		driver.findElement(Username).sendKeys(username);
		driver.findElement(Password).sendKeys(password);
		driver.findElement(LoginBtn).click();
		
		return new MyAccountPage(driver);
	}
	
	public boolean LoginErrorMessage() {
		return driver.findElement(WorningMessage).isDisplayed();
	}
	
	
	
	
	
	

}
