package UI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetDataFetch {

	public static void main(String[] args) throws IOException {
		
        String excelfilepath = "C:\\Users\\rohit.sandawa\\eclipse-workspace\\GTXTest\\TestData\\ProjectData.xlsx";
        // this path is also correct ----> .\\TestData\\ProjectData.xlsx
        
     // XSSFWorkbook > XSSFsheet > XSSFrow > XSSFCell these are object in the same hierarchy level.
        
        FileInputStream fis = new FileInputStream(excelfilepath);  
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        
         int rows = sheet.getLastRowNum();
         System.out.println(rows);
         int cells= sheet.getRow(1).getLastCellNum();
         System.out.println(cells);
        
        for(int r=0; r<= rows; r++) {
        	  XSSFRow row =sheet.getRow(r);
        	
        	for(int c =0; c<cells; c++) {
        		
        		XSSFCell cell = row.getCell(c);
        	     switch(cell.getCellType()) {
        	
        	     case STRING  : System.out.print(cell.getStringCellValue());  break;
        	     case NUMERIC : System.out.print(cell.getNumericCellValue()); break;
        	 
        	     }
        		
        		System.out.print("  * ");
         }

        	System.out.println("");
        }
        

	
	}

}