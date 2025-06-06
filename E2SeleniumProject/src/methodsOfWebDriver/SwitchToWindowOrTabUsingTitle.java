package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class SwitchToWindowOrTabUsingTitle {

	public static void main(String[] args) throws InterruptedException
	{
		//22/3/25
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.cadbury.co.uk/");
		Thread.sleep(1000);
		
		//Opening new Tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.nestle.in/");
		String expectedTitle = "Nestlé: Good Food, Good Life | Nestlé IN";
		Thread.sleep(1000);
		
		//Opening new Window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.morde.com/");
		Thread.sleep(1000);
		
		// Getting the Address/Id's of all the Windows/Tabs
		 Set<String> allWindowIds = driver.getWindowHandles(); // gives output in form of Set 
		// System.out.println(allWindowIds);
		
		 
		 // Fetching the address or Id's of all the windows/tabs one by one
		 for(String wi: allWindowIds)
		 {
			 // Switching the control To window Id
			 driver.switchTo().window(wi);
			 Thread.sleep(1000);
			 
			 // Fetching the actual Title of the page using getTitle
			 String actualTitle = driver.getTitle();
			 
			 // Comparing the actual and expected title
			 if(actualTitle.equals(expectedTitle))
			 {
				 break; // breaking the loop
			 }
		 }
		 
		 driver.close(); // closing the desired Tab/window
		

	}

}
