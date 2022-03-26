package sdet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import util.TestUtils;


public class LoginPage extends TestBase {
	// elements repository
	@FindBy(id = "Username")
	WebElement usernametxt;
	
	@FindBy(name = "Password")
	WebElement passwordtxt;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbtn;
	
	@FindBy(xpath="//img[@title='nopCommerce']")
	WebElement logo;
	
	@FindBy(xpath = "//input[@type='button']")
	WebElement registerbtn;
	
	@FindBy(xpath = "//h1[text()='Register']")
	WebElement registertxt;
	 	
	@FindBy(css = ".ico-user.sprite-image")
	WebElement loginImg;
	
	@FindBy(xpath = "//*[text()='Log in']")
	WebElement loginLink;
	
	
	
	@FindBy(css =".ico-caret.sprite-image")
	WebElement loginImage;
	
	@FindBy(css = ".ico-login")
	WebElement login;
	
	@FindBy(xpath = "//*[text()='Your Personal Details']")
	WebElement detailsTxt;
	
	//elements initlize:
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	// actions(methods)
	public void login(String username,String password) {
		TestUtils.mouseOverAction(loginImage); // mouse over on login image
		System.out.println("mouse over on login image");
		login.click(); // clicked on login link
		System.out.println("clicked on login link");
		usernametxt.sendKeys(username);// username entered
		System.out.println("username entered");
		passwordtxt.sendKeys(password);
		System.out.println("password entered");
		loginbtn.click();
		System.out.println("clicked on login button");
	}
	
	public boolean logo() {
	boolean result = logo.isDisplayed();
	return result;
	}
	
	public String registerBtnClick() {
		TestUtils.mouseOverAction(loginImage);
		login.click();
		registerbtn.isDisplayed();
		registerbtn.click();
	return	registertxt.getText();
	}
	
	public String detailsText() {
		String details = detailsTxt.getText();
		return details;
	}
	
}
