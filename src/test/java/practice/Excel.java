package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String[] args) throws IOException {
File file= new File("C:\\Users\\ADMIN\\eclipse-workspace\\dropdowntask\\src\\excel\\karthi.xlsx");
	FileInputStream fi = new FileInputStream(file);
	Workbook wK	= new XSSFWorkbook(fi);
	Sheet sheet = wK.getSheet("mic");
	int NumberOfRows = sheet.getPhysicalNumberOfRows();
	for (int i = 0; i < NumberOfRows; i++) {
		Row row = sheet.getRow(i);
		int numberOfCells = row.getPhysicalNumberOfCells();
		for (int j = 0; j < numberOfCells; j++) {
			Cell cell = row.getCell(j);
//			String value = cell.toString();
//			System.out.println(value);
			
			CellType type = cell.getCellType();
			String value ="";
			if (type == CellType.STRING) {
				value = cell.getStringCellValue();
			}
			else if (DateUtil.isCellDateFormatted(cell)) {
				Date date = cell.getDateCellValue();
				SimpleDateFormat  sim =new  SimpleDateFormat("dd-MM-yyyy");
				value = sim.format(date);
			}
			else {
				double cellValue = cell.getNumericCellValue();
				long li = (long)cellValue;
				value = String.valueOf(li);
						}
			System.out.println(value);
		
	}
	}
	}
	}

	
	
	
	
	
	
	
	
	
	
	
	

