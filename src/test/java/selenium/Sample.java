package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement TxtUserName = driver.findElement(By.id("email"));
	TxtUserName.sendKeys("bkindia1991");
	
	WebElement TxtPass = driver.findElement(By.id("pass"));
	TxtPass.sendKeys("hnf08ish");
	
	
	WebElement btnlogin = driver.findElement(By.xpath("//button[@name='login']"));
	btnlogin.click();
	
	
	
}
}
