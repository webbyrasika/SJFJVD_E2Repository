package handlingPopups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleWindowPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		// 25/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		
		// Launching the web application
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
		Thread.sleep(500);
		
		Set<String> allWindoId = driver.getWindowHandles();
		
		String expectedTitle = "New Window";
		// Iterating the Ids of all windows that are open
		for(String wi : allWindoId)
		{
			driver.switchTo().window(wi); // switch to every window 
			Thread.sleep(500);
			String actualTitle = driver.getTitle();
			
			//System.out.println(actualTitle);
			if(actualTitle.equals(expectedTitle)) // if matches to required window the come out of the loop
			 {
				 break; // breaking the loop
			 }
			
			
		}

		
	//  To get the text of the element present on the child window
		String text = driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
		
		System.out.println(text);
		
	}

}
