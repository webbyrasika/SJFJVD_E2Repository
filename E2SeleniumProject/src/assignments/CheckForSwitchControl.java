package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckForSwitchControl {

	public static void main(String[] args) throws InterruptedException 
	{
		// 14/5/2025
		
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://www.zomato.com/"); 
	    String zomatoId = driver.getWindowHandle();
	    Thread.sleep(1000);
	    
	    driver.switchTo().newWindow(WindowType.TAB);
	    driver.get("https://www.swiggy.com/");
	    String expTitle = "Order Food & Groceries. Discover the best restaurants. Swiggy it!";
	    Thread.sleep(1000);
	    
	    driver.switchTo().newWindow(WindowType.WINDOW);
	    driver.get("https://www.ubereats.com/");
	    Thread.sleep(1000);
	    
	    // Switching back to parent window parent tab
	   // driver.switchTo().window(zomatoId);
	  //  String expectedTitle = driver.getTitle();   
	  //  System.out.println(expectedTitle);
	   
	    
	    
	   Set<String> allIds = driver.getWindowHandles();
	   
	   for(String wi : allIds)
	   {
		   driver.switchTo().window(wi);
		   String acTitle = driver.getTitle();
		   Thread.sleep(2000);
		   
		   if(acTitle.equals(expTitle))
		   {
			   System.out.println(acTitle);
			   break;
		   }
		   
	   }
	    
	    driver.quit();

	}

}
