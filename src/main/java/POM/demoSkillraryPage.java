package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class demoSkillraryPage {
	//declaration
	@FindBy(xpath="//a[text()='COURSE']")
	private WebElement coursebtn;
	
	@FindBy(name="addresstype")
	private WebElement searchDd;
	
	@FindBy(xpath="//a[text()='FEEDBACK']")
	private WebElement feedbackbtn;
	
	//Initialization
	public demoSkillraryPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getCoursebtn() {
		return coursebtn;
	}
	
	public WebElement getSearchDd() {
		return searchDd;
	}
	
	public void feedbackButton() {
		feedbackbtn.click();
	}

}
