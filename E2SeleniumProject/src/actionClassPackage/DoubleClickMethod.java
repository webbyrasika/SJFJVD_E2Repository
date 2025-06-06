package actionClassPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

	public static void main(String[] args) 
	{
		// 16/4/25
		
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
				
		driver.get("https://omayo.blogspot.com/");
		
		// Finding web element and storing in a variable
		WebElement doubleClickTarget = driver.findElement(By.xpath("//button[contains(text(),'Double click Here')]"));
		
		//Creating the Object of Actions class
		Actions act = new Actions(driver);
		
		// way 1 DoubleClick using No argument method
		// act.moveToElement(doubleClickTarget).doubleClick().perform();
		
		// way 2 DoubleClick using Parameterized Method
		act.doubleClick(doubleClickTarget).perform();

	}

}
