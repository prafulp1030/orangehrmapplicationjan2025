package stepdefinitions;

import org.testng.Assert;

import com.baselayer.BaseClass;
import com.pagelayer.PimPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PimPageStep extends BaseClass {

	private PimPage pim;

	@When("user is on pim page he validates PimPage url")
	public void user_is_on_pim_page_he_validates_pim_page_url() {

		pim = new PimPage();

		String url = pim.valdiatePimPageURL();

		Assert.assertEquals(url.contains("pim"), true);
	}

	@When("user click on addEmployee button")
	public void user_click_on_add_employee_button() {

		pim.clickOnAddEmployee();

	}

	@Then("user enters firstname and lastname")
	public void user_enters_firstname_and_lastname() {

		pim.enterUserDetails("Shruti", "More");
	}

	@Then("user click on save button")
	public void user_click_on_save_button() {

		pim.clickOnSaveBtn();
	}
}
