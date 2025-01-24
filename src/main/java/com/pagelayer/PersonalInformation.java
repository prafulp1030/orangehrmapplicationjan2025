package com.pagelayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.baselayer.BaseClass;

public class PersonalInformation extends BaseClass {

	@FindBy(xpath = "//label[text()='Employee Id']/parent::div/following-sibling::div/child::input")
	private WebElement empid;

	@FindBy(xpath = "//label[text()='Nationality']/parent::div/following-sibling::div/child::div")
	private WebElement nationality;

	@FindBys(@FindBy(xpath = "//div[@class='oxd-select-dropdown --positon-bottom']/descendant::span"))
	private List<WebElement> nationalityDropdownlist;

	@FindBy(xpath="//p[@class='oxd-text oxd-text--p orangehrm-form-hint']/following-sibling::button")
	private WebElement saveButton;
	

	public PersonalInformation() {
		PageFactory.initElements(driver, this);
	}

	public String captureEmpid() {
		return empid.getText();
	}

	public void selectNationality()
	{
		nationality.click();
		
		for(WebElement wb:nationalityDropdownlist)
		{
			String actualValue=wb.getText();
			
			if(actualValue.equalsIgnoreCase("Indian"))
			{
				wb.click();
				break;
			}
				
		}
	}
	
	public void clickOnSaveButton()
	{
		saveButton.click();
	}

}
