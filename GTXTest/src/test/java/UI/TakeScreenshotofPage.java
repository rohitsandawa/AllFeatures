package UI;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotofPage {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://openai.com/blog/chatgpt");
		driver.manage().window().maximize();
		
	
		//Convert web driver object to TakeScreenshot
		
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		
		// Call getScreenshotAs method to create image file
	
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		
		//Copy file to Desired Location
		
		try {
            FileUtils.copyFile(SrcFile, new File("C:\\Users\\rohit.sandawa\\.eclipse\\sshots\\Screenshots.png"));
            System.out.println("Screenshot taken successfully.");
        } catch (Exception e) {
            System.out.println("Failed to take screenshot. Error: " + e.getMessage());
        }
		driver.close();
		
 }
}