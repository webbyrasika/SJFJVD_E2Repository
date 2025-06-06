package actionClassPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod2 {

	public static void main(String[] args)
	{
		// 16/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		// Finding the target element and storing in a variable
		WebElement targetElement = driver.findElement(By.xpath("//span[text()='Fashion']"));
		
		// Creating the object of Actions class
		Actions act = new Actions(driver);
		
		// Performing mouse hover actions on target web element.
		act.moveToElement(targetElement).perform();
		
		

	}

}
