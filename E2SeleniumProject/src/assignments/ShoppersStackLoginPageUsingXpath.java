package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersStackLoginPageUsingXpath {

	public static void main(String[] args) throws InterruptedException 
	{
		// 7/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://shoppersstack.com/");
        Thread.sleep(10000);
		
//		WebElement loginButton = driver.findElement(By.xpath("//button[@id='loginBtn']"));
//		Thread.sleep(2000);
//		loginButton.click();
//		
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys("abc@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("er3587$");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	

	}

}
