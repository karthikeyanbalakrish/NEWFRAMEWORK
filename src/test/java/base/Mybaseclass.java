package base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mybaseclass {
	WebDriver driver;
	
	
	public void browserlaunch() {
		driver = new ChromeDriver();
		}
	
	public void geturl(String data) {
		driver.get(data);
	}
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public void elementSendkeys(WebElement element,String data) {
		element.sendKeys(data);
		}
	public void elementClick(WebElement element) {
		element.click();
	}	
	public void alertAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public void alertDismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	public String elementText(WebElement element) {
		String text = element.getText();
		return text;
	}
	public String getAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}
	


}



