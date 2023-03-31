package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ReusableMethod.TapAndScroll;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AccrssiblityPage {

	
	public AppiumDriver<MobileElement> driver;

	public By AccesibilityButton = (By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]"));
	public By NodeQueringButton = (By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]"));
	public By ConquerWorldSelect = (By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.CheckBox"));
	public By NapDiselected = (By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.CheckBox"));
	public By Value = (By.id("android:id/action_bar"));

	public AccrssiblityPage(AppiumDriver<MobileElement> driver) {
    this.driver = driver;
}

	 // Clicking The Accessibility Button

	public void Accesibility_click(By locator) {
	driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    WebElement ele=driver.findElement(locator);
	TapAndScroll.tap1(driver, ele);
}

	// Clicking The Node Querying Button

	public void NodeQueringClick(By locator) {
	driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	WebElement ele = driver.findElement(locator);
	TapAndScroll.tap1(driver, ele);
}

	// Selecting and Disselecting options 


	public void SelectAndDiselect(By locator, By locator1){

	driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	WebElement ele = driver.findElement(locator);
	TapAndScroll.tap1(driver, ele);
	WebElement ele1 = driver.findElement(locator1);
	TapAndScroll.tap1(driver, ele1);

	}

}
