package sdet.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import sdet.pages.LoginPage;
import sdet.pages.RegistrationPage;

public class RegistrationPageTest extends TestBase{
	RegistrationPage registerPage;
	LoginPage loginPage;
	@BeforeMethod
	public void init() {
		initilization();
		loginPage = new LoginPage();
		registerPage = new RegistrationPage();
	}
	
	@Test
	public void validateRegisterTest() {
		//String FN,String LN,String Email,String CE,String UN,String pwd,String CP
		loginPage.registerBtnClick();
	 	registerPage.registerUser("Ganesh","Kakade","speedwaytech2017@gmail.com",
				"speedwaytech2017@gmail.com",
				"speedway12345","Speedway@123","Speedway@123");
	}

		
	@AfterMethod
	public void closeResources() {
		//driver.close();
	}
	
}
