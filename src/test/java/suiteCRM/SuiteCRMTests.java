package suiteCRM;

import org.testng.annotations.Test;

import suiteCRM.Utils.SuiteCRMConfigLoader;
import suiteCRM.pages.SuiteCRMLoginPage;

public class SuiteCRMTests extends SuiteCRMBase {
	
	SuiteCRMLoginPage loginPage;
	
	@Test(description = "login to suiteCRm website", priority = 1)
	public void loginTest() {
		loginPage= new SuiteCRMLoginPage(driver);
		driver.get(SuiteCRMConfigLoader.getMyValue("URL"));
		loginPage.login(SuiteCRMConfigLoader.getMyValue("username_admin"), SuiteCRMConfigLoader.getMyValue("password_admin"));
	}

}
