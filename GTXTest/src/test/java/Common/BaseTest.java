package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
        
        WebDriver driver  ;
        @BeforeSuite
		public void launchbrowser()
		{
	        driver=new ChromeDriver();
		    		
		}
        @AfterSuite
        public void closingbrowser() {
        	driver.close();
        }
}
