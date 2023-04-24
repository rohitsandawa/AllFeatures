package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import Common.BaseTest;

public class TestUtils extends BaseTest{
	@Test
	 public void getScreenshots()throws IOException {
		 Date currentdate = new Date();
		 String ScreenshotfileName = currentdate.toString().replace(" ","_").replace(":","_");
		 TakesScreenshot driver;
		 File screenshotfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyfile(screenshotfile, new File(".//screenshot//"+ ScreenshotfileName+ ".png"));
		 
		 
		 
	 }

}
