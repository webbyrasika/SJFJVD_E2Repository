package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator1 {

	public static void main(String[] args) throws InterruptedException 
	{
		// 26/3/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("rasika@123");
		Thread.sleep(2000);
		
		driver.findElement(By.name("pass")).sendKeys("fghj455");
		Thread.sleep(1000);
		
		driver.findElement(By.name("login")).click();
		

		

	}

}
