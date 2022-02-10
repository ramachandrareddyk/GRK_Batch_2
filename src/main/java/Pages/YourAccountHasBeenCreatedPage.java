package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BasePage;

public class YourAccountHasBeenCreatedPage extends BasePage {
	WebDriver driver;
	
	public YourAccountHasBeenCreatedPage(WebDriver driver){
		this.driver= driver;
	}
	
	
	By successMessage= By.xpath("//h1[normalize-space()='Your Account Has Been Created!']");
	
	
	public boolean userRegistrationSuccessMessage() {
		return driver.findElement(successMessage).isDisplayed();
	}

}
