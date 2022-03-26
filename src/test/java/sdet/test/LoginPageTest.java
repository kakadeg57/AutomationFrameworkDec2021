package sdet.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.TestBase;
import sdet.pages.LoginPage;
import util.TestUtils;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	SoftAssert softAssert;

	@BeforeMethod
	public void init() {
		initilization();
		loginPage = new LoginPage();
		softAssert = new SoftAssert();
	}
	@Ignore
	@Test
	public void validateLoginTest() {
		
		loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Ignore
	@Test
	public void validateLogoTest() {
		boolean status = loginPage.logo();
		Assert.assertEquals(status, true);
	}
	
	@Test 
	public void validateRegisterbuttonClickTest() {
		 String txt = loginPage.registerBtnClick();
		 softAssert.assertEquals(txt,"Regi");	// assertion 1 - fail
		 System.out.println("step 1");
		 softAssert.assertEquals(loginPage.detailsText(), "Your Personal"); //assertion 2 - fail
		 System.out.println("step 2");
		 
		 
		 
		 
		 
		 softAssert.assertAll();
		 
	}
	
	@AfterMethod
	public void closeResources() {
		driver.close();
	}
	
}
