package main;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import app.SmoketestHomePage;
import io.appium.java_client.android.AndroidDriver;

public class Main {
	/**
	 * 
	 */
	private AndroidDriver driver;
	/**
	 * 
	 */
	private WebDriverWait wait;
	
	/**
	 * This will be executed before first @Test method execution. It will be executed one only time throughout the test case.
	 * @throws MalformedURLException
	 */
	@BeforeClass
	private void init() throws MalformedURLException{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "M2101K6G");
		capabilities.setCapability("udid", "8f7767fe");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "11");
		capabilities.setCapability("appPackage", "com.amazon.mShop.android.shopping");
		capabilities.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");
		capabilities.setCapability("noReset", true);
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		System.out.println("=========================================");
		System.out.println("START APPLICATION");
		System.out.println("=========================================");
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	
	/**
	 * 
	 * @throws Exception
	 */
	@Test (priority = 1)
	public void executeSmoketest_HomePage_SearchBar() {
		try {
			SmoketestHomePage.homePage_searchbar(wait, driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @throws Exception
	 */
	@Test (priority = 2)
	public void executeSmoketest_HomePage_ToolBar() {
		try {
			SmoketestHomePage.homePage_ToolBar(wait, driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @throws Exception
	 */
	@Test (priority = 3)
	public void executeSmoketest_HomePage_ActionBar() {
		try {
			SmoketestHomePage.homePage_ActionBar(wait, driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * A method with this annotation will run once after the execution of all tests in the suite is complete.
	 */
	@AfterSuite
	private void quit() {
		System.out.println("=========================================");
		System.out.println("CLOSE APPLICATION");
		System.out.println("=========================================");
		driver.quit();
	}
}
