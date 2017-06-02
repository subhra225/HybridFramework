package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmailSignUp

{
	private static WebElement element= null;

	public static WebElement clickSignUp(WebDriver driver)
	{

		driver.findElement(By.className("login-container")).click();
		element= driver.findElement(By.xpath("//div[text()='SIGN UP'][1]"));

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
		return element;
	}





}
