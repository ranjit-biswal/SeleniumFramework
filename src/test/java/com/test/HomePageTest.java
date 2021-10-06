package com.test;

import org.testng.annotations.Test;

import com.pageobjects.LandingPage;

import resources.Base;

public class HomePageTest extends Base {

	@Test
	public void loginWebPortal() {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.txtBoxUsername().sendKeys("Pals_Oxford-test32&user+012_+-&3456789user0011_&21");
		landingPage.txtBoxPassword().sendKeys("Demo@#$%!_-&+2");
		landingPage.btnLogin().click();
	}

}
