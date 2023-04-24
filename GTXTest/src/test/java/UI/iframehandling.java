package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframehandling {
     //doubtful
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit.sandawa\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_iframe.asp");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(3);
		driver.findElement(By.xpath("div#belowtopnav>:first-child>:first-child>"
				                    + "div:nth-of-type(2)>a[class='w3-right w3-btn']")).click();


	}

}
