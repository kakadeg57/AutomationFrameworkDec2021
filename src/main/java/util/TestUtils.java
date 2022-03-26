package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class TestUtils extends TestBase{
	
	// switchFrame
	// dropdownselection
	// mouseactions
	// explicitwait
	
	public static void selectDropDownByTxt(WebElement element, String text ) {
	Select sel = new Select(element);
	sel.selectByVisibleText(text);	
	}
	
	public static void mouseOverAction(WebElement element) {
		Actions act = new Actions(driver) ;
		act.moveToElement(element).build().perform();
	}
		
}
