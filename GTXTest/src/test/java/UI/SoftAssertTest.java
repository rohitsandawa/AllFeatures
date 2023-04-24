package UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest  {
	@Test
	public void CheckSoftAssert() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit.sandawa\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		// driver.manage().window().maximize();
		//String expectedtitle = "Swagger Labs";
		String Extitle = "Swagg Labs";
		
		
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		

		// we user soft assert only when we want to continue the execution if we are
		//expecting any error in our code so this method doesn't stop at error position 
		// it is continue with rest of the method execution.
		
		SoftAssert softassert = new SoftAssert();
		//softassert.assertEquals(expectedtitle, actualtitle);
		
		softassert.assertEquals(Extitle, actualtitle);
		System.out.println("Checking soft assert");
		
		
		driver.close();
		softassert.assertAll();  
		//The assertAll() method is called to throw all the exceptions caught during the process of
		//Selenium test automation execution and give us messgae what exactly the error in assertion.
	}

}
