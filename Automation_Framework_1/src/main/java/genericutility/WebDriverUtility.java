package genericutility;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
/**
 * @author sekha
 */

public class WebDriverUtility {
	/**
	 * This method is used to maximize the window
	 * @param driver
	 */
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
		
	}
	/**
	 * This method is used to mouseHover
	 * @param driver
	 * @param element
	 */
	public void mouseHover(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);	
		act.moveToElement(element).perform();
	}
	/**
	 * This method is used to rightclick
	 * @param driver
	 * @param element
	 */
	public void rightclick(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);	
		act.contextClick(element).perform();
	
	}
	/**
	 * This method is used to dragAndDrop
	 * @param driver
	 * @param source
	 * @param target
	 */
	public void dragAnddrop(WebDriver driver,WebElement source,WebElement target) {
		Actions act=new Actions(driver);	
		act.dragAndDrop(source,target).perform();
	}
	/**
	 * This method is used clickAndHold
	 * @param driver
	 * @param element
	 */
	public void clickAndHold(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);	
		act.clickAndHold(element).perform();
		
	}
	
	public void selectByIndex(WebElement element,int index) {
		Select ref=new Select(element);
		ref.selectByIndex(index);
	}
	public void selectByValue(WebElement element,String value) {
		Select ref=new Select(element);
		ref.selectByValue(value);
}
	public void selectByVisibleText(WebElement element,String text) {
		Select ref=new Select(element);
		ref.selectByVisibleText(text);
	}
	
	public String[] getAllOptions(WebElement element) {
		Select ref=new Select(element);
	    List<WebElement>allOptions=ref.getOptions();
	    String[] options=new String[allOptions.size()];
	    
	    
	 for(int i=0;i<allOptions.size();i++) {
		 options[i]=allOptions.get(i).getText();
	    }
	    return options;
	}
	
	public void switchToFrame(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	public void switchToFrame(WebDriver driver,String nameOrId) {
		driver.switchTo().frame(nameOrId);
	
}
	public void switchToFrame(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
	}
	public void switchBackToMainPage(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	public Alert switchToAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}
	public void switchToWindow(WebDriver driver,String expUrl) {
	Set<String> allwindowIds = driver.getWindowHandles();
	for(String id:allwindowIds) {
		driver.switchTo().window(id);
		String actUrl = driver.getCurrentUrl();
		if(actUrl.contains(expUrl)) {
		break;
	}
}
}
	
	public void getPhoto(WebDriver driver) throws IOException {
	JavaUtility jUtil=new JavaUtility();
	TakesScreenshot ts=(TakesScreenshot) driver;
	File temp=ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("./Screenshots/"+jUtil.getSystemTime()+".png");
	FileHandler.copy(temp,dest);
	
	
}
	
	public void scroll(WebDriver driver,int X,int Y){
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo("+X+","+Y+")");
	}
}
	

