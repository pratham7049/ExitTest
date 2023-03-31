package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ReusableMethod.TapAndScroll;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class ActivityPage {

	public AppiumDriver<MobileElement> driver;

	public static By animation = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]");
	public static By activity_transition = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]\r\n");
	public static By Duck = MobileBy.id("com.example.android.apis:id/ducky");
	public static By Duck_Name = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]");

	public ActivityPage(AppiumDriver<MobileElement> driver) {
		this.driver=driver;	
	}

	public String Animation_activity(By locator) {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		return driver.findElement(locator).getText();
	}

	public void Activity_transitions(By locator) {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(locator);
		TapAndScroll.tap1(driver, ele);
	}

	public WebElement Duck(By locator) {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		return driver.findElement(locator);
	}
}
