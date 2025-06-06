package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver =  new ChromeDriver(); // UpCasting
		Thread.sleep(2000); // paused execution for 2 seconds using Thread.sleep method
		driver.close(); // close() method used to close browser
		
		// UpCasting done to achieve NS abstraction, run time PolyMorphism , to access all methods from WebDriver interface.

	}

}
