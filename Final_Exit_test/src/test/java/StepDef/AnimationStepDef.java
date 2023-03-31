package StepDef;

import org.testng.Assert;

import BasePack.BaseClass;
import BasePack.Log4j;
import Pages.AnimationPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AnimationStepDef extends BaseClass{

      public AppiumDriver<MobileElement> driver;
      AnimationPage page = new AnimationPage(driver);
      
      Log4j logger = new Log4j("AnimationStepDef");
	
	@Given("Api Demos app is launched and animation option is visible")
	public void api_demos_app_is_launched() {
		AnimationPage page=new AnimationPage(driver);
		Assert.assertEquals(page.verify_Animation_actions(page.option_animation), "Animation");
		logger.log.info("I am able to see Animation tap");
	}
	
	@When("User choose option named as Animation")
	public void user_choose_option_named_as_animation() {
		AnimationPage page=new AnimationPage(driver);
		page.tap_Options(page.option_animation);
		logger.log.info("Animation is clicked");

	}

	@Then("Default layout option appears")
	public void default_layout_option_appears() {
		AnimationPage page=new AnimationPage(driver);
		boolean actual=page.webele(page.option_defLayout).isDisplayed(); 
        Assert.assertTrue(actual);
        logger.log.info("Default layout option appears");
	}

	@When("User click on Default layout animation")
	public void user_click_on_default_layout_animation() {
		AnimationPage page=new AnimationPage(driver);
		page.tap_Options(page.option_defLayout);
		logger.log.info("Then i am able to click Default layout animation");
	}

	@When("User click on add button")
	public void user_click_on_add_button() {
		AnimationPage page=new AnimationPage(driver);
		page.tap_Options(page.button_add);
		logger.log.info("Then click to add button");
	}

	@Then("User can see a button")
	public void user_can_see_a_button() {
		AnimationPage page=new AnimationPage(driver);
		boolean actual=page.webele(page.button_appear).isDisplayed();
        Assert.assertTrue(actual);
        logger.log.info("Then you can see button");
	}

}
