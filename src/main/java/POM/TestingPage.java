package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	//Declaration
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement Fb;
	
	//Initialization
	public TestingPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void FbWebElement()
	{
		Fb.click();
	}
	public WebElement getFb()
	{
		return Fb;
	}
	

}
