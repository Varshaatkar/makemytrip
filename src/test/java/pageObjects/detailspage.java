package pageObjects;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelUtils;

public class detailspage extends basepage {


	public detailspage(WebDriver driver) {
		super(driver);
	}

	// For entering sender name
	@FindBy(xpath = "//input[@name='senderName']")
	WebElement sndrname;

	// For entering mobile number
	@FindBy(xpath = "//input[@name='senderMobileNo']")
	WebElement etrphno;

	// For entering mail
	@FindBy(xpath = "//input[@name='senderEmailId']")
	WebElement etrmail;

	// For clicking buy now
	@FindBy(xpath = "//button[normalize-space()='BUY NOW']")
	WebElement clkbuynow;

	// For capturing text of wrong email address
	@FindBy(xpath = "//p[normalize-space()='Please enter a valid Email id.']")
	WebElement errmsg;

	public void sndrname() {

		String Name = RandomStringUtils.randomAlphabetic(5);
		sndrname.sendKeys(Name);
	}

	public void etrphno() {
		String No = RandomStringUtils.randomNumeric(10);
		etrphno.sendKeys(No);
	}

	public void etrmail() {
		String Mail = RandomStringUtils.randomAlphabetic(5) + "@gmail";
		etrmail.sendKeys(Mail);
	}

	public void clkbuynow() throws IOException {
		clkbuynow.click();
		ExcelUtils.setcelldata(filePath, "Error MSG", 0, 0, errmsg.getText());
		System.out.println("Buy now clicked");
		System.out.println("Msg after invalid mail:" + errmsg.getText());
		System.out.println("Second Testcase passed");
		System.out.println("===========================");
	}
}
