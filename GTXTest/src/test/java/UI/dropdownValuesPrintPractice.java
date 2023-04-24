package UI;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdownValuesPrintPractice {
	@Test
	public void dropdownvaluesprint() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit.sandawa\\chromedriver.exe\\");
	WebDriver driver = new ChromeDriver();
	driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	
	 WebElement ddown1 = driver.findElement(By.xpath("//select[@id='first']"));
     Select S = new Select(ddown1);
     Thread.sleep(3000);
     S.selectByIndex(2);
    
     
     List<WebElement> a = S.getOptions();
     int itemCount = a.size();
     
     for(int i = 0; i < itemCount; i++)
     {
         System.out.println(a.get(i).getText());
     }
     
     
     driver.close();
  
	
	}
	
	
	
}