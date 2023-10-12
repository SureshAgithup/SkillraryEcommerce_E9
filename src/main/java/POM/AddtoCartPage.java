package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPage {

	//Declaration
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement plusIcon;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-lg btn-flat']")
	private WebElement addtocart;
	
	//Initialization
		public AddtoCartPage(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}
		
		//Utilization
		public WebElement getPlusIcon()
		{
			return plusIcon;
		}
		
		public void addToCart()
		{
			addtocart.click();
		}
		
}
