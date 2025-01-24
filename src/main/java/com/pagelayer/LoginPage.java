package com.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baselayer.BaseClass;

import io.cucumber.java.gl.Logo;

public class LoginPage extends BaseClass {

	@FindBy(name = "username")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//button[text()=' Login ']")
	private WebElement loginButton;

	@FindBy(xpath = "//input[@name='password']/parent::div/following-sibling::span")
	private WebElement passwordWarningMessage;

	@FindBy(xpath = "//input[@name='username']/parent::div/following-sibling::span")
	private WebElement usernameWarningMessage;

	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	private WebElement invalidCredentailsMessage;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Negative and Positive Scenario for Login functionality
	public void enterUsername(String Username) {
		username.sendKeys(Username);
	}

	public void enterPassword(String Password) {
		password.sendKeys(Password);
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

	public String capturePasswordWarning() {
		return passwordWarningMessage.getText();
	}

	public String captureUsernamedWarning() {
		return usernameWarningMessage.getText();
	}

	public String captureInvalidCredentailWarning() {
		return invalidCredentailsMessage.getText();
	}

}
