package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchBackToParentWindow {

	public static void main(String[] args) throws InterruptedException 
	{
		//22/3/25
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.swiggy.com/"); 
		Thread.sleep(1000);
		// Capturing window id of main window
		String parentWindowHandle = driver.getWindowHandle();
		Thread.sleep(1000);
		
		//Opening a new Tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.phonepe.com/");
		Thread.sleep(2000);
		
		//Opening a new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		// Switching to main window by using window id of main window
		driver.switchTo().window(parentWindowHandle);
		Thread.sleep(1000);
		
		//Closing the main window where control is switched/ present
		driver.close();
			

	}

}
