package com.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baselayer.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath = "//div[@class='oxd-brand-banner']")
	private WebElement logo;

	@FindBy(xpath = "//span[text()='PIM']/parent::a")
	private WebElement pimlink;

	public HomePage() {

		PageFactory.initElements(driver, this);
	}

	public boolean validateLogo() {

		return this.logo.isDisplayed();

	}

	public String validateURL() {
		return driver.getCurrentUrl();
	}

	public String validateTitle() {
		return driver.getTitle();
	}

	public void clickOnPimLink() {
		pimlink.click();
	}

}
