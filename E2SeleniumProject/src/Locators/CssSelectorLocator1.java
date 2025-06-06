package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator1 {

	public static void main(String[] args)
	{
		// 28/3/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		
		// for cssSelector locator syntax will be tagName[AttributeName='AttributeValue'] 
		
		driver.findElement(By.cssSelector("input[value='Log in']")).click();

	}

}
