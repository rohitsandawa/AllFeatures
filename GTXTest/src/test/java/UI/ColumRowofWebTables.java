package UI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColumRowofWebTables {
	public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	driver.manage().window().maximize();
	
	// S1--> Get the number of Rows
	// s2--> Get the number of Column 
	//S3--> iterate row and column and get text and print it.
	
	List<WebElement> rowtotal = driver.findElements(By.xpath("//div[@class='w3-example']"
			+ "//child::div//child::table//child::tbody//child::tr"));
	
	
	
	List<WebElement> columtotal = driver.findElements(By.xpath("//div[@class='w3-example']//child::div"
			+ "//child::table//child::tbody//child::tr[2]//child::td"));
	
	
    int rowsize= rowtotal.size();
	System.out.println("total row in webtable is "+rowsize);
	
	int colsize= columtotal.size();
	System.out.println("total column in webtable is "+colsize);

	for (int i=2; i<=rowsize; i++) {
		
		for (int j= 1; j<=colsize; j++) {
			
			  System.out.print( driver.findElement(By.xpath("//div[@class='w3-example']//child::div//child::table//child::tbody//child::tr["+i+"]//child::td["+j+"]")).getText()+" *** ");
			
		}
		
		System.out.println("");
	}
	
}
}