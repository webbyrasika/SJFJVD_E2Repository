package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartsEndAnyCssLocators {

	public static void main(String[] args)
	{
		// 29/3/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.cssSelector("input[name^='Em']")).sendKeys("tembhare23@gmail.com");// search element based on starting character
		
		driver.findElement(By.cssSelector("input[id$='word']")).sendKeys("456891"); // search element based on ending character
		
		driver.findElement(By.cssSelector("input[value*='g i']")).click(); // search element on any character

	}

}
