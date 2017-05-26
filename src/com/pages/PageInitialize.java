package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageInitialize {
	public BasePage bPage;
	
	public PageInitialize(WebDriver driver) {
		this.bPage = PageFactory.initElements(driver, BasePage.class);
		
	}

}
