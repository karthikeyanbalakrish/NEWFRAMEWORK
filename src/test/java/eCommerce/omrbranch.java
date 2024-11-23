package eCommerce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class omrbranch {
     public static void main(String[] args) throws InterruptedException {
    	 WebDriver driver = new ChromeDriver();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	 
    	 driver.get("https://omrbranch.com/");
    	 driver.manage().window().maximize();
    	 
    	 WebElement userMail = driver.findElement(By.id("	"));
    	 userMail.sendKeys("bkindia1991@gmail.com");
    	 
    	 WebElement userPass = driver.findElement(By.id("pass"));
    	 userPass.sendKeys("kvq246KVQ@");

    	 WebElement btnClick = driver.findElement(By.xpath("	"));
    	 btnClick.click();
    	 
    	 
    	 WebElement userName = driver.findElement(By.xpath("//a[@data-testid='username']"));
    	 String text = userName.getText();
    	 System.out.println(text);
    	 
    	 WebElement txtSearch = driver.findElement(By.id("search"));
    	 txtSearch.sendKeys("Nuts",Keys.ENTER);
    	 
    	 WebElement btnAdd = driver.findElement(By.xpath("(//a[text()='Add'])[1]"));
    	 btnAdd.click();
    	 Thread.sleep(3000);
    	 
    	 WebElement btnAdd1 = driver.findElement(By.id("cart-21"));
    	 btnAdd1.click();
    	 Thread.sleep(3000);
    	 
    	 WebElement btnCart = driver.findElement(By.xpath("//a[text()=' Go To Cart ']"));
    	 btnCart.click();
    	 
    	 WebElement txtCart = driver.findElement(By.xpath("//h5[text()='My Cart']"));
    	 String text2 = txtCart.getText();
    	 System.out.println(text2);
    	 
    	 WebElement btnAdd3 = driver.findElement(By.xpath("/html/body/div[4]/section[2]/div/div[2]/div[2]/div/a"));
    	 btnAdd3.click();
    	 
    	 WebElement addType = driver.findElement(By.id("address_type"));
    	 Select select = new Select(addType);
    	 select.selectByValue("Home");
    	 
    	 WebElement addFname = driver.findElement(By.name("first_name"));
    	 addFname.sendKeys("Karthikeyan");
    	 
    	 WebElement addLname = driver.findElement(By.name("last_name"));
    	 addLname.sendKeys("Balakrishnan");
    	 
    	 WebElement addMbl = driver.findElement(By.name("mobile"));
    	 addMbl.sendKeys("9095307711");
    	 
    	 WebElement addnum = driver.findElement(By.name("apartment"));
    	 addnum.sendKeys("2/2244");
    	 
    	 WebElement addRess = driver.findElement(By.name("address"));
    	 addRess.sendKeys("Aruna nagar Extension");
    	 
    	 WebElement addCountry = driver.findElement(By.name("country"));
    	 Select select1 = new Select(addCountry);
    	 select1.selectByVisibleText("India");
    	 

    	 WebElement addState = driver.findElement(By.name("state"));
    	 Select select2 = new Select(addState);
    	 select2.selectByVisibleText("Tamil Nadu");
    	 
    	 WebElement addCity = driver.findElement(By.name("city"));
    	 Select select3 = new Select(addCity);
    	 select3.selectByVisibleText("Karaikkudi");
    	 
    	 WebElement addZip = driver.findElement(By.name("zipcode"));
    	 addZip.sendKeys("630002");
    	 
    	 WebElement btnSave = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
    	 btnSave.click();
    	 Thread.sleep(3000);
    	 
    	 WebElement btnPayment = driver.findElement(By.id("payment_type"));
    	 Select select4= new Select(btnPayment);
    	 select4.selectByIndex(1);
    	 
    	 WebElement btnVisa = driver.findElement(By.xpath("//label[text()=' Visa ']"));
    	 btnVisa.click();
    	 
    	 WebElement addCard = driver.findElement(By.name("card_no"));
    	 addCard.sendKeys("5555555555552222");
    	 
    	 WebElement btnMonth = driver.findElement(By.id("month"));
    	 Select select5= new Select(btnMonth);
    	 select5.selectByVisibleText("February");
    	 
    	 WebElement btnYear = driver.findElement(By.id("year"));
    	 Select select6= new Select(btnYear);
    	 select6.selectByIndex(3);
    	 
    	 WebElement btnCvv = driver.findElement(By.name("cvv"));
    	 btnCvv.sendKeys("987");
    	 
    	 WebElement btnOrder = driver.findElement(By.id("placeOrder"));
    	 btnOrder.click();
    	 Thread.sleep(3000);
    	 
    	 WebElement ptnOrder = driver.findElement(By.xpath("(//span[@class='font16 fontNormal color36'])[1]"));
    	 String text3 = ptnOrder.getText();
    	 System.out.println(text3);
    	 
    	 //driver.close();
    	 
    	     	 
    	 }
	
}
