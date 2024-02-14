package pageObjects;

import java.io.IOException;
import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelUtils;

public class hotelspage extends basepage {

	

	public hotelspage(WebDriver driver) {
		super(driver);
	}

	// Elements

	// For clicking on hotels
	@FindBy(xpath = "//a[@href='https://www.makemytrip.com/hotels/']")
	WebElement clkHotels;

	// For clicking on Rooms&guests
	@FindBy(xpath = "//input[@id='guest']")
	WebElement clkGuests;

	// For clicking on Adults
	@FindBy(xpath = "//div[@class='makeFlex primaryTraveler']//div[2]//div[2]//div[1]")
	WebElement clkadults;

	// For capturing number of adults
	@FindBy(xpath = "//li[@data-cy='GuestSelect$$_323']")
	List<WebElement> getcount;

	// Actions
	public void clkHotels() {
		clkHotels.click();
	}

	public void clkGuests() {
		clkGuests.click();
	}

	public void clkadults() {
		clkadults.click();
	}

	public void getcount() throws IOException {
		/*
		 * for (WebElement k : getcount) {
		 * 
		 * int q = 3; count.add(k.getText()); ExcelUtils.setcelldata(filePath,
		 * "Total Adults", 5, q, k.getText()); q++; }
		 */
		System.out.println("Hotels Page");
		String adult = "";
		int i = 1;
		// int q = 3;

		List<String> count = new ArrayList<>();
		for (WebElement adults : getcount)

		{
			adult = adults.getText();

			ExcelUtils.setcelldata(filePath, "Total Adults", i, 0, adult);

			System.out.print(adult + ",");

			i++;
			count.add(adults.getText());

		}
		System.out.println("");
		System.out.println("Number of Adults allowed are: " + count.size());
		// System.out.println("The list: " + count);
		System.out.println("Third Testcase passed");
		System.out.println("==================");
		System.out.println("Project executed successfully");

	}
}
