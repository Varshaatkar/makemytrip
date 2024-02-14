package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.detailspage;
import pageObjects.giftspage;
import testBase.baseclass;
import utilities.TakeScreenshot;

public class TC2 extends baseclass {

	@Test(priority = 2, groups = { "giftcards" })
	public void secondcase() {
		logger.info("**** starting TC2  *****");

		logger.debug("application logs started......");

		try {

			giftspage gc = new giftspage(driver);
			gc.clkgift();
			logger.info("****clicked on giftcards  *****");

			detailspage fr = new detailspage(driver);
			fr.sndrname();
			logger.info("**** random sender name is entered *****");

			fr.etrphno();
			logger.info("**** random phone number is entered *****");

			fr.etrmail();
			logger.info("**** random email is entered  *****");

			fr.clkbuynow();
			logger.info("**** clicked on buynow and captured error msg *****");

			TakeScreenshot ts = new TakeScreenshot(driver);

			ts.takeScreenshot(driver, "Secondscreenshot.png");
			logger.info("**** Took second testcase screenshot *****");

			/*
			 * FileOutputStream file1 = new FileOutputStream(
			 * "C:\\Users\\2303455\\eclipse-workspace\\Hackathon\\Excel\\excel.xlsx");
			 * XSSFWorkbook wb = new XSSFWorkbook(); XSSFSheet sheet2 =
			 * wb.createSheet("Price");
			 * 
			 * int len = 0; int totalRow = len;
			 * 
			 * for (int j = 0; j <= totalRow; j++) {
			 * 
			 * Row row = sheet2.createRow(j);
			 * 
			 * Cell co1 = row.createCell(0);
			 * 
			 * Date name = null; co1.setCellValue(name);
			 * 
			 * }
			 * 
			 * wb.write(file1);
			 * 
			 * wb.close();
			 * 
			 * file1.close();
			 */

		} catch (Exception e) {
			logger.error("test failed..");
			logger.debug("debug logs....");
			Assert.fail();
		}

		logger.debug("application logs end.......");
		logger.info("**** finished TC2  *****");
	}
}
