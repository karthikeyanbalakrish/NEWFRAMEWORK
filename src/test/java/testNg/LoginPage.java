package testNg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	private WebElement txtEmail;
	
	@FindBy(id="pass")
	private WebElement txtPass;
	
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	private WebElement btnLogin;
	
	public WebElement getTxtEmail() {
		return txtEmail;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	public void login(String email, String Password) {
	elementSendKeys(email, txtEmail);
	elementSendKeys(Password,txtPass);
	elementClick(btnLogin);
		
	}
	
	
	
}
	