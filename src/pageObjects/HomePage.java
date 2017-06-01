package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage

{
	private static WebElement element= null;
	
	public static WebElement click_login(WebDriver driver)
	{
		
		loginLink = driver.findElement(By.className("login-container"));
		
		return element;
		
		
		
	}
	

}
