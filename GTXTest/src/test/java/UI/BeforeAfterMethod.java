package UI;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Common.CommonRequirement;

public class BeforeAfterMethod extends CommonRequirement {
	@Test
	public void method1() {
		System.out.println("Method 1 is running");
	}
	@Test
	public void method2() {
		System.out.println("Method 2 is running");
	}
	@Test
	public void method3() {
		System.out.println("Method 3 is running");
	}
	//-----------------------------------------------------
	@BeforeMethod
	public void beforemethod() {
		System.out.println("before method run before each method");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("after method run after each method");
	}

}
