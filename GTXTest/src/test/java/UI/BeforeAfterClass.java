package UI;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAfterClass {
	@Test
	public void method1() {
		System.out.println("method 1 is running");
		}
	
	@BeforeClass
	public void method2() {
		System.out.println("before method is running");
		}
	@Test
	public void method3() {
		System.out.println("method 3 is running");
		}
	
	@AfterClass
	public void method4() {
		System.out.println("after method is running");
		}
	@Test
	public void method5() {
		System.out.println("method 5 is running");
		
		
		}

}
  
   
