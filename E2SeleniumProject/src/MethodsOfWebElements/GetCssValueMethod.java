package MethodsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		// 8/4/25
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000); // checkedException Type
		
		WebElement emailTB = driver.findElement(By.id("Email"));
		Thread.sleep(1000);
		
		emailTB.sendKeys("abcd$",Keys.ENTER);
		Thread.sleep(1000);
		
		WebElement errMsg = driver.findElement(By.xpath("//span[text()='Please enter a valid email address.']"));
		
		String color = errMsg.getCssValue("color");
		
		System.out.println(color);
		

	}

}
