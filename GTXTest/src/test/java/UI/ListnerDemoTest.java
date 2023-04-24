package UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Common.BaseTest;

public class ListnerDemoTest extends BaseTest {
          
	@Test
	public void LaunchApp() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		
	}	
}
