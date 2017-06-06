package pageObjects;

import org.openqa.selenium.WebDriver;


public class OpenSite {

	private static String url= "https://qacashback.couponapitest.com";

	public static String openUrl(WebDriver driver)
	{
		driver.get(url);
		String title= driver.getTitle();
		
		
		if(title.equals("CouponDunia: Coupons, Cashback, Offers and Promo Code") )

		{
			System.out.println("Url has been launched in the browser");
			return "1";
		}

		else{
			
			System.out.println("Could not launch the URL");
			return "0";
		}
	}

}
