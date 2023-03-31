package StepDef;

import BasePack.BaseClass;
import BasePack.Log4j;
import Pages.ActivityPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActivityStepDef extends BaseClass{
	
	public AppiumDriver<MobileElement> driver;
	
	ActivityPage page = new ActivityPage(driver);
	Log4j logger = new Log4j("ActivityStepDef");
	
	@Given("user click to animation tab")
	public void user_click_to_animation_tab() {
		ActivityPage page = new ActivityPage(driver);
		page.Animation_activity(page.animation);
		logger.log.info("activity tap is visible");
	}

	@When("user click to activiy transition element")
	public void user_click_to_activiy_transition_element() {
		ActivityPage page = new ActivityPage(driver);
		page.Activity_transitions(page.activity_transition);
		logger.log.info("Then i am able to click Activity transition");
	}

	@When("click to Duck photo")
	public void click_to_duck_photo() {
		ActivityPage page = new ActivityPage(driver);
		page.Duck(page.Duck);
		logger.log.info("Duck photo is displayed");
	}

	@Then("click to duck_name")
	public void click_to_duck_name() {
		ActivityPage page = new ActivityPage(driver);
		page.Duck(page.Duck);
		logger.log.info("Duck name is clicked");
	}

}
