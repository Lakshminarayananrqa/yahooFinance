package step;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.testng.Assert;

import Common.baseClass;
import Common.driverUtility;
import Common.javaUtility;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.yahooFinancePage;

public class searchTeslaStockStep extends baseClass {

	yahooFinancePage YahooFinanceHomePage = new yahooFinancePage();

	

	@Given("user open the Yahoo Finance website")
	public void user_open_the_Yahoo_Finance_website() {
		driver.get(baseURL);
		System.out.println("Info : Yahoo Finance URL :" + baseURL);
	}

	@When("user search for {string}")
	public void user_search_for(String string) throws InterruptedException {
		boolean searchBox = driverUtility.enterText(driver.findElement(YahooFinanceHomePage.searchBox), string);
		Assert.assertTrue(searchBox);
	}

	@Then("user should see {string} as the first suggestion")
	public void user_should_see_as_the_first_suggestion(String string) {
		String suggestionText = YahooFinanceHomePage.getFirstAutoSuggestionText();
		System.out.println("Info : The first search suggestion is : " + suggestionText);
		driverUtility.assertText(string, suggestionText);
	}

	@Then("user click on the first suggestion")
	public void user_click_on_the_first_suggestion() throws InterruptedException {
		driverUtility.assertTrue(YahooFinanceHomePage.clickfirstAutoSuggestion());
	}

	@Then("user check the Stock Value greater then {string}")
	public void user_check_the_Stock_Value_greater_then(String string) throws InterruptedException {
		float suggestionText = YahooFinanceHomePage.getTeslaStockPrice();
		int expected = Integer.parseInt(string);
		boolean value;
		if (suggestionText > expected) {
			value = true;
			System.out.println("Tesla Stock price is greater than "+string+" and current price : " + suggestionText);
		} else {
			value = false;
			System.out.println("Tesla Stock price is not greater than "+string+" and current price : " + suggestionText);
		}
		driverUtility.assertTrue(value);
	}

	@Then("user should see previous close and volume values in stock detail")
	public void user_should_see_previous_close_and_volume_values_in_stock_detail() {

		String previousCloseText = driverUtility.getText(driver.findElement(YahooFinanceHomePage.previousClosePrice));
		String volumeText = driverUtility.getText(driver.findElement(YahooFinanceHomePage.Volume));
		System.out.println("Tesla previous day closed price = " + previousCloseText);
		System.out.println("tesla stock volume  = " + volumeText);
	}

	@After
	public void afterScenario(Scenario scenario) {
		if (scenario.isFailed()) {
			try {
				// Capture screenshot
				File addScreenshotToReport = javaUtility.captureScreenshot(driver, scenario.getName());
				scenario.attach(FileUtils.readFileToByteArray(addScreenshotToReport), "image/png", "screenshot");
				System.out.println("Info : screenshot captured successfully");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@After
	public void logScenarioOutcome(Scenario scenario) {
		System.out
				.println("Info : Scenario '" + scenario.getName() + "' " + (scenario.isFailed() ? "failed" : "passed"));
	}

}
