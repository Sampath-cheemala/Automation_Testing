package utilities;
import java.io.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class excelUtility {
    public String filePath;
    public FileInputStream fis;
    public XSSFWorkbook workbook;
    public XSSFSheet sheet;

    public excelUtility(String filePath, String sheetName) throws IOException {
        this.filePath = filePath;
        fis = new FileInputStream(filePath);
        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheet(sheetName);
        fis.close();
    }

    public int getRowCount() {
        return sheet.getLastRowNum() + 1;
    }

    public int getCellCount(int rowNum) {
        Row row = sheet.getRow(rowNum);
        return (row == null) ? 0 : row.getLastCellNum();
    }

    public String getCellData(int rowNum, int colNum) {
        Row row = sheet.getRow(rowNum);
        if (row == null) {
            return "";
        }
        Cell cell = row.getCell(colNum);
        if (cell == null) {
            return "";
        }
        return cell.toString();
    }
}
