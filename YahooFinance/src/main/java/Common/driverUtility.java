package Common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class driverUtility extends javaUtility {
	
		//click action
		public static boolean clickElement(WebElement location) throws InterruptedException {
			Thread.sleep(2000);
			location.click();
			return true;
		}

		//get text
		public static String getText(WebElement location) {
			return location.getText();
		}
		//Clear text box/area & enter string
		public static boolean enterText(WebElement location, String value) throws InterruptedException {
			location.clear();
			threadSleep(1000);
			location.sendKeys(value);
			threadSleep(1000);
			return true;
		}
		
		//Implicit_wait TimeUnit.SECONDS
		public static  void implicitWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);	
		}
		//Thread Sleep
		public static void threadSleep(int sleepTime) throws InterruptedException {
			Thread.sleep(sleepTime);
		}
		//Wait For elementToBeClickable
		public static boolean elementToBeClickable(WebElement Locator, int seconds) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, seconds);
				wait.until(ExpectedConditions.elementToBeClickable(Locator));
				return true;
			} catch (Exception e) {
				return false;
			}	
		}
		
		//wait for element visibility of Element Located
		
		public static boolean visibilityOfElementLocated(By Locator, int seconds) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, seconds);
				wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
				return true;
			} catch (Exception e) {
				return false;
			}	
		}
		//Wait For given Element Present
		public static boolean NumberOfElementPresent(List<WebElement> processingBar_icon, long seconds, int elementCount) {
			WebDriverWait wait = new WebDriverWait(driver, seconds);
			wait.until(ExpectedConditions.numberOfElementsToBe((By) processingBar_icon, elementCount));
			return true;
		}
		//Press enter button
		public static boolean pressEnterButton() throws InterruptedException{
			Actions action = new Actions(driver);
			action.sendKeys(Keys.ENTER).build().perform();
			threadSleep(2000);
			return true;
		}
		
		//assert two string 
		public static void assertText(String Actual_text,String Expected_text){
		
			Assert.assertEquals(Actual_text,Expected_text);	
			}	
		
		//assert true
		public static void assertTrue(boolean condition){
			Assert.assertTrue(condition);	
			}
		//assert Fales
		public static void assertFalse(boolean condition){
			Assert.assertFalse(condition);	
			}
}