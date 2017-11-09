package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Browser;

public class AdminLogin {

	/**
	 * Opens the browser and goes to http://shop.pragmatic.bg/admin/
	 */
	
	public static void openAdminPage() {
		Browser.driver.get("http://shop.pragmatic.bg/admin/");
		
	}
	
	public static void openColorSelectPage() {
		Browser.driver.get("http://pragmatic.bg/automation/lecture13/Config.html");
	}
	
		public static void login(String username, String password) {
			WebElement usernameInputField = Browser.driver.findElement(By.id("input-username"));
			usernameInputField.sendKeys(username);
			Browser.driver.findElement(By.id("input-password")).sendKeys(password);
			Browser.driver.findElement(By.cssSelector(".btn-primary")).click();
		}
		
		public static void logOut() {
			WebElement element = Browser.driver.findElement(By.xpath("//*[@id='header']/div/ul/li[2]/a"));
			element.click();
		}
		
	
}
