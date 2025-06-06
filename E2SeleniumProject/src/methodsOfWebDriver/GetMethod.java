package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args)
	{
		// To create the object of ChromeDriver and UpCaste into WebDriver interface
		WebDriver driver = new ChromeDriver();
		
		// To launch the Web Application
		driver.get("https://www.zomato.com/");
		
	}

}
