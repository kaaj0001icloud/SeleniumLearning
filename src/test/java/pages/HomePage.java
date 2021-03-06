package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	
	@FindBy(xpath = "//*[@id='twotabsearchtextbox']")
	WebElement searchBox;
	
	@FindBy(xpath = "//*[@id='nav-search']/form/div[2]/div/input")
	WebElement searchButton;
	
	@FindBy(xpath = "//*[@id='nav-link-shopall']/span[2]")
	WebElement shopByCategory;
	
	@FindBy(xpath = "//*[@id='nav-flyout-shopAll']/div[2]/span[5]/span")
	WebElement tvAndAppliances;
	
	public void HomePage(WebDriver driver){
		this.driver = driver;
	}


	public SearchResultsPage enterSearchCriteria(String searchItem){
	
		try{
			searchBox.sendKeys(searchItem);
			searchButton.click();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return PageFactory.initElements(driver, SearchResultsPage.class);
	}
	
}