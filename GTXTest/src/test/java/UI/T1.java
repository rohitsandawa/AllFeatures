package UI;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class T1 {
  @DataProvider(name="dataSetTest")
  public Object[][] datasetupping(Method m) {
      
	  Object[][] datasetexample  = null ;
	  if(m.getName().equals("abc")) {
		  
		  datasetexample = new Object[][] {
			  {"test1",134},{"test2",133}
	 
		  };
		  
	  }
	  return datasetexample ;
  }

 
}
