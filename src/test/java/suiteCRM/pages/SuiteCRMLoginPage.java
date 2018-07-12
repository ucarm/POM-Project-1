package suiteCRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuiteCRMLoginPage {

	public SuiteCRMLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user_name")
	public WebElement usernameBox;

	@FindBy(id = "username_password")
	public WebElement passwordBox;

	@FindBy(name = "Login")
	public WebElement logInButton;

	public void login(String username, String password) {
		usernameBox.sendKeys(username);
		passwordBox.sendKeys(password);
		logInButton.click();
	}
}
