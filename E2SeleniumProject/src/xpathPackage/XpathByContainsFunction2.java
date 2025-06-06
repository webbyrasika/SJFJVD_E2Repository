package xpathPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsFunction2 {

	public static void main(String[] args) throws InterruptedException 
	{
		// 1/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		// when text is present inside tagName then use text() 
		driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(@title,'Brilliant Green, 128 GB')]")).click();
		
		
		
		
		
		

	}

}
