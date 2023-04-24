package Common;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test is start so call OntestStart Listesner");

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("this test is successful");

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("This test is failed buddy");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("This test is successfully skippped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    //didn't understand this 
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		onTestFailure(result);
	}

	public void onStart(ITestContext context) {
		System.out.println("This test is not start");
		
	}

	public void onFinish(ITestContext context) {
		
	}

}
