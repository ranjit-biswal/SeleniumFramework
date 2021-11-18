package test;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import pageobjects.LandingPage;
import resources.Base;

public class HomePageTest extends Base {
	private static Logger log = LogManager.getLogger(HomePageTest.class.getName());

	@Test
	public void loginWebPortal() {
		LandingPage landingPage = new LandingPage(driver);
		log.info("Landing page obhect is created");
		landingPage.txtBoxUsername().sendKeys("Pals_Oxford-test32&user+012_+-&3456789user0011_&21");
		log.info("User enters username");
		landingPage.txtBoxPassword().sendKeys("Demo@#$%!_-&+2");
		log.info("User enters password");
		landingPage.btnLogin().click();
		log.info("User clicks the Login button");
	}

}
