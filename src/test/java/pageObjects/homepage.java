package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage extends basepage {

	WebDriver driver;

	// Constructor
	public homepage(WebDriver driver) {
		super(driver);
	}

	// Elements

	// For clicking on cabs
	@FindBy(xpath = "//a[@href='https://www.makemytrip.com/cabs/']")
	WebElement cabs;

	// For clicking on from
	@FindBy(xpath = "//span[normalize-space()='From']")
	WebElement clkfrom;

	// For selecting Delhi in from section
	@FindBy(xpath = "//ul[@class='react-autosuggest__suggestions-list']/li[2]")
	WebElement etrdelhi;

	// For clicking on To and type manali
	@FindBy(xpath = "//input[@placeholder='To']")
	WebElement clkto;

	// For clicking on manali,himachal pradesh
	@FindBy(xpath = "//span[normalize-space()='Manali, Himachal Pradesh, India']")
	WebElement etrmanali;

	// For selecting the date 20th feb 2024
	@FindBy(xpath = "//div[@class='DayPicker-Month'][2]//div[@class='DayPicker-Week'][2]//div[7]")
	WebElement slctdate;

	// For selecting the hour as 6
	@FindBy(xpath = "//span[contains(text(),'06')]")
	WebElement slcthour;

	// For selecting the min as 30
	@FindBy(xpath = "//span[contains(text(),'30')]")
	WebElement slctmin;

	// For selecting AM
	@FindBy(xpath = "//span[@class='meridianSlotItemChild meridianSlotItemChild_sel']")
	WebElement slctam;

	// For clicking on Apply
	@FindBy(xpath = "//span[@class='applyBtnText']")
	WebElement clkapply;

	// For clicking on Search button
	@FindBy(xpath = "//a[normalize-space()='Search']")
	WebElement clksearch;

	// Actions Methods

	public void cabs() {
		cabs.click();
	}

	public void clkfrom() {
		clkfrom.click();
	}

	public void etrdelhi() {
		etrdelhi.click();
	}

	public void clkto() {
		clkto.click();
		clkto.sendKeys("Manali,Himachal Pradesh");
	}

	public void etrmanali() {
		etrmanali.click();
	}

	public void slctdate() {
		slctdate.click();
	}

	public void slcthour() {
		slcthour.click();
	}

	public void slctmin() {
		slctmin.click();
	}

	public void slctam() {
		slctam.click();
	}

	public void clkapply() {
		clkapply.click();
	}

	public void clksearch() {
		clksearch.click();
	}

}
