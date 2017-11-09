import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.AdminLogin;
import pages.Admin_Dashboard;
import utils.Browser;

public class FrameWork {
	
	@Before
	public void setUp() {
		Browser.openBrowser();
	}
	
	@Test
	public void successfulLogin() {
		AdminLogin.openAdminPage();
		AdminLogin.login("admin", "parola123!");
		Admin_Dashboard.verifyTitle("You did not login successfully so there might"
				+ "be a bug in that functionatlity because the Dashboard" + "was not present.", "Dashboard");
		AdminLogin.logOut();
	}
	
	@Test
	public void unsuccessfulLogin() {
		AdminLogin.openAdminPage();
		AdminLogin.login("kasdkas", "dkasdjasfj");
	}
	
	@Test
	public void checkStuffForMe() {
		AdminLogin.openAdminPage();
		AdminLogin.login("admin", "parola123!");
		Admin_Dashboard.browsing();
		Admin_Dashboard.orderValidation();
		AdminLogin.logOut();
	}
	
	
	@Test
	public void logMeOut() {
		AdminLogin.openAdminPage();
		AdminLogin.login("admin", "parola123!");
		AdminLogin.logOut();
	}
	
	@Test
	public void colorSelect() {
		AdminLogin.openColorSelectPage();
		Colors.selectColors();
	}
    @After
    public void shutDown() {
    	Browser.driver.quit();
    }
}
