package suiteCRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuiteCRMBase {
	WebDriver driver;

	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@AfterClass
	public void tearDown() {
		// if (driver != null)
		// driver.close();
	}

	/*
	 * @param expected title
	 * 
	 * will switch to new tab based on the expected title will switch back to
	 * original window if the expected title is not found
	 * 
	 */
	public void switchByTitle(String title) {
		String originalWin = driver.getWindowHandle();
		for (String each : driver.getWindowHandles()) {
			driver.switchTo().window(each);
			if (driver.getTitle().equals(title))
				return;
		}
		driver.switchTo().window(originalWin);
	}

}
