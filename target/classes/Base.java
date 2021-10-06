package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Base {

	String browser;
	public WebDriver driver;

	@BeforeTest
	public WebDriver initialiseDriver() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"D:\\workspace\\FrameworkLearn\\Selenium\\src\\main\\java\\resources\\GlobalConfig.properties");
		prop.load(fis);

		browser = prop.getProperty("browser");
		System.out.println(browser);

		if (browser.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

			driver = new ChromeDriver();

		}

		else if (browser.equalsIgnoreCase("Firefox")) {

		}

		else if (browser.equalsIgnoreCase("Edge")) {

		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://qa.smartcmobile.net/SCM_10.0_S-SCP/init");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
	}

}
