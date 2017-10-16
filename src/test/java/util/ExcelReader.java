package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public String[][] read() throws IOException{
		File file = new File(CommonDrivers.getProperty("dataFile"));
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("sheet");
		//getting the count of rows
		int countOfRows = sheet.getLastRowNum()+1; // starts with 0
		int countOfColumns	= sheet.getRow(0).getLastCellNum();// starts with 1
		String[][] value = new String[countOfRows][countOfColumns];
		
		
		return value;
		
	}
}
