package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class HomePage extends BasePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	By SerachBox = By.name("search");

	// WebElement serchBox= driver.findElement(By.name("search"));

	By SerachButton = By.xpath("//button[@class='btn btn-default btn-lg']");

	By ItemsBox = By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']");

	By CurrencyDropDown = By.xpath("//span[normalize-space()='Currency']");

	By MyAccount = By.xpath("//span[normalize-space()='My Account']");

	By Register = By.xpath("//a[normalize-space()='Register']");

	By login = By.xpath("//a[normalize-space()='Login']");

	public String getHomePageTitle() {
		return driver.getTitle();
	}

	public boolean isSearchBoxDisplayed() {
		return driver.findElement(SerachBox).isDisplayed();
	}

	public boolean isSearchButtonDisplayed() {
		return driver.findElement(SerachButton).isDisplayed();
	}

	public boolean isCurrencyDropDownDisplayed() {
		return driver.findElement(CurrencyDropDown).isDisplayed();
	}

	public void clickOnMyAccount() {
		driver.findElement(MyAccount).click();
	}

	public void clickonRegister() {
		driver.findElement(Register).click();
	}

	public void clickOnLogin() {
		driver.findElement(login).click();
	}

}
