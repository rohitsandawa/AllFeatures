package Common;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonRequirement {
	@BeforeSuite
	public void DatasetupStart() {
		System.out.println("This is before suit method which setup data for suite "
				+ "for which it is running");
		}
	
    @AfterSuite
	public void DataTeardown() {
		System.out.println("This is after suit method which Tear Down data for suite "
				+ "for which it is running");
		}
	
}
