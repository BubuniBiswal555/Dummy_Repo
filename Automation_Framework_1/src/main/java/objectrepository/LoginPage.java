package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id = "Email")
	private WebElement emailTextField;

	@FindBy(id = "Password")
	private WebElement passwordTextField;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginbutton;

	@FindBy(xpath = "//label[text()='Remember me?']")
	private WebElement remembermecheckbox;

	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	public WebElement getEmail() {
	return emailTextField;
	}

	public WebElement getPassword() {
	return passwordTextField;
	}

	public WebElement getLoginbutton() {
	return loginbutton;
	}

	public WebElement getRemembermecheckbox() {
	return remembermecheckbox;
	}


	}



