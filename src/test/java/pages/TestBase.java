package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.MyDriver;

public class TestBase {

	@FindBy(xpath = "")
	public WebElement mywebelement;


	public TestBase() {
		//this method requires to provide webdriver object for @FindBy
		//and page class
		//this means this page class
		PageFactory.initElements(MyDriver.get(), this);
	}


}
