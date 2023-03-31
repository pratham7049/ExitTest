package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BasePack.BaseClass;
import BasePack.Log4j;
import Pages.TextPage;
import ReusableMethod.TapAndScroll;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TextStepDef extends BaseClass{
	
	public AppiumDriver<MobileElement> driver;
    TextPage page = new TextPage(driver);
    
    Log4j logger = new Log4j("TextStepDef");
	
	@Given("user click to the Text")
	public void user_click_to_the_text() {
		TextPage page=new TextPage(driver);
		page.verify_Text_tap(page.Text_Tap);
		logger.log.info("Text button is clicked");
	}

	@When("click to linkify")
	public void click_to_linkify() {
		TextPage page=new TextPage(driver);
		page.verify_Text_tap(page.Linkify_tab);
		logger.log.info("Then i am able to click Linkify");
	}

	@When("click to logTextBox")
	public void click_to_log_text_box() {
		TextPage page=new TextPage(driver);
		page.linkify_tap_Options(page.LogTextBox);
		logger.log.info("When click to logTextBox");
	}

	@Then("click to add button")
	public void click_to_add_button(By locator) {
		TextPage page=new TextPage(driver);
		page.linkify_tap_Options(page.Add_tab);
		WebElement ele=driver.findElement(locator);
		TapAndScroll.tap1(driver, ele);
		logger.log.info("Then clickto add button");
	}

}
