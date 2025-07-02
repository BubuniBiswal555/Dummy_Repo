package books;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericutility.BaseUtility;
import genericutility.ListenerUtility;
import objectrepository.HomePage;
@Listeners(ListenerUtility.class)

public class TC_DWS_001_Test extends BaseUtility{
	@Test
	
	public void clickOnBooks() {
		
		
		HomePage hp=new HomePage(driver);
		hp.getBookslink().click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Books","books page is not displayed");
		test.log(Status.PASS, "Books page is displayed");
		
	}

}

