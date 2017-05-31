package com.testcases;

import java.io.IOException;
import java.util.List;



//import java.util.logging.Logger;
import org.apache.log4j.Logger;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.common.OperateExcel;
import com.common.OperateSettings;
import com.common.TakeScreenshot;
import com.drivers.Drivers;
import com.pages.PageInitialize;


public class BasePageTest {
	
	private static Logger logger = Logger.getLogger(BasePageTest.class);  
	String openURL = null;
	PageInitialize pageInit = null;
	WebDriver driver = null;
	TakeScreenshot ts = new TakeScreenshot();
	
	@BeforeTest
	  public void beforeTest() throws Exception {
		openURL = "http://www.baidu.com";
		driver = Drivers.startDriver(OperateSettings.getBrowser());
		driver.get(openURL);
		pageInit=new PageInitialize(driver);
		logger.info("Baidu home page inititalize complete.");
	  }
	
//	@Test
//	public void searchText() throws Exception {
//		 try {
//			 //Read test data form excel
//			  String dataFilePath = OperateSettings.getDataPath()+"Search.xls";
//			  List<String> keywords; 
//			  OperateExcel operExcel = new OperateExcel();  	 	  
//			  keywords = operExcel.readExcel_SearchKeyword(dataFilePath,"text");  //parameter (dateFilePath,sheetname in EXCEL)
//			  
//			  logger.info("Read test data from search.xls complete.");
//			  
//			  for(String keyword:keywords){	 
//				  pageInit.bPage.searchText(keyword);
//				  Thread.sleep(3000);		  
//				  ts.takeScreenShot("baiduSearch","searchText_" + keyword, driver); 
//				  logger.info("Complete search \"" +keyword +"\".");
//				  pageInit.bPage.searchBox.clear();			  
//				  
//			  }	
//			  logger.info("Complete run searchText case.");
//		} catch (Exception e) {
//			logger.error("Encount exception: "+e.toString());
//			ts.takeScreenShot("baiduSearch","Exception", driver); 
//			
//			
//		}	 
//
//	  }
//	
//	
//	@Test
//  public void baiduSoutu_URL() throws Exception{
//	  try {
//		  String picURL = "http://img0.bdstatic.com/img/image/pcdutu-case-6.jpg";		  
//		  pageInit.bPage.soutu_url(picURL);
//		  Thread.sleep(3000);
//		  ts.takeScreenShot("baiduSoutu", "soutu", driver);
//	  } catch (Exception e) {
//		ts.takeScreenShot("soutu","Exception", driver);
//	  }
//	  //verifyElementPresent
//  }
	
	@Test
	public void soutuByPic() throws IOException{
		try {
			String filepath="C:\\Kira\\WorkSpace\\BaiduTest\\Test_data_Excels\\soutu\\test_hua.jpg";
			pageInit.bPage.soutu_upload_pic(filepath);			
			Thread.sleep(3000);			
			logger.info("Complete run soutuByPic case.");
			ts.takeScreenShot("baiduSoutu", "uploadPic", driver);
		} catch (Exception e) {
			System.err.println(e.toString());
			ts.takeScreenShot("baiduSearch","Exception", driver); 
		}
	  }
	
	
	@AfterTest
	public void afterTest() throws Exception {
		driver.close();
		logger.info("Case complete.");

	  }
	
}
