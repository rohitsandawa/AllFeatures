package UI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTesting {
	@Test
	public void checkassert() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit.sandawa\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		//driver.manage().window().maximize();
		String expectedtitle= "Swag Labs";
		
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		Assert.assertEquals(expectedtitle, actualtitle);
		
		
       //driver.quit() is used for quitting all the window.
	    driver.close();
		
	}
}
