package BasePack;

import java.net.MalformedURLException;

import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import cucumber.api.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class Runner {
	@CucumberOptions(features = { ".src/test/java/Feature" }, glue = { "StepDef" }, plugin = { "pretty",
			"html:target/cucumber-reports" })

	public class TestRunner extends AbstractTestNGCucumberTests {

		BaseClass base = new BaseClass();

		@BeforeMethod
		public void BeforeScenario(ITestContext context) throws MalformedURLException {
			//BaseClass.setAndroidCapabilities();
			BaseClass base = new BaseClass();
			base.setAndroidCapabilities();
		}

		@AfterMethod
		public void afterScenario(ITestContext context) {
			System.out.println("Closing the driver");
			base.End_The_Server();
			
		}
	}

}
