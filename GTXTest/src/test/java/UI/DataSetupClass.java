package UI;

import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;

public class DataSetupClass {

	@DataProvider(name = "firsdataprovider")
    
	public Object[][] TestData1(Method m) {
		Object[][] firstdataset = null;

		if (m.getName().equals("testdataneed1")) {

			firstdataset = new Object[][] {

					{ "name1", 1223 },
					{ "name2", 1224 }, 
					{ "name3", 1225 } };
		} else if (m.getName().equals("testdataneed2")) {
			firstdataset = new Object[][] {

					{ "name1", 1223, 341 }
					, { "name2", 1224, 342 },
					{ "name3", 1225, 343 } };
		}
		else if (m.getName().equals("testdataneed3")) {
			firstdataset = new Object[][] {

					{ "name1", 1223, 341, "Rohit" }, 
					{ "name2", 1224, 342,"Mohit"},
					{ "name3", 1225, 343, "Shobit"} };
		}
		return firstdataset;
	}
}
