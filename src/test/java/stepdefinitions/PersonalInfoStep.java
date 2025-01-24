package stepdefinitions;

import com.baselayer.BaseClass;
import com.pagelayer.PersonalInformation;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PersonalInfoStep extends BaseClass {

	private static PersonalInformation info;

	static String empid;

	@When("user is on personalInfo page capture Empid")
	public void user_is_on_personal_info_page_capture_empid() {

		info = new PersonalInformation();

		empid = info.captureEmpid();
	}

	@When("user select his Nationality")
	public void user_select_his_nationality() {

		info.selectNationality();

	}

	@When("user click on personalInfo page save button")
	public void user_click_on_personal_info_page_save_button() {
		
		info.clickOnSaveButton();
	}

}
