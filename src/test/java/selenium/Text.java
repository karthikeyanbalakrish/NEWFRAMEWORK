package selenium;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement txtEmail = driver.findElement(By.id("email"));
	txtEmail.sendKeys("bkindia");
	
	@Nullable
	String attribute = txtEmail.getAttribute("value");
	System.out.println(attribute);
	
	driver.close();
	
	
}
}
