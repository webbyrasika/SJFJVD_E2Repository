package MockAssignment1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException
	{
		// 15/5/2025
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("file:///C:/Users/Dell/Downloads/Assign.html");
		
		driver.findElement(By.xpath("//button[@class='button']")).click();
		Thread.sleep(2000);
		
		Set<String> allWindowId = driver.getWindowHandles();
		Thread.sleep(1000);
		
		String expectedTitle = "Order Food & Groceries. Discover the best restaurants. Swiggy it!";
		
		for(String wi:allWindowId) 
		{
			driver.switchTo().window(wi);
			
			String actualTitle = driver.getTitle();
			Thread.sleep(1000);
			
			if(actualTitle.equalsIgnoreCase(expectedTitle))
			{
				Thread.sleep(1000);
				driver.close();
				break;
			}
			
			
			
		}
		
		

	}

}
