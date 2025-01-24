package com.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baselayer.BaseClass;

public class HomePage extends BaseClass{
	
	@FindBy(xpath="")
	private WebElement logo;
	
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}

	public Boolean validateLogo() {
		
		return this.logo.isDisplayed();
		
	}
	
}
