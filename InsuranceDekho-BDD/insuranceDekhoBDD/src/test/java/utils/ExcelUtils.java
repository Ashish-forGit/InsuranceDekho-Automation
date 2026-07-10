package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
    
    public static String readData(String filePath, String sheet, int row, int col){

        try(FileInputStream file = new FileInputStream(filePath);
            XSSFWorkbook wb = new XSSFWorkbook(file)) {

                XSSFSheet sheet1 = wb.getSheet(sheet);
                XSSFRow row1 = sheet1.getRow(row);
                XSSFCell cell = row1.getCell(col);

                DataFormatter format = new DataFormatter();
                return format.formatCellValue(cell);   // convert every cell value to string

            
        } catch (IOException e) {
            e.printStackTrace();
            
        }
        return "";

    }
}
