package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator5 {

	public static void main(String[] args) 
	{
		// 29/5/3
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("tembhare256@gmail.com");
		
//		driver.findElement(By.cssSelector("#Password")).sendKeys("sdgvhbjkn");
		
		driver.findElement(By.cssSelector("input#Password")).sendKeys("12345689"); // used id selector syntax is tagName#idValue
		
		driver.findElement(By.cssSelector(".login-button")).click();

	}

}
