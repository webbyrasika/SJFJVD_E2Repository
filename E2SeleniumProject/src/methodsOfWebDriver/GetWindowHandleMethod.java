package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver(); // To Launch Browser
		
		driver.get("https://www.goindigo.in/"); // To Launch the web application
		
		String parentWindowHandle  = driver.getWindowHandle(); // To Get the address/Session Id/Handle of parent Window 
		
		System.out.println(parentWindowHandle);// To print address/Session  Id/Handle

	}

}
