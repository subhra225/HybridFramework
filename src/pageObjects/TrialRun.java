package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class TrialRun {

	public static void main(String[] args)

	{
		// TODO Auto-generated method stub

		TrialRun tr= new TrialRun();
		tr.launchingChrome();

		WebDriver driver = new ChromeDriver();

		try{


			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			driver.get("https://qacashback.couponapitest.com/");
			driver.findElement(By.className("login-container")).click();
			driver.findElement(By.xpath("//div[text()='SIGN UP'][1]")).click();
			driver.findElement(By.id("signup-email")).sendKeys("kroundaskruntoses@gronawestro.com");
			driver.findElement(By.xpath("//button[text()='JOIN']")).click();
			driver.findElement(By.id("signup-password")).sendKeys("qwertyuiop");
			driver.findElement(By.id("signup-firstname")).sendKeys("Broman");
			driver.findElement(By.xpath("//button[text()='CREATE ACCOUNT']")).click();
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("");
			System.out.println("/*****could not login to CD*****/");
		}

	}

	public void launchingChrome()
	{
		String exePath = "D:\\jarfilesanddrivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);

	}

}
