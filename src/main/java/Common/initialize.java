package Common;

import org.openqa.selenium.WebDriver;
import java.io.File;

public class initialize {
	static File getDirectery = new File(System.getProperty("user.dir"));
	
	//OBJECTS
	public static WebDriver driver;
	
	//BROWSER
	public static String testBrowser=variable.CHROME.toString();
	
	//filepath
	public String baseURL="https://finance.yahoo.com/";
	//folder Path
	public static String screenShotFolder = getDirectery + "\\"+"faildscenarioScreenshot";
	
	   
	
	
}
