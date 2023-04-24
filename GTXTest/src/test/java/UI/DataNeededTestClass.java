package UI;

import org.testng.annotations.Test;

@Test(dataProvider = "firsdataprovider", dataProviderClass = DataSetupClass.class)
public class DataNeededTestClass {
    public void testdataneed1 (String name, int password) {
    	
    	System.out.println("name ="+ name +"----"+"password =" +password);
    	
    }
    
 public void testdataneed2 (String name, int password, int CVV) {
    	
    	System.out.println("name ="+name +"----"+"Password ="+password+"-----"+"CVV ="+CVV);
    	
    }
 public void testdataneed3 (String name, int password, int CVV,  String petname) {
 	
 	System.out.println("name ="+name +"----"+"Password ="+password+"-----"+"CVV ="+CVV+"------"+"petname ="+ petname);
 	
 }
 
 }
