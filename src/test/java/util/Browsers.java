package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {
	WebDriver driver;
	//CommonDrivers driver = new CommonDrivers();
	public WebDriver get(String browser){
		try{
		if(browser.equalsIgnoreCase("firefox")){
			System.getProperty("webdriver.gecko.driver",TestConfig.firefox);
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")){
			System.getProperty("webdriver.chrome.driver",TestConfig.chrome);
			driver = new ChromeDriver();
		}
		
	}
	catch(Exception e){
		e.printStackTrace();
		System.out.println("No browser in the list specified");
	}
		return driver;
	}
	 
	
	
}
