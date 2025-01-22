package Common;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class baseClass extends driverUtility {

	public static void chromeSetup(String browser) {
		if (browser.equalsIgnoreCase("CHROME")) {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			//driver = new ChromeDriver();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized"); // Start maximized
			// Initialize the ChromeDriver
			driver = new ChromeDriver(options);
		}
	}
}