package UI;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class BeforeAfterGroup {
	@Test (groups="Regression")
	public void GroupTest1() {
		System.out.println("This is Group Regression 1 Test");
		}
	

	@Test(groups="Functional")
	public void GroupTest2() {
		System.out.println("This is Group Functional 2 Test");
	}
	@Test (groups="Regression")
	public void GroupTest3() {
		System.out.println("This is Group Regression 3 Test");
		
		
	}
	@Test (groups="Functional")
	public void GroupTest4() {
		System.out.println("This is Group Functional 4 Test");
	}
	//-----------------------------------------------
	@BeforeGroups(value="Functional")
	public void beforegroup() {
		System.out.println("This is before group for functional method ");
		
	}
	@AfterGroups(value="Functional")
	public void aftergroup() {
		System.out.println("This is after group for Functional method ");
		
	}
	

}
