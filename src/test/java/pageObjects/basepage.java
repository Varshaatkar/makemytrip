package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class basepage {
WebDriver driver;
String filePath="C:\\Users\\2303501\\eclipse-workspace\\makemytrip\\Excel\\hackathon.xlsx";
	
	//Constructor
	public basepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}

