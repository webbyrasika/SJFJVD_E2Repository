package actionClassPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElementMethod {

	public static void main(String[] args) throws InterruptedException
	{
		// 18/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/");
		
		//Finding the target element to scroll
		WebElement targetElement = driver.findElement(By.linkText("District"));
		Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		
		act.scrollToElement(targetElement).perform();

	}

}
