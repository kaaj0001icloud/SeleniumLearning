package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class CommonDrivers {
	public static String getProperty(String key) throws IOException{
		File file = new File("/Users/gopalchettykalangi/Documents/Selenium/Edurekha/Workspace/com.new/src/test/java/config/config.properties");
		FileReader read = new FileReader(file);
		Properties configProp = new Properties();
		configProp.load(read);
		return configProp.getProperty(key);
		
	}
	public static void switchToNewWindow(WebDriver driver){
		String parentWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		for(String window:windows){
			if(!window.equals(parentWindow)){
				driver.switchTo().window(parentWindow);
			}
		}
		
	}

}
