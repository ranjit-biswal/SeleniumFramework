package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	By txtBoxUsername = By.id("txtLogin");

	public WebElement txtBoxUsername() {
		return (driver.findElement(txtBoxUsername));
	}

	@FindBy(id = "txtpwd")
	WebElement txtBoxPassword;

	public WebElement txtBoxPassword() {
		return txtBoxPassword;
	}

	@FindBy(id = "btnlogin")
	WebElement btnLogin;

	public WebElement btnLogin() {
		return btnLogin;
	}
}
