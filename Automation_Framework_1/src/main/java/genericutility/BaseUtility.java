package genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import objectrepository.HomePage;
import objectrepository.LoginPage;
import objectrepository.WelcomePage;

public class BaseUtility {
	public static WebDriver driver;
	public static ExtentReports ereport;
	public static ExtentTest test;
	
	public JavaUtility jutil=new JavaUtility();
	public WebDriverUtility wUtil=new WebDriverUtility();
	public FileUtility fUtil=new FileUtility();
	
	@BeforeSuite
     public void reportConfig() {
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/ExtentReports-"+jutil.getSystemTime()+".html");
		 ereport=new ExtentReports();
		 ereport.attachReporter(spark);
		 
		 
	}
	
	
	
	@BeforeClass
	public void openBrowser() throws IOException {
		driver=new ChromeDriver();
		wUtil.maximize(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(fUtil.getDataFromProperty("url"));
	}
	
	@BeforeMethod
	public void login() throws IOException {
		WelcomePage wp=new WelcomePage(driver);
		wp.getLoginLink().click();
		
		
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(fUtil.getDataFromProperty("Email"));
			

			lp.getPassword().sendKeys(fUtil.getDataFromProperty("Password"));

			lp.getLoginbutton().click();

		}

		@AfterMethod

		public void logout()

		{

			
			HomePage hp=new HomePage(driver);

			hp.getLogoutlink().click();
	}
	
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	
	@AfterSuite
	public void reportBackup() {
		ereport.flush();
	}
		
	}