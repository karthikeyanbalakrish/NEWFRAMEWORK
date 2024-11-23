

package dropdowntask;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class country {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/apitestingtraininginchennaiomr");
		
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("country-list"));
		Select s = new  Select(element);
		List<WebElement> options = s.getOptions();
//		for (int i=0; i<options.size();i++) {
//			WebElement element2 = options.get(i);
//			String text = element2.getText();
//			System.out.println(text);
    File file = new File("C:\\Users\\ADMIN\\eclipse-workspace\\dropdowntask\\src\\excel\\excel.xlsx");
    FileInputStream fis = new FileInputStream(file);
    Workbook workbook = new XSSFWorkbook(fis);
    Sheet sheet = workbook.getSheet("country");
    for (int i=1; i<options.size();i++) {
    	for (int j = 0; j < 1; j++) {
    		Row row=sheet.createRow(i);
    	    Cell cell= row.createCell(j);
    	    WebElement element2 = options.get(i);
			String text = element2.getText();
			cell.setCellValue(text);
			
    	    		}
    }
    FileOutputStream fos = new FileOutputStream(file);
    workbook.write(fos);
    
    
    
		
		
		
		
		
		
		
	}
	
}
