package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.zomato.com/"); // To Launch The Web Application
		
		String currentUrl = driver.getCurrentUrl(); // To fetch current URL
		
		System.out.println(currentUrl);
		
	}

}
