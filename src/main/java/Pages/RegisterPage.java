package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BasePage;

public class RegisterPage extends BasePage{
	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this .driver = driver;
	}
	
	
	By firstName= By.id("input-firstname");
	
	By lastName= By.id("input-lastname");
	
	By emai= By.id("input-email");
	
	By Telephone= By.id("input-telephone");
	
	By pssword= By.id("input-password");
	
	By ConformPassword = By.id("input-confirm");
	
	By newsLetterYes = By.xpath("//label[normalize-space()='Yes']");
	
	By newsLetterNo =By.xpath("//label[normalize-space()='No']");
	
	By privacyPolacy= By.name("agree");
	
	By continueBtn= By.xpath("//input[@value='Continue']");
	
	
	
	
	public YourAccountHasBeenCreatedPage doRegistration(String FirstName, String LastName, String Email, String Mobile, String Password, String newsletter) {
		
		driver.findElement(firstName).sendKeys(FirstName);
		driver.findElement(lastName).sendKeys(LastName);
		driver.findElement(emai).sendKeys(Email);
		driver.findElement(Telephone).sendKeys(Mobile);
		driver.findElement(pssword).sendKeys(Password);
		driver.findElement(ConformPassword).sendKeys(Password);
		if(newsletter.equalsIgnoreCase("Yes")) {
			driver.findElement(newsLetterYes).click();
		}else {
			driver.findElement(newsLetterNo).click();
		}
		driver.findElement(privacyPolacy ).click();
		driver.findElement(continueBtn).click();
		
		
		return new YourAccountHasBeenCreatedPage(driver);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
