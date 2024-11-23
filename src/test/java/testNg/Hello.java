package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Hello extends Base{

	@BeforeClass
	private void beforeClass() {
	browserLaunch();
	launchtheappln("https://omrbranch.com/");
	maximize();	
	implicitWait(30);	
	}
	@AfterClass
	private void afterClass() {
		closeCurrent();
	}
	@BeforeMethod
	private void beforeMethod() {
	long startTime = System.currentTimeMillis();
	System.out.println(startTime);
	}
	@AfterMethod
	private void afterMethod() {
	long startTime = System.currentTimeMillis();
	System.out.println(startTime);
	}
	
	@Parameters({"UserName","Password"})
	@Test
	private void login(String Username, String Password) {
	  LoginPage loginpage = new LoginPage();
	  loginpage.login(Username,Password);	  	
	}
	
	
}
