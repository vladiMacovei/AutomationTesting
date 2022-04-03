package app;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class DispositivaHomePage {
	
	public static void login(WebDriverWait wait, AndroidDriver driver) throws InterruptedException {
		driver.findElement(By.id("com.amazon.mShop.android.shopping:id/sign_in_button")).click();
		Thread.sleep(1000);
	}
}
