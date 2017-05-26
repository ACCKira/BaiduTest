package com.drivers;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.common.OperateSettings;

public class Drivers {

	public static WebDriver driver;
    private static Boolean isMax=false;
	
	//start driver
	public static WebDriver startDriver(String type){
		switch (type) {
	    case "ie":
	        System.setProperty("webdriver.ie.driver", OperateSettings.getIEDriverPath());    
	        driver = new InternetExplorerDriver();
	        if(isMax==false){
	        	driver.manage().window().maximize();
	        	isMax=true;
	        }
	        break;
	    case "firefox":
	    	System.setProperty("webdriver.firefox.bin", OperateSettings.getFireFoxDriverPath()); 
			FirefoxProfile fp=new FirefoxProfile();
			driver = new FirefoxDriver(fp);
			driver.manage().window().maximize();
	        break;
	    case "chrome":
	    	System.setProperty("webdriver.chrome.driver", OperateSettings.getChromeDriverPath());    
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        break;  
	    }
		return driver; 
	}
	

	
}
