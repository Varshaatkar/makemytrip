package pageObjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
//import utilities.ExcelUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class giftspage extends basepage {

	
	public giftspage(WebDriver driver) {
		super(driver);

	}
	

	// For clicking on Gifts card
	@FindBy(xpath = "//li[@data-cy='tertiaryRowItem_Gift Cards']")
	WebElement clkgift;

	// For getting names of all giftcards
	@FindBy(xpath = "//h3[@class='lato-black black-text']")
	List<WebElement> allCards;

	// For clicking on birthday card

	@FindBy(xpath = "//body/div[@id='root']/div[@id='top-banner']/div[@class='minContainer']/div/div[@class='gc__container']/div[@class='gc__main']/div[@class='gc__right']/div[2]/ul[1]/li[1]/div[1]")
	WebElement WeddingCard;

	// Actions
	public void clkgift() throws InterruptedException, IOException {
		clkgift.click();
		Thread.sleep(5000);

		String parent = driver.getWindowHandle();

		Set<String> s = driver.getWindowHandles();

		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parent.equals(child_window)) {

				driver.switchTo().window(child_window);

				driver.switchTo().window(child_window);

				System.out.println("GIFT CARD PAGE");
				List<String> cards = new ArrayList<>();

				for (WebElement j : allCards) {
					cards.add(j.getText());
				}
				System.out.println("Number of cards present: " + cards.size());
				System.out.println("The card names are: " + cards);
				System.out.println("Wedding Gift Card is selected");
				WeddingCard.click();
				Thread.sleep(5000);

			}

		}
	}

}
