package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindowOrTabUsingUrl {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		// manage method return Option interface and it has window method which also returns Window interface and then use maximize method.
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		String expectedUrl = "https://www.amazon.in/";
		Thread.sleep(2000);
		
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.nykaa.com/");
		Thread.sleep(2000);
		
		Set<String> allWindowIds = driver.getWindowHandles();	// getWindowHandles method present in Web Driver Interface	
//		System.out.println(allWindowIds);
		
		for(String wi : allWindowIds)
		{
			driver.switchTo().window(wi);
			Thread.sleep(2000);
			
			//Fetching actual URL
			String actualUrl = driver.getCurrentUrl();
			
			if(actualUrl.equals(expectedUrl))
			{
				break; // Throw out of for loop.
			}
			
		}
		
		driver.close();	// Close the window or tab in which where driver control  is present 
	

	}

}
