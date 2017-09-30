package testCore;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import util.Browsers;
import util.CommonDrivers;

public class core {
	WebDriver driver;
	CommonDrivers CommonDriver = new CommonDrivers();
	@BeforeSuite
	public void testSetup() throws IOException{
		Browsers browser = new Browsers();
		driver = browser.get(CommonDriver.getProperty("Browser"));
	}
	public void navigateToURL(){
		
	}
	
	public void setBrowserProperties(){
		
	}
	
	public void openURL(){
		try{
			driver.get(CommonDriver.getProperty("url"));
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@AfterSuite
	public void tearDown(){
		
	}

}
