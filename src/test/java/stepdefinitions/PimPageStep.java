package stepdefinitions;

import org.testng.Assert;

import com.baselayer.BaseClass;
import com.pagelayer.PimPage;

import io.cucumber.java.en.When;

public class PimPageStep extends BaseClass {

	private PimPage pim;

	@When("user is on pim page he validates PimPage url")
	public void user_is_on_pim_page_he_validates_pim_page_url() {

		pim = new PimPage();

		String url=pim.valdiatePimPageURL();
		
		Assert.assertEquals(url.contains("pim"), true);
	}
}
