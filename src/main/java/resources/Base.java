package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import test.HomePageTest;

public class Base {

	String browser;
	public WebDriver driver;
	private static Logger log = LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public WebDriver initialiseDriver() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"D:\\workspace\\FrameworkLearn\\SeleniumFramework\\src\\main\\java\\resources\\GlobalConfig.properties");
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
		log.info("Driver is initialized");
		driver.manage().window().maximize();
		log.info("Browser window is maximized");
		driver.manage().deleteAllCookies();
		log.info("User deleted the cookies");
		driver.get("https://qa.smartcmobile.net/SCM_10.0_S-SCP/init");
		log.info("User access the URL");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		log.info("User waits specific duratio");

		return driver;
	}

}
