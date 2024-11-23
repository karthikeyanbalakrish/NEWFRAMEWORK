package junit;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RepeatScreen {
	static WebDriver driver;
	@BeforeClass
public static void beforeclass() {
		driver = new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		}
	@Before
	public void beforeMethod() throws IOException {
		TakesScreenshot  screen = (TakesScreenshot)driver;
		File soFile = screen.getScreenshotAs(OutputType.FILE);
		File doFile = new File ("D:\\screenshot\\login.jpg");
		FileUtils.copyFile(soFile, doFile);
			}
	@Test
	
	public void  test() throws InterruptedException {
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys("bkindia1991@gmail.com");
		WebElement userpass = driver.findElement(By.id("pass"));
		userpass.sendKeys("kvq246KVQ@");
		WebElement btnClick = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		btnClick.click();
		Thread.sleep(3000);
		}
	@After
	public void afterMethod () throws IOException {
		TakesScreenshot  scr  = (TakesScreenshot)driver;
		File souFile = scr.getScreenshotAs(OutputType.FILE);
		File desFile = new File("D:\\screenshot\\welcome.jpg");
		FileUtils.copyFile(souFile, desFile);
			
	}
	@AfterClass
	public static void afterclass() {
		driver.quit();
		
	}
	
		
	
	
	
	

}
