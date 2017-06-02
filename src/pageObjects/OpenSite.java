package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpenSite {

	private static String url= null;

	public static String openUrl(WebDriver driver)
	{
		driver.get(url);
		String title= driver.getTitle();
		
		if(title.equals("") )

		{
			return "Url has been launched in the browser";
		}

		else{
			return "Could not launch the URL";
		}
	}

}
