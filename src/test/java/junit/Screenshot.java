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

public class Screenshot {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		 driver= new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		}
	@Before
	public void beforeMethod() throws IOException {
		TakesScreenshot screenshot= (TakesScreenshot)driver;
		File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
		File desfile = new File("D:\\screenshot\\omr.jpg");
		FileUtils.copyFile(sourcefile, desfile);
		
	}
	@Test
	public void test() throws InterruptedException {
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys("bkindia1991@gmail.com");
		WebElement userPass = driver.findElement(By.id("pass"));
		userPass.sendKeys("kvq246KVQ@");
		WebElement btnClick = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		btnClick.click();
		Thread.sleep(3000);
		
	}
	
	@After
	public void afterMethod() throws IOException {
		TakesScreenshot screen = (TakesScreenshot)driver;
		File sfile = screen.getScreenshotAs(OutputType.FILE);
		File dfile = new File("D:\\screenshot\\omr1.jpg");
		FileUtils.copyFile(sfile, dfile);
		}
	@AfterClass
	public static void afterclass() {
		driver.quit();

	}
	
}
