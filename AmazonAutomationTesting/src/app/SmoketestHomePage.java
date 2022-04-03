package app;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
/**
 * 
 * @author VMACOVEI
 *
 */
public class SmoketestHomePage {
	
	public static void homePage_searchbar(WebDriverWait wait, AndroidDriver driver) {
		System.out.println("=========================================");
		System.out.println("START SMOKETEST HOME-PAGE [search bar]");
		System.out.println("=========================================");
		
		By searchIcon = By.id("com.amazon.mShop.android.shopping:id/chrome_action_bar_search_icon");
		boolean searchIconIsDisplayed = wait.until(ExpectedConditions.visibilityOfElementLocated(searchIcon)).isDisplayed();
        Assert.assertEquals(searchIconIsDisplayed, true, "search Icon is displayed");
        
        By textEditSearchBar = By.id("com.amazon.mShop.android.shopping:id/chrome_search_hint_view");
		String strTextEditSearchBar = wait.until(ExpectedConditions.visibilityOfElementLocated(textEditSearchBar)).getText();
        Assert.assertEquals(strTextEditSearchBar, "Cerca su Amazon.it", "Cerca su Amazon.it is present");
        
        By cameraIcon = By.id("com.amazon.mShop.android.shopping:id/chrome_action_bar_camera_icon");
		boolean cameraIconIsDisplayed = wait.until(ExpectedConditions.visibilityOfElementLocated(cameraIcon)).isDisplayed();
        Assert.assertEquals(cameraIconIsDisplayed, true, "camera Icon is displayed");
        
        System.out.println("=========================================");
		System.out.println("END SMOKETEST HOME-PAGE [search bar]");
		System.out.println("=========================================");
	}
	
	public static void homePage_ToolBar(WebDriverWait wait, AndroidDriver driver) throws Exception {
		System.out.println("=========================================");
		System.out.println("START SMOKETEST HOME-PAGE [ToolBar]");
		System.out.println("=========================================");
		
		By labelListeAlexa = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView");
		String strListeAlexa = wait.until(ExpectedConditions.visibilityOfElementLocated(labelListeAlexa)).getText();
        Assert.assertEquals(strListeAlexa,"Liste Alexa","Liste alexa is present");
        
        By labelPrime = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.TextView");
		String strPrime = wait.until(ExpectedConditions.visibilityOfElementLocated(labelPrime)).getText();
        Assert.assertEquals(strPrime,"Prime", "Prime is present");
        
        By labelVideo = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.TextView");
		String strVideo = wait.until(ExpectedConditions.visibilityOfElementLocated(labelVideo)).getText();
        Assert.assertEquals(strVideo,"Video","Video is present");
        
        By labelMusica = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[4]/android.widget.TextView");
		String strMusica = wait.until(ExpectedConditions.visibilityOfElementLocated(labelMusica)).getText();
        Assert.assertEquals(strMusica,"Musica","Musica is present");
		
        System.out.println("=========================================");
		System.out.println("END SMOKETEST HOME-PAGE [ToolBar]");
		System.out.println("=========================================");
	}
	
	public static void homePage_ActionBar(WebDriverWait wait, AndroidDriver driver) {
		System.out.println("=========================================");
		System.out.println("START SMOKETEST HOME-PAGE [ActionBar]");
		System.out.println("=========================================");
		
		By actionBarHome = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[4]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.appcompat.app.ActionBar.Tab[1]");
		boolean actionBarHomeIsDisplayed = wait.until(ExpectedConditions.visibilityOfElementLocated(actionBarHome)).isDisplayed();
        Assert.assertEquals(actionBarHomeIsDisplayed, true, "Home icon is displayed in ActionBar");
        
        By actionBarProfile = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[4]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.appcompat.app.ActionBar.Tab[2]");
		boolean actionBarProfileIsDisplayed = wait.until(ExpectedConditions.visibilityOfElementLocated(actionBarProfile)).isDisplayed();
        Assert.assertEquals(actionBarProfileIsDisplayed, true, "Profile icon is displayed in ActionBar");
        
        By actionBarCarrello = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[4]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.appcompat.app.ActionBar.Tab[3]");
		boolean actionBarCarrelloIsDisplayed = wait.until(ExpectedConditions.visibilityOfElementLocated(actionBarCarrello)).isDisplayed();
        Assert.assertEquals(actionBarCarrelloIsDisplayed, true, "Carrello icon is displayed in ActionBar");
        
        By actionBarMenu = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[4]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.appcompat.app.ActionBar.Tab[4]");
		boolean actionBarMenuIsDisplayed = wait.until(ExpectedConditions.visibilityOfElementLocated(actionBarMenu)).isDisplayed();
        Assert.assertEquals(actionBarMenuIsDisplayed, true, "Menu icon is displayed in ActionBar");
		
        System.out.println("=========================================");
		System.out.println("END SMOKETEST HOME-PAGE [ActionBar]");
		System.out.println("=========================================");
	}
	
}
