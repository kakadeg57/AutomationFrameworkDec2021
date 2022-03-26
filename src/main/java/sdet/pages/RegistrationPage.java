package sdet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;
import util.TestUtils;


public class RegistrationPage extends TestBase{

	// elements repository
	@FindBy(id="FirstName")
	WebElement firstName;
	
	@FindBy(id="LastName")
	WebElement lastName;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="ConfirmEmail")
	WebElement confirmEmail;
	
	@FindBy(id="Username")
	WebElement userName;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(id="ConfirmPassword")
	WebElement confirmPassword;
	
	@FindBy(id="register-button")
	WebElement registerBtn;
	
	@FindBy(id="Details_CompanyIndustryId")
	WebElement dropDown;
	
	@FindBy(xpath = "//*[contains(text(),'Almost done!')]")
	WebElement registerationTxt;
	// init elements
	public RegistrationPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	
	// actions
	
	public String registerUser(String FN,String LN,String Email,String CE,String UN,String pwd,String CP) {
		firstName.sendKeys(FN);
		lastName.sendKeys(LN);
		email.sendKeys(Email); // exception
		confirmEmail.sendKeys(CE);
		userName.sendKeys(UN);
		password.sendKeys(pwd);
		confirmPassword.sendKeys(CP);
		TestUtils.selectDropDownByTxt(dropDown, "I am student");
		registerBtn.click();
		return registerationTxt.getText();
	}
}
