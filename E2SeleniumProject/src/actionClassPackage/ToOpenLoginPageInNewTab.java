package actionClassPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToOpenLoginPageInNewTab {

	public static void main(String[] args) throws InterruptedException 
	{
		// 18/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		
		//Fetching the address/handle of parent tab
		String parentWindowHandle = driver.getWindowHandle();
		
		// creating the object of Action class
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL).click(loginLink).perform(); // press control key
		Thread.sleep(500);
		act.keyUp(Keys.CONTROL).perform(); // to release control key
		
		//Fetching the address/handles of all the tabs
		Set<String> allWindows = driver.getWindowHandles();
		
		// To remove the address of parent tab
		allWindows.remove(parentWindowHandle);
		
		for(String wi :allWindows)
		{
			// To switch the control to new tab
			driver.switchTo().window(wi);
			// To fetch the title of the current page where the control is present
			String actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			//driver.findElement(By.id("Email")).sendKeys("qsp@gmail.com");
			break;
		}
		
		// To find email textbox present on the new tab pass input 
		driver.findElement(By.id("Email")).sendKeys("qsp1@gmail.com");
	
		//WebElement emailTB = driver.findElement(By.id("Email"));
		//act.sendKeys(emailTB, "qsp@gmail.com").perform();
		
		
		
		

	}

}
