package com.pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.common.OperateSettings;

public class BasePage {

	public WebDriver driver;
	
	@FindBy(how=How.ID,id="kw")
	public WebElement searchBox;
	@FindBy(how=How.ID,id="su")
	public WebElement submitBtn;
	
	//soutu
	@FindBy(how=How.CLASS_NAME,className="soutu-btn")
	public WebElement soutuBtn;
	@FindBy(how=How.ID,id="soutu-url-kw")
	public WebElement soutuUrlInput;
	@FindBy(how=How.CLASS_NAME,className="soutu-url-btn")
	public WebElement soutuUrlBtn;
	@FindBy(how=How.CLASS_NAME,className="upload-pic")
	public WebElement soutuUploadPic;
	
	@FindBy(how=How.CLASS_NAME,className="upload-pic")
	public WebElement uploadPic;

	
	
	@FindBy(how=How.CLASS_NAME,className="searchThumb-imgbg")
	public WebElement searchThumb;
	
	
	public BasePage(WebDriver driver){
		this.driver = driver;
	}
	
	public void searchText(String keyword) {
		searchBox.sendKeys(keyword);
		submitBtn.click();
		//searchBox.clear();
		
	}
	
	//Search by pic url
	public void soutu_url(String picURL) throws InterruptedException{
		
 		soutuBtn.click();
		Thread.sleep(1000);
		soutuUrlInput.sendKeys(picURL);
		soutuUrlBtn.click();
		
	}
	
	//upload picture
	public void soutu_upload_pic(String path) throws InterruptedException{
		soutuBtn.click();
		//uploadPic.click();
		Thread.sleep(2000);		
		//File file = new File(path);
		System.out.print("aaa\n");
		//if (file.exists()) {
		    uploadPic.click();
			uploadPic.sendKeys(path);
			System.out.print("bbb\n");
		//}
		

	}
}
