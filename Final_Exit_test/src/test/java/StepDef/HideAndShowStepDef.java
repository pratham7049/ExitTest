package StepDef;

import org.testng.Assert;

import BasePack.BaseClass;
import BasePack.Log4j;
import Pages.HideAndshowPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HideAndShowStepDef extends BaseClass{
	
	public AppiumDriver<MobileElement> driver;
	HideAndshowPage page = new HideAndshowPage(driver);
	Log4j logger = new Log4j("HideAndShowStepDef");

	@Then("Hide-show animation option appears")
	public void hide_show_animation_option_appears() {
		HideAndshowPage page=new HideAndshowPage(driver);
		Assert.assertTrue(page.webele(page.option_hideShow).isDisplayed());
		logger.log.info("Hide and show option appears");
		
	}
	@When("User click on Hide-show option")
	public void user_click_on_hide_show_option() {
		HideAndshowPage page=new HideAndshowPage(driver);
		page.tap_Options(page.option_hideShow); 
		logger.log.info("Then i am able to see Hide show options");
	}

	@Then("button zero is visible")
	public void button_zero_is_visible() {
		HideAndshowPage page=new HideAndshowPage(driver);
		String actual=page.verify_HideShow_actions(page.button_zero);
		Assert.assertEquals(actual, "0");
		logger.log.info("Then zero button is visible");
	}

	@When("Click on zero button")
	public void click_on_zero_button() {
		HideAndshowPage page=new HideAndshowPage(driver);
	   page.tap_Options(page.button_zero);
	   logger.log.info("Button is clicked");
	}

	@Then("zero button hide")
	public void zero_button_hide() {
		HideAndshowPage page=new HideAndshowPage(driver);
		String actual=page.verify_HideShow_actions(page.button_zero);
		Assert.assertEquals(actual, "1");
		logger.log.info("Then button is hide");
	    
	}

	@When("click on show button")
	public void click_on_show_button() {
		HideAndshowPage page=new HideAndshowPage(driver);
		page.tap_Options(page.button_show);
		logger.log.info("Show button");
	}

	@Then("zero button is visible")
	public void zero_button_is_visible() {
		HideAndshowPage page=new HideAndshowPage(driver);
		String actual=page.verify_HideShow_actions(page.button_zero);
		Assert.assertEquals(actual, "0");
		logger.log.info("Zero is visible");
	}
}
