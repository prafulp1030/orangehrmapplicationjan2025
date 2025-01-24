package com.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baselayer.BaseClass;

public class SearchEmployee extends BaseClass{
	
	@FindBy(xpath="//a[text()='Employee List']")
	private WebElement empList;
	
	@FindBy(xpath="//label[text()='Employee Id']/parent::div/following-sibling::div/child::input")
	private WebElement searchBox;
	
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	private WebElement searchBtn;
	
	public SearchEmployee() {
		
		PageFactory.initElements(driver, this);
	}
	public void clickOnEmpList() {
		
		this.empList.click();
	}
	public void enterId(String id) {
		
		this.searchBox.sendKeys(id);
	}
	public void clickOnSearchBtn() {
		
		this.searchBtn.click();
	}
	
	

}
