package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paragraph {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement txtTitle = driver.findElement(By.xpath("//a[@id='overview-tab']"));
		txtTitle.click();
		WebElement element = driver.findElement(By.xpath("(//p[contains(text(),'Greens Technologies')])[1]"));
		String text = element.getText();
		System.out.println(text);
		
		//driver.close();
		
	}
	
}
