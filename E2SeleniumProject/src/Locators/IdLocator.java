package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException 
	{
		// 26/03/25
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		By emailTB = By.id("email");
		WebElement emailBox = driver.findElement(emailTB);
		
		emailBox.sendKeys("Rasika");
		Thread.sleep(2000);
		
		WebElement passwordBox = driver.findElement(By.id("pass"));
		passwordBox.sendKeys("Rasika@123");
		Thread.sleep(2000);
		
		
		

	}

}
