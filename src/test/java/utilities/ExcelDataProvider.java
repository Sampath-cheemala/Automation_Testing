package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;
public class ExcelDataProvider {

	
	   @DataProvider(name = "excelData")
	    public static Object[][] getExcelData() throws IOException {
		   String filePath = "C:/Users/Creator/Downloads/testdata.xlsx";

		    String sheetName = "Sheet1";
	        excelUtility excel = new excelUtility(filePath, sheetName);
	        int rowCount = excel.getRowCount();
	        int colCount = excel.getCellCount(0);
	        
	        Object[][] data = new Object[rowCount - 1][colCount];
	        
	        for (int i = 1; i < rowCount; i++) { // Skipping header row
	            for (int j = 0; j < colCount; j++) {
	                data[i - 1][j] = excel.getCellData(i, j);
	            }
	        }
	        return data;
	    }
}
