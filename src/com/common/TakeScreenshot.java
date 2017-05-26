package com.common;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class TakeScreenshot {
	public void takeScreenShot(String folder, String fileName, WebDriver driver) throws IOException {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
		long currentTime=System.currentTimeMillis();  //get the current time of system. 
		String desFilePath=OperateSettings.getScreenshotPath() + "/" + folder + "/" + OperateSettings.getBrowser()+ "/" + fileName + "_" + currentTime  + ".jpg";
		
		FileUtils.copyFile(srcFile, new File(desFilePath));
	}
}
