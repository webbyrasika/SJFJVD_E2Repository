package MethodsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagNameMethod {

	public static void main(String[] args) throws InterruptedException
	{
		// 8/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000); // checkedException Type
		
		WebElement emailTB = driver.findElement(By.id("Email"));
		String emailTagName = emailTB.getTagName();
		System.out.println(emailTagName);

	}

	
}
