package eCommerce;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class BaseIntegeration extends base{

	//public static void main(String[] args) throws InterruptedException {

	//}

	public void launch() throws InterruptedException {

		//WebDriver driver = new ChromeDriver();
		browserLaunch();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		implicitWait();
		//driver.get("https://omrbranch.com/");
		launchtheappln(getCurrentUrl());
		//driver.manage().window().maximize();
		maximize();

		//WebElement userMail = driver.findElement(By.id("email"));
		WebElement userMail = locatorbyid("email");

		//userMail.sendKeys("bkindia1991@gmail.com");
		elementSendKeys("bkindia1991@gmail.com", userMail);

		//WebElement userPass = driver.findElement(By.id("pass"));
		locatorbyid("pass").sendKeys("kvq246KVQ");

		//userPass.sendKeys("kvq246KVQ@");

		//WebElement btnClick = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		locatorByXpath("(//button[@type='submit'])[1]").click();
		//btnClick.click();

		//WebElement userName = driver.findElement(By.xpath("//a[@data-testid='username']"));
		WebElement userName = locatorByXpath("//a[@data-testid='username']");
		//String text = userName.getText();
		String text = elementGetText(userName);
		System.out.println(text);

		//WebElement txtSearch = driver.findElement(By.id("search"));
		locatorbyid("search").sendKeys("Nuts",Keys.ENTER);
		//txtSearch.sendKeys("Nuts",Keys.ENTER);

		//WebElement btnAdd = driver.findElement(By.xpath("(//a[text()='Add'])[1]"));
		//btnAdd.click();
		locatorByXpath("(//a[text()='Add'])[1]").click();
		Thread.sleep(3000);

		//WebElement btnAdd1 = driver.findElement(By.id("cart-21"));
		//btnAdd1.click();
		locatorbyid("cart-21").click();
		Thread.sleep(3000);

		//WebElement btnCart = driver.findElement(By.xpath("//a[text()=' Go To Cart ']"));
		//btnCart.click();
		locatorByXpath("//a[text()=' Go To Cart ']").click();
		
		//WebElement txtCart = driver.findElement(By.xpath("//h5[text()='My Cart']"));
		//String text2 = txtCart.getText();
		WebElement txtCart = locatorByXpath("//h5[text()='My Cart']");
		String text2 = elementGetText(txtCart);
		System.out.println(text2);
		
		//WebElement btnAdd3 = driver.findElement(By.xpath("/html/body/div[4]/section[2]/div/div[2]/div[2]/div/a"));
		//btnAdd3.click();
		locatorByXpath("/html/body/div[4]/section[2]/div/div[2]/div[2]/div/a").click();
		
		//WebElement addType = driver.findElement(By.id("address_type"));
		//Select select = new Select(addType);
		//select.selectByValue("Home");
		WebElement addType = locatorbyid("address_type");
		elementDdnAtrribute(addType,"Home");
				
		//WebElement addFname = driver.findElement(By.name("first_name"));
		//addFname.sendKeys("Karthikeyan");
		locatorbyname("first_name").sendKeys("Karthikeyan");
		
		//WebElement addLname = driver.findElement(By.name("last_name"));
		//addLname.sendKeys("Balakrishnan");
		locatorbyname("last_name").sendKeys("Balakrishnan");
		
		//WebElement addMbl = driver.findElement(By.name("mobile"));
		//addMbl.sendKeys("9095307711");
		locatorbyname("mobile").sendKeys("9095307711");
		
		//WebElement addnum = driver.findElement(By.name("apartment"));
		//addnum.sendKeys("2/2244");
		locatorbyname("apartment").sendKeys("2/2244");
		
		//WebElement addRess = driver.findElement(By.name("address"));
		//addRess.sendKeys("Aruna nagar Extension");
		locatorbyname("address").sendKeys("Aruna nagar Extension");
		
		//WebElement addCountry = driver.findElement(By.name("country"));
		//Select select1 = new Select(addCountry);
		//select1.selectByVisibleText("India");
		WebElement addCountry = locatorbyname("country");
		elementDdnAtrribute(addCountry, "India");

		//WebElement addState = driver.findElement(By.name("state"));
		//Select select2 = new Select(addState);
		//select2.selectByVisibleText("Tamil Nadu");
		WebElement addState = locatorbyname("country");
		elementDdnAtrribute(addState, "Tamil Nadu");

		
		//WebElement addCity = driver.findElement(By.name("city"));
		//Select select3 = new Select(addCity);
		//select3.selectByVisibleText("Karaikkudi");
		WebElement addCity = locatorbyname("country");
		elementDdnAtrribute(addCity, "Karaikkudi");

		//WebElement addZip = driver.findElement(By.name("zipcode"));
		//addZip.sendKeys("630002");
		locatorbyname("zipcode").sendKeys("630002");
		
		//WebElement btnSave = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		//btnSave.click();
		locatorByXpath("(//button[@type='submit'])[3]").click();
		Thread.sleep(3000);

		//WebElement btnPayment = driver.findElement(By.id("payment_type"));
		//Select select4= new Select(btnPayment);
		//select4.selectByIndex(1);
		WebElement btnPayment = locatorbyid("payment_type");
		elementDdnIndex(btnPayment, 1);
				
		//WebElement btnVisa = driver.findElement(By.xpath("//label[text()=' Visa ']"));
		//btnVisa.click();
		locatorByXpath("//label[text()=' Visa ']").click();
		
		//WebElement addCard = driver.findElement(By.name("card_no"));
		//addCard.sendKeys("5555555555552222");
		locatorbyname("card_no").sendKeys("5555555555552222");
		
		//WebElement btnMonth = driver.findElement(By.id("month"));
		//Select select5= new Select(btnMonth);
		//select5.selectByVisibleText("February");
		WebElement btnMonth = locatorbyid("month");
		elementDdnText(btnMonth, "February");
		
//		WebElement btnYear = driver.findElement(By.id("year"));
//		Select select6= new Select(btnYear);
//		select6.selectByIndex(3);
		WebElement btnYear = locatorbyid("year");
		elementDdnIndex(btnYear,3);
		
//		WebElement btnCvv = driver.findElement(By.name("cvv"));
//		btnCvv.sendKeys("987");
		locatorbyname("cvv").sendKeys("987");
		
//		WebElement btnOrder = driver.findElement(By.id("placeOrder"));
//		btnOrder.click();
		locatorbyid("placeOrder").click();
		Thread.sleep(3000);

//		WebElement ptnOrder = driver.findElement(By.xpath("(//span[@class='font16 fontNormal color36'])[1]"));
//		String text3 = ptnOrder.getText();

		WebElement ptnOrder = locatorByXpath("(//span[@class='font16 fontNormal color36'])[1]");
		String text3 = elementGetText(ptnOrder);
		System.out.println(text3);
		
		
		//driver.close();


	}

}


