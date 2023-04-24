package UI;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Common.CommonRequirement;

public class BeforeAfterTest extends CommonRequirement {
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test method is running, Log in to portal");
	}
    
	@AfterTest
   public void afterTest() {
	System.out.println("after test method is running, Log out from portal");
	 }
   
   @Test
   public void method1() {
	   System.out.println("method 1 is running ");
   }
   @Test
   public void method2() {
	   System.out.println("method 2 is running ");
	   
   }
   @Test
   public void method3() {
	   System.out.println("method 3 is running ");
   }
   

}