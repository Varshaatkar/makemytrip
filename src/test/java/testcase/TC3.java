package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.hotelspage;
import testBase.baseclass;
import utilities.TakeScreenshot;

public class TC3 extends baseclass {

	@Test(priority = 3, groups = { "hotels" })
	public void thirdcase() {
		logger.info("**** starting TC3  *****");

		logger.debug("application logs started......");

		try {

			hotelspage hs = new hotelspage(driver);
			hs.clkHotels();
			logger.info("****clicked on Hotels  *****");

			hs.clkGuests();
			logger.info("****clicked on guests and rooms *****");

			hs.clkadults();
			logger.info("****clicked on adults  *****");

			hs.getcount();
			logger.info("****captured the count and displayed*****");

			TakeScreenshot ts = new TakeScreenshot(driver);

			ts.takeScreenshot(driver, "Thirdscreenshot.png");
			logger.info("**** Took third testcase screenshot *****");

			/*
			 * FileOutputStream file1 = new FileOutputStream(
			 * "C:\\Users\\2303455\\eclipse-workspace\\Hackathon\\Excel\\excel.xlsx");
			 * XSSFWorkbook wb = new XSSFWorkbook(); XSSFSheet sheet3 =
			 * wb.createSheet("adult list");
			 * 
			 * int len = 0; int totalRow = len;
			 * 
			 * for (int j = 0; j <= totalRow; j++) {
			 * 
			 * Row row = sheet3.createRow(j);
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
		logger.info("**** finished TC3  *****");
	}

}
