package UI;

import org.testng.annotations.Test;

@Test(dataProvider="dataSetTest", dataProviderClass=T1.class)
public class T2 {
	
	public void abc (String a, int b ) {
		System.out.println("value of test datasets are "+a+ " and " + b);
		
		
	}

}
