package testRunner;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import Common.baseClass;
import Common.initialize;
import Common.javaUtility;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/feature",
glue = {"step"}
,plugin = {"html:target/cucumber-html-report"}
,strict=true
)

public class testRunner extends baseClass {
	
	@BeforeClass
	public static void setUp() {
		javaUtility.creatFolder();
		System.out.println("Info : folder created successfully.");
		chromeSetup(initialize.testBrowser);
			System.out.println("Info : Browser opened successfully.");
		}
	
	
	@AfterClass
		public static void tearDown() {
			// Close the browser after each scenario
			if (driver != null) {
				driver.quit();
				System.out.println("Browser closed successfully.");
			}
		}
	
}