package UI;

import org.testng.annotations.Test;

public class Groups {
	@Test (groups="Regression", priority=4)
	public void GroupTest1() {
		System.out.println("This is Group Regression 1 Test");
		}
	
	@Test(groups="Functional",priority=2)
	public void GroupTest2() {
		System.out.println("This is Group Functional 2 Test");
	}
	@Test (groups={"Regression","Functional"},priority=1)
	public void GroupTest3() {
		System.out.println("This is Group Regression 3 Test");
		
	}
	@Test (groups="Functional",priority=3)
	public void GroupTest4() {
		System.out.println("This is Group Functional 4 Test");
	}
}
