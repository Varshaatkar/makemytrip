package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.homepage;
import pageObjects.cabspage;
import testBase.baseclass;
import utilities.TakeScreenshot;

public class TC1 extends baseclass {

	@Test(priority = 1, groups = { "cabs" })

	public void makemytrip()

	{
		logger.info("**** starting TC1 *****");

		logger.info("application logs started......");

		try {
			homepage fp = new homepage(driver);
			fp.cabs();
			logger.info("****clicked on cabs  *****");

			fp.clkfrom();
			logger.info("**** clicked on from   *****");

			fp.etrdelhi();
			logger.info("**** entered as Delhi  *****");

			fp.clkto();
			logger.info("**** clicked Delhi *****");

			fp.etrmanali();
			logger.info("**** entered as Manali,Himachal Pradesh  *****");
			Thread.sleep(2000);

			fp.slctdate();
			logger.info("**** date selected  *****");

			fp.slcthour();
			logger.info("**** selected hour as 6  *****");

			fp.slctmin();
			logger.info("**** selected min as 30  *****");

			fp.slctam();
			logger.info("**** selected AM  *****");

			fp.clkapply();
			logger.info("**** clicked on apply  *****");

			fp.clksearch();
			logger.info("**** clicked on search *****");

			cabspage sp = new cabspage(driver);
			sp.clksuv();
			logger.info("**** clicked on SUV  *****");

			sp.clkfilter();
			logger.info("**** clicked on filters *****");

			sp.slctlow();
			logger.info("**** selected on lowest to highest *****");

			sp.carlist();
			logger.info("**** carlist is displayed  *****");
			// sp.exl();
			sp.lowstprice();
			logger.info("**** lowest price is displayed *****");

			TakeScreenshot ts = new TakeScreenshot(driver);

			ts.takeScreenshot(driver, "Firstscreenshot.png");
			logger.info("**** Took first testcase screenshot *****");

			// ExcelUtils.setcelldata(filePath, "Sheet1", 1, 0, lowstprice.getText());

			/*
			 * FileOutputStream file1 = new FileOutputStream(
			 * "C:\\Users\\2303455\\eclipse-workspace\\Hackathon\\Excel\\excel.xlsx");
			 * XSSFWorkbook wb = new XSSFWorkbook();
			 * 
			 * XSSFSheet sheet1 = wb.createSheet("Lowest Price");
			 * 
			 * int len = 0; int totalRow = len;
			 * 
			 * for (int i = 0; i <= totalRow; i++) {
			 * 
			 * Row row = sheet1.createRow(i);
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
			 * 
			 * System.out.println("Excel Writing is Done(Profile Info)!!!!!");
			 */

		} catch (Exception e) {
			logger.error("test failed..");
			logger.debug("debug logs....");
			Assert.fail();
		}

		logger.debug("application logs end.......");
		logger.info("**** finished TC1  *****");
	}
}
