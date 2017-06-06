package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmailSignUp

{
	private static WebElement element= null;

	public static WebElement clickSignUp(WebDriver driver)
	{
		try{
			driver.findElement(By.className("login-container")).click();
			element= driver.findElement(By.xpath("//div[text()='SIGN UP'][1]"));

			return element;	

		}

		catch(Exception e)
		{
			System.out.println(/*********e**********/);
		}
		return element;
	}

	public static WebElement enterEmail(WebDriver driver)
	{

		element  = driver.findElement(By.id("signup-email"));

		return element;
	}

	public static WebElement clickJoin(WebDriver driver)
	{

		element  = driver.findElement(By.xpath("//button[text()='JOIN']"));

		return element;
	}

	public static WebElement enterPassword(WebDriver driver)
	{

		element  = driver.findElement(By.id("signup-password"));

		return element;
	}

	public static WebElement enterFirstName(WebDriver driver)
	{
		element= driver.findElement(By.id("signup-firstname"));
		return element;
	}

	public static WebElement clickCreateAccount(WebDriver driver)
	{
		driver.findElement(By.xpath("//button[text()='CREATE ACCOUNT']"));

		WebDriverWait wait = new WebDriverWait(driver, 20);

		try{

			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated
					(By.xpath("//div[text()='You are all set to start earning with CouponDunia']")));

			System.out.println("User has successfully signed up");
			return element;

		}
		catch(Exception e)
		{
			System.out.println("This is the error " + e);
		}
		return element;

	}





}
