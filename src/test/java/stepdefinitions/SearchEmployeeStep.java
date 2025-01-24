package stepdefinitions;

import com.baselayer.BaseClass;
import com.pagelayer.SearchEmployee;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchEmployeeStep extends BaseClass{
	
	private SearchEmployee emp;
	
	@When("user click on employeeList button")
	public void user_click_on_employee_list_button() {
		
		emp=new SearchEmployee();
		
		emp.clickOnEmpList();
	   
	}
	@Then("user enter captured userId in text box")
	public void user_enter_captured_user_id_in_text_box() {
		
		String id=PersonalInfoStep.empid;
		
		emp.enterId(id);
	  
	}
	@Then("user click on search button")
	public void user_click_on_search_button() {
	  
		emp.clickOnSearchBtn();
		
	}


}
