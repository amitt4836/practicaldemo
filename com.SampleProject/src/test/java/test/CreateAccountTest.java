package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import page.CreateAccountPg;
import utils.Util;

public class CreateAccountTest extends TestBase {
	CreateAccountPg createaccpg;
	@BeforeTest
	public void setup() {
		preRequsite();
		createaccpg = new CreateAccountPg();
	}
	
	@Test
	public void createaccountmethod() {
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		createaccpg.clickoncreateaccount();
		createaccpg.enterFirstname("Amar", "Kadam", "amarkadam@grr.la");
		createaccpg.selectdateofbirth();
		String actualtext = createaccpg.gettitlesingup();
		String expectedtext = "Sign Up";
		Assert.assertEquals(actualtext, expectedtext);
		
	}
	
	@AfterMethod
	public void aftertest(ITestResult result) throws IOException {
		if (result.getStatus()== ITestResult.FAILURE)
		{
			Util.takescreenshot();
		}
		driver.quit();
	}
	

}
