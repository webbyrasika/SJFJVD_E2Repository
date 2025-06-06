package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod1 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		
		// Steps to perform maximize operation on browser window
		
		//Options ops = driver.manage();
		
		//Window wi = ops.window();
		
		//wi.maximize();
		
		driver.manage().window().maximize(); // method chaining Maximize browser window
		
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
		
		driver.manage().window().minimize(); // minimize browser window
		Thread.sleep(3000);
		
		driver.manage().window().fullscreen();  // To open window in full screen mode.
		
		
		
	
		
		
	}

}
