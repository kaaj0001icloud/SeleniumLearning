package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SearchResultsPage {
	
	WebDriver driver;
	@FindBy(xpath = "//*[@id='result_0']/div/div[3]/div[1]/a/h2")
	WebElement searchResults;
	
	@FindBy(xpath="//*[@id='result_0']/div/div[4]/div[1]/a/span[2]")
	WebElement productPrice;
	
	@FindBy(xpath = "//*[@id='result_0']/div/div[6]/a")
	WebElement countOfReviews;
	
	// creating a constructor for this page
	public void SearchResultsPage(WebDriver driver){
		this.driver = driver;
	}
	
	public String getiPhoneType(){
		String resultText = searchResults.getText();
		String results = resultText.split(" ")[2];
		String results_1 = resultText.split("(")[0];
		String results_2 = resultText.split(" ")[2];
		
		return results;	
	}
	public int productPrice(){
		int productPriceInt = (Integer) null;
		try{
			String productAPrice = productPrice.getText();
			productPriceInt = Integer.parseInt(productAPrice);
			Select select = new Select(productPrice);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return productPriceInt;
	}
	public String noOfReviews(){
		String reviewCount = countOfReviews.getText();
		int reviewCount_1 =Integer.parseInt(reviewCount);
		return reviewCount; 
	}

}
