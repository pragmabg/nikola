package pages;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Browser;

public class Admin_Dashboard {
	
	public static void verifyTitle(String messageOnFailure, String expectedTitle) {
		String actualTitle = Browser.driver.getTitle();
		
		Assert.assertEquals(messageOnFailure, expectedTitle, actualTitle);
		
	}


	public static void browsing() {
	    WebElement SalesBar = Browser.driver.findElement(By.xpath("//div/nav/ul/li[5]/a"));
	    SalesBar.click();
	    WebElement Orders = Browser.driver.findElement(By.xpath("//div/nav/ul/li[5]/ul/li/a"));
	    Orders.click();
	    
	}


	public static void orderValidation() {
		Select bar = new Select(Browser.driver.findElement(By.id("input-order-status")));
		
		assertFalse(bar.isMultiple());
		assertEquals(16, bar.getOptions().size());
		
		List<String> exp = Arrays.asList(new String [] {"","Missing Orders", "Canceled", "Canceled Reversal", 
				"Chargeback","Complete","Denied","Expired","Failed","Pending","Processed","Processing",
				"Refunded","Reversed","Shipped","Voided"});
		List<String> act = new ArrayList<String>();
		
		for(WebElement option : bar.getOptions())
			act.add(option.getText());
		
		assertArrayEquals(exp.toArray(),act.toArray());
		
	}





	
	

	

}
