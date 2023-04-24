package UI;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windowhandletest {
	@Test

	public void windowtest() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit.sandawa\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zoho.com/");
		//System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='zsocial-icon icon-fb']")).click();
		driver.findElement(By.xpath("//a[@class='zsocial-icon icon-tw']")).click();
		driver.findElement(By.xpath("//a[@class='zsocial-icon icon-ln']")).click();
		driver.findElement(By.xpath("//a[@class='zsocial-icon icon-yt']")).click();

		String Parenthandle = driver.getWindowHandle();
		System.out.println("Parent window handle ID is---- " + Parenthandle);

		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) {

			String ChildWindow = i1.next();
			if (!Parenthandle.equals(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				String Title = driver.getTitle();
				
				if (Title.equals("Zoho - Home | Facebook")) {
					driver.findElement(By.name("email")).sendKeys("Rohit");
					Thread.sleep(3000);
					System.out.println(driver.getCurrentUrl());
					driver.close();}

				     else if (Title.equals("Sign In | LinkedIn")) {
					      driver.findElement(By.name("email-or-phone")).sendKeys("Shahrukh");
					      Thread.sleep(3000);
					      driver.close();

				      } else if (Title.equals("Zoho (@Zoho) / Twitter")) {
					     driver.findElement(By.xpath("//input[@placeholder='Search Twitter']")).sendKeys("Salman");
					     Thread.sleep(3000);
					     driver.close();

				          } else if (Title.equals("Zoho - YouTube")) {
					              driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-logo']")).click();
					              Thread.sleep(3000);
					              driver.close();

				}
				
				

			}
			

		}
		driver.switchTo().window(Parenthandle);
		Thread.sleep(5000);
		driver.close();

	}
}
