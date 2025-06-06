package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator3 {

	public static void main(String[] args)
	{
		// 28/3/25
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/"); // go to Demo Apps site
		
		driver.findElement(By.partialLinkText("ELECTRONICS")).click(); // click on  electronics link
		
		driver.findElement(By.cssSelector("img[title='Show products in category Cell phones']")).click(); // click on img using title attribute
		
		driver.findElement(By.cssSelector("img[title='Show details for Smartphone']")).click(); 
		
		

	}

}
