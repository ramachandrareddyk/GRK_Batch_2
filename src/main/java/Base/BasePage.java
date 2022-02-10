package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	public static WebDriver driver;
	
	public WebDriver initBrowser(String BrowserName) {
		
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			
		} else if(BrowserName.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			
			
		} else if(BrowserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver= new InternetExplorerDriver();
			
		} else {
			System.out.println("Please pass the correct browser");
		}
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		return driver;
	}
	
	public Properties prop;
	
	public Properties initProperties() throws IOException {
		String path="C:\\Users\\LENOVO\\eclipse-workspace\\POMHybridFramework\\src\\main\\java\\Config\\Config.properties";
		
		FileInputStream fs= new FileInputStream(path);
		
		prop= new Properties();
		
		prop.load(fs);
		
		return prop;
		
	}
	
	
	
	
	
	
	
	
	
	

}
