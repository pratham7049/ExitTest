package StepDef;

import BasePack.BaseClass;
import BasePack.Log4j;
import Pages.AccrssiblityPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AccessibilityStepDef extends BaseClass{
	
	public AppiumDriver<MobileElement> driver;

	AccrssiblityPage page = new AccrssiblityPage(driver);
	Log4j logger = new Log4j("AccessibilityStepDef");

	 public AccessibilityStepDef(BaseClass base) {
	 this.driver = driver;
	}
	@Given("Click on the Accessibility button")
	public void click_on_the_accessibility_button() {
		AccrssiblityPage page = new AccrssiblityPage(driver);
		page.Accesibility_click(page.AccesibilityButton);
		logger.log.info("I am able to click the Accessibility button");
	}

	@Given("Click on the Accessibility Node Quering button")
	public void click_on_the_accessibility_node_quering_button() {
		AccrssiblityPage page = new AccrssiblityPage(driver);
		page.NodeQueringClick(page.NodeQueringButton);
		logger.log.info("then click to Node Quering button");
	}

	@When("Filling two choices")
	public void filling_two_choices() {
		AccrssiblityPage page = new AccrssiblityPage(driver);
		page.SelectAndDiselect(page.ConquerWorldSelect,page.NapDiselected);
		logger.log.info("Then i am filling two choices");
	}

}
