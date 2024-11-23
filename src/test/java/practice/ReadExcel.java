package practice;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class ReadExcel extends base {

	public static void main(String[] args) throws IOException {
		ReadExcel add = new ReadExcel();
		add.facebook();
			
	}

    private void facebook() throws IOException {
    	browserLaunch();
    	launchtheappln("https://adactinhotelapp.com/");
    	WebElement element = locatorbyid("username");
    	elementSendKeys(getCellData("mic", 2, 0), element);
    	WebElement element2 = locatorbyid("password");
    	elementSendKeys(getCellData("mic", 2, 1), element2);
    	
    }
}
