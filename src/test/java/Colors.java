import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.Browser;

public class Colors {
	
	@Test
	public static void selectColors() {
			WebElement Red = Browser.driver.findElement(By.xpath("//*[@id='tabs-1']/p[4]/select/option[3]"));
			WebElement Silver = Browser.driver.findElement(By.xpath("//*[@id='tabs-1']/p[4]/select/option[5]"));
			Actions builder = new Actions(Browser.driver);
			builder.keyDown(Keys.CONTROL).click(Red).click(Silver).keyUp(Keys.CONTROL).build().perform();
			assertTrue(Red.isSelected());
			assertTrue(Silver.isSelected());
	}

}
