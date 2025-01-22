package Common;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class javaUtility extends initialize{

 public static File captureScreenshot(WebDriver driver, String screenshotName) throws IOException {
	  // Take screenshot
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String timedate=getdateAndTime();
        File destFile = new File(screenShotFolder+"/"+screenshotName+timedate+".png");
        FileUtils.copyFile(srcFile, destFile);
       return srcFile;
 }
 
//Create Folder
	public static void creatFolder() {
		String[] folderPath = {initialize.screenShotFolder};
		for (int i = 0; i < folderPath.length; i++) {
			File file = new File(folderPath[i]);
			try {
				if (file.exists()) {
					FileUtils.deleteDirectory(new File(folderPath[i]));
				}
				file.mkdirs();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static String getdateAndTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yy_HH_mm");
	 	 Date now = new Date();
	 	 String formattedDate = sdf.format(now);
		return formattedDate;

	}
}