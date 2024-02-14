package pageObjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelUtils;

public class cabspage extends basepage {


	public cabspage(WebDriver driver) {
		super(driver);
	}

	// filePath=System.getProperty("user.dir")+"/testData/HackathonData.xlsx";

	// Elements

	// For selecting SUV
	@FindBy(xpath = "//label[normalize-space()='SUV']")
	WebElement clksuv;

	// For clicking filters
	@FindBy(xpath = "//span[@class='cursorPointer dodgerBlueColor']")
	WebElement clkfilter;

	// For selecting price lowest to highest
	@FindBy(xpath = "//div[@class='makeAbsolute sortOptionsPopup makeFlex column']//div[1]//p[1]")
	WebElement slctlow;

	// Get all the details
	@FindBy(xpath = "//*[@id=\"List\"]")
	WebElement carlist;

	@FindBy(xpath = "//p[@class='font28 latoBlack blackText ']")
	WebElement lstMin;

	@FindBy(xpath = "//span[@class='latoBlack font20 appendRight5']")
	List<WebElement> carlistAll;

	@FindBy(xpath = "//div[@id='List']//div[1]//div[1]//div[3]//div[1]//div[2]//div[1]//p[1]")
	WebElement lowstprice;

	// Actions
	public void clksuv() {
		clksuv.click();
	}

	public void clkfilter() {
		clkfilter.click();
	}

	public void slctlow() {
		slctlow.click();
	}

	public void carlist() throws IOException {
		List<String> SUVcars = new ArrayList<>();
		for (WebElement i : carlistAll) {
			SUVcars.add(i.getText());
		}
		System.out.println("=======================");
		System.out.println("Cabs Page");
		System.out.println("Number of SUV cars are: " + SUVcars.size());
		System.out.println("Name of SUV cars: " + SUVcars);

	}

	public void lowstprice() throws IOException {
		System.out.println("lowest price is :" + lowstprice.getText());
		ExcelUtils.setcelldata(filePath, "Lowest Price", 0, 0, lowstprice.getText());
		System.out.println("First testcase passed");
		System.out.println("============================");

	}
}
