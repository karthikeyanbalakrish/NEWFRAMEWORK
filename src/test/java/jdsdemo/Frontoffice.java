package jdsdemo;


import org.openqa.selenium.WebElement;

public class Frontoffice extends Base{
		public static void main(String[] args) {
			Frontoffice office  =  new Frontoffice();
			office.frontoff();
			
		}
	
	private void frontoff(){
				
		browserLaunch();
		maximize();
		implicitWait();
		launchtheappln("http://117.247.99.72/jdsdemo/login.aspx");
		WebElement userName = locatorByXpath("//input[@id='TxtUser']");
		elementSendKeys("admin", userName);
		WebElement userPass = locatorByXpath("//input[@id='TxtPass']");		
		elementSendKeys("success", userPass);
		locatorbyid("BtnSubmit").click();
		WebElement loginPage = locatorByXpath( "//span[text()='Home']");
		String text = loginPage.getText();
		System.out.println(text);
		
		WebElement searchType = locatorbyid("M0001_A3_X3Y2_ddlAffiliation");
		elementDdnText(searchType, "FRONT OFFICE");
		
		locatorByXpath("//a[@href='#']").click();
		 WebElement trans = locatorByXpath("//h3[text()='TRANSACTIONS ']");
		 		String text1 = trans.getText();
		 		System.out.println(text1);
		
		locatorByXpath("//a[text()='OP REGISTRATION']").click();
		WebElement regPage = locatorByXpath("//span[text()='OP Registration']");
				String text2 = regPage.getText();
				System.out.println(text2);

		locatorByXpath("//a[@href='#']").click();
		
		locatorByXpath("//a[text()='OP LAB SERVICES']").click();
		WebElement labPage = locatorByXpath("//span[text()='OP Lab Service']");
				String text3 = labPage.getText();
				System.out.println(text3);
				
		locatorByXpath("//a[@href='#']").click();
		
		locatorByXpath("//a[text()='OP PACKAGE BILLING']").click();
		WebElement packagePage = locatorByXpath("//span[text()='OP Package Billing']");
				String text4 = packagePage.getText();
				System.out.println(text4);
		
		locatorByXpath("//a[@href='#']").click();
		
		locatorByXpath("//a[text()='REG. MODIFICATION']").click();
		WebElement modificationPage = locatorByXpath("//span[text()='OP Modification']");
						String text5 = modificationPage.getText();
						System.out.println(text5);
		
		locatorByXpath("//a[@href='#']").click();				
		
		locatorByXpath("//a[text()='DOCUMENT UPLOAD']").click();
		WebElement documentPage = locatorByXpath("//span[text()='Patient List']");
						String text6 = documentPage.getText();
						System.out.println(text6);
		
	}
	
	
}
