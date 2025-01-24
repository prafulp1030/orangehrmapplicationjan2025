package stepdefinitions;

import com.baselayer.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Hooks extends BaseClass {

	@BeforeAll
	public static void openBrowserAndLoginPage() {
		BaseClass.initialization();
	}

	@After
	public void refreshPage() throws InterruptedException {
		Thread.sleep(7000);
		driver.navigate().refresh();

	}
	
	@AfterAll
	public static void tearDown() {
		
		driver.quit();
	}

}
