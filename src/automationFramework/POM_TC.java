package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




//Import package pageObject.*
import pageObjects.EmailSignUp;
import pageObjects.OpenSite;




public class POM_TC {

	private static WebDriver driver = null;
	
	public void launchingChrome()
	{
		String exePath = "D:\\jarfilesanddrivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);

	}

	public static void main(String[] args)
	{
		
		POM_TC lc = new POM_TC();
		
		lc.launchingChrome();
		
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		//selecting the browser

		// Not sure how to do this or set this

		// Using page Object library now
		
		OpenSite.openUrl(driver);

		EmailSignUp.clickSignUp(driver).click();

		EmailSignUp.enterEmail(driver).sendKeys("vamanulal8001@hurunkasunalito.com");

		EmailSignUp.clickJoin(driver).click();

		EmailSignUp.enterFirstName(driver).sendKeys("Kajol");

		EmailSignUp.enterPassword(driver).sendKeys("qwertyuiop");

		EmailSignUp.clickCreateAccount(driver).click();

		driver.quit();


	}
}