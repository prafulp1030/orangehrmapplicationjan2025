package stepdefinitions;

import org.testng.Assert;

import com.baselayer.BaseClass;
import com.pagelayer.HomePage;

import io.cucumber.java.en.When;

public class HomePageStep extends BaseClass {

	private static HomePage home;

	@When("user is on homepage validate logo")
	public void user_is_on_homepage_validate_logo() {

		home = new HomePage();

		Assert.assertEquals(home.validateLogo(), true);

	}

	@When("user validate url")
	public void user_validate_url() {

		String url = home.validateURL();

		Assert.assertEquals(url.equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"),
				true);
	}

	@When("user validate Title")
	public void user_validate_title() {

		String title = home.validateTitle();

		Assert.assertEquals(title.contains("Orange"), true);
	}

	@When("User click on Pimlink")
	public void user_click_on_pimlink() {

		home.clickOnPimLink();
	}

}
