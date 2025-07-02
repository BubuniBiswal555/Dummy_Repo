package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingCartLink;
	
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getLoginLink() {
		return loginLink;
	}


	public WebElement getRegisterLink() {
		return registerLink;
	}




	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}


	
	
	}
	
