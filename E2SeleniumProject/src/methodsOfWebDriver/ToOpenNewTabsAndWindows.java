package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenNewTabsAndWindows {

	public static void main(String[] args) throws InterruptedException 
	{
		//21/3/25
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://in.bookmyshow.com/");
		Thread.sleep(2000);
		
        // To open a new Tab and Launch MakeMyTrip
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.makemytrip.com/");
		
		// To open new window and launch Zomato
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.zomato.com/");
	}

}
