package com.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baselayer.BaseClass;

public class PimPage extends BaseClass{
	
	@FindBy(xpath="//a[text()='Add Employee']")
	private WebElement addEmployee;
	
	@FindBy(name="firstName")
	private WebElement firstName;
	
	@FindBy(name="lastName")
	private WebElement lastName;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	private WebElement saveBtn;
	
	public PimPage () {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnAddEmployee() {
		
		this.addEmployee.click();
	}
	
	public void enterUserDetails(String firstname,String lastname) {
		
		this.firstName.sendKeys(firstname);
		this.lastName.sendKeys(lastname);
	}
	
	public void clickOnSaveBtn() {
		
		this.saveBtn.click();
	}
	
	public String valdiatePimPageURL()
	{
		return driver.getCurrentUrl();
	}
}
