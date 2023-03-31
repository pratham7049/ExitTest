package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ReusableMethod.TapAndScroll;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class TextPage {

	public static By Text_Tap = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[12]\r\n");
	public static By Linkify_tab = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]\r\n");
	public static By LogTextBox = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]\r\n");
	public static By Add_tab = MobileBy.id("com.hmh.api:id/add");

	public AppiumDriver<MobileElement> driver;

	public TextPage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}

	public String verify_Text_tap(By locator) {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		return driver.findElement(locator).getText();
	}

	public void linkify_tap_Options(By locator) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(locator);
		TapAndScroll.tap1(driver, ele);

	}

	public WebElement logtextbox_webele(By locator) {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		return driver.findElement(locator);
	}

}
