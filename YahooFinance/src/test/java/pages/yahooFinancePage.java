package pages;

import org.openqa.selenium.By;

import Common.baseClass;
import Common.driverUtility;

public class yahooFinancePage extends baseClass {

   // web Elements
	public By searchBox = By.id("ybar-sbq");
	By firstAutoSuggestionText_Tesla = By.xpath("(//div[@data-id='search-assist-input-sugglst']//div)[1]/following::div[4]");
	By firstAutoSuggestion = By.xpath("//ul[@role='listbox']/li[1]");
	By teslaStocksPrice = By.xpath("//span[@data-testid='qsp-price']");
	public By previousClosePrice = By.xpath("//div[@data-testid='quote-statistics']//li[1]/span[2]");
	public By Volume = By.xpath("//div[@data-testid='quote-statistics']//li[7]/span[2]");

	public String getFirstAutoSuggestionText() {

		return driverUtility.getText(driver.findElement(firstAutoSuggestionText_Tesla));
	}

	public boolean clickfirstAutoSuggestion() throws InterruptedException {

		return driverUtility.clickElement(driver.findElement(firstAutoSuggestion));
	}

	public float getTeslaStockPrice() throws InterruptedException {
		driverUtility.visibilityOfElementLocated(teslaStocksPrice, 10);
		String price = driverUtility.getText(driver.findElement(teslaStocksPrice));
		float number = Float.parseFloat(price);
		return number;
	}
}
