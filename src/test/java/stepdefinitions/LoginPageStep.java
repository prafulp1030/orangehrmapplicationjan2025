package stepdefinitions;

import org.testng.Assert;

import com.baselayer.BaseClass;
import com.pagelayer.LoginPage;

import io.cucumber.java.en.Given;

public class LoginPageStep extends BaseClass {
	private static LoginPage loginPage;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		BaseClass.initialization();

	}

	@Given("user enter {string} username")
	public void user_enter_username(String username) {
		loginPage = new LoginPage();
		loginPage.enterUsername(username);
	}

	@Given("user enter {string} password")
	public void user_enter_password(String pasword) {
		loginPage.enterPassword(pasword);
	}

	@Given("user click on login button")
	public void user_click_on_login_button() {
		loginPage.clickOnLoginButton();
	}

	@Given("user capture warning error message on password text box")
	public void user_capture_warning_error_message_on_password_text_box() {
		String passwordWarning = loginPage.capturePasswordWarning();
		Assert.assertEquals(passwordWarning, "Required");
	}

	@Given("user capture warning error message on username text box")
	public void user_capture_warning_error_message_on_username_text_box() {
		String usernameWarning = loginPage.captureUsernamedWarning();
		Assert.assertEquals(usernameWarning, "Required");

	}

	@Given("user capture invalid warning error message")
	public void user_capture_invalid_warning_error_message() {
		String invalidwarning = loginPage.captureInvalidCredentailWarning();

		Assert.assertEquals(invalidwarning, "Invalid credentials");

	}

}
