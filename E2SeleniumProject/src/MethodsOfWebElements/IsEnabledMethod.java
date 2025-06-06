package MethodsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		// 9/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		Thread.sleep(5000);
		
		WebElement nameTB = driver.findElement(By.id("name"));
		Thread.sleep(5000);
		
		if(nameTB.isEnabled())
		{
			nameTB.sendKeys("sdfghj");
		}
		else
		{
			System.out.println("Name Textbox Is Not Enabled");
		}
		
	

	}

}
