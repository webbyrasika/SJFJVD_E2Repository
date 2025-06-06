package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator2 {

	public static void main(String[] args) 
	{
		// 28/3/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/"); // go to Demo Apps site
		
		driver.findElement(By.partialLinkText("ELECTRONICS")).click(); // click on  electronics link
		
		driver.findElement(By.cssSelector("img[alt='Picture for category Cell phones']")).click(); // click on Cell phone using cssSelector

	}

}
