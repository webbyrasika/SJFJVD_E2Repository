package actionClassPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToOpenLoginPageInNewWindow {

	public static void main(String[] args) throws InterruptedException 
	{
		// 19/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		
		
		String expectedTitle = "Demo Web Shop. Login";
		
		
		//String parentWindowHandle = driver.getWindowHandle();
		
		Actions act = new Actions(driver);
		
		act.keyDown(loginLink,Keys.SHIFT).click().perform();
		Thread.sleep(500);
		
		act.keyUp(Keys.SHIFT).perform();
		
		Set<String> allWindows = driver.getWindowHandles();
		//allWindows.remove(parentWindowHandle); // not neccesary
		
		for(String we: allWindows) 
		{
			driver.switchTo().window(we);
			String actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			
			if(expectedTitle.equals(actualTitle))
			{
				break;
			}
			
			
		}
		
		driver.findElement(By.id("Email")).sendKeys("qsp@gmail.com");
 
	}

}
