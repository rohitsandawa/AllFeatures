package UI;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemo {
	boolean Datasetup = true;

	@Test
	public void method1() {
		System.out.println("I am a normal test");
	}

	@Test(enabled = false)
	public void method2() {
		System.out.println("Skip this test and this won't be available in skips test");
	}

	@Test
	public void method3() {
		System.out.println(" Skip this test");
		throw new SkipException("Skiping this test forcefully");
		//SkipException help to print the reason of skiping
	}
//below is skipping of test based on certain condition
	@Test
	public void method4() {
		
		if (Datasetup = false) {
			System.out.println(" Data is setup so executing the test");
		} else {
			System.out.println("Dat is not setup so not executing the test");
			throw new SkipException(" Data is not setup so not executing the test");
		}

	}

}