package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(partialLinkText = "Log out")
	private WebElement logoutlink;

	public WebElement getLogoutlink() {
		return logoutlink;
	}

	public void setLogoutlink(WebElement logoutlink) {
		this.logoutlink = logoutlink;
	}

	@FindBy(partialLinkText = "Books")
	private WebElement bookslink;

	@FindBy(partialLinkText = "Computers")
	private WebElement computerlink;

	@FindBy(partialLinkText = "Electronics")
	private WebElement electronicslink;

	@FindBy(partialLinkText = "Camera, photo")
	private WebElement cameraphotolink;

	@FindBy(partialLinkText = "Cell phones")
	private WebElement cellphonelink;

	@FindBy(partialLinkText = "Apparel & Shoes")
	private WebElement apparelandshoes;

	@FindBy(partialLinkText = "Digital downloads")
	private WebElement digitaldownloadslink;

	@FindBy(partialLinkText = "Jewelry")
	private WebElement jewelrylink;

	@FindBy(partialLinkText = "Gift Cards")
	private WebElement giftcardslink;

	@FindBy(xpath = "//input[@value='Search']")
	private WebElement seachbutton;

	@FindBy(id = "small-searchterms")
	private WebElement searchbar;

	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public WebElement getBookslink() {
		return bookslink;
	}

	public WebElement getComputerlink() {
		return computerlink;
	}

	public WebElement getElectronicslink() {
		return electronicslink;
	}

	public WebElement getCameraphotolink() {
		return cameraphotolink;
	}

	public WebElement getCellphonelink() {
		return cellphonelink;
	}

	public WebElement getApparelandshoes() {
		return apparelandshoes;
	}

	public WebElement getDigitaldownloadslink() {
		return digitaldownloadslink;
	}

	public WebElement getJewelrylink() {
		return jewelrylink;
	}

	public WebElement getGiftcardslink() {
		return giftcardslink;
	}

	public WebElement getSeachbutton() {
		return seachbutton;
	}

	public WebElement getSearchbar() {
		return searchbar;
	}

}
