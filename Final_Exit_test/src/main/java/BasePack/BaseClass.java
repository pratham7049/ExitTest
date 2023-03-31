package BasePack;

import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import configProperties.DeviceConfigData;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

@Test
public class BaseClass {

//	public AppiumDriver<MobileElement> driver;
	private static DesiredCapabilities capabilties = new DesiredCapabilities();
	public static AppiumDriver<MobileElement> driver = null;

	public void setAndroidCapabilities() {
		capabilties.setCapability("appium-version", DeviceConfigData.getCapabilities("appium-version"));
		capabilties.setCapability("platformName", DeviceConfigData.getCapabilities("platformName"));
		capabilties.setCapability("platformVersion", DeviceConfigData.getCapabilities("platformVersion"));
		capabilties.setCapability("appPackage", DeviceConfigData.getCapabilities("appPackage"));
		capabilties.setCapability("appActivity", DeviceConfigData.getCapabilities("appActivity"));
		capabilties.setCapability("deviceName", DeviceConfigData.getCapabilities("deviceName"));
		capabilties.setCapability("app", DeviceConfigData.getCapabilities("app"));
	
		try {
			driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilties);
			}catch(Exception e) {
			e.printStackTrace();
			}
       }
	public static void End_The_Server() {
			driver.quit();
			}
}
