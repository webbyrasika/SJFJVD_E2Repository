package xpathPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByUsingAttribute {

	public static void main(String[] args) throws InterruptedException
	{
		// 31/3/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		WebElement emailTb = driver.findElement(By.xpath("//input[@id='Email']"));
		emailTb.sendKeys("rev@gmail.com");
		Thread.sleep(1000);
		
		WebElement passwordTb = driver.findElement(By.xpath("//input[@type='password']"));
		passwordTb.sendKeys("7895hjkk");
		Thread.sleep(1000);
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
		
		loginButton.click();
		
		
		
		
		
		
		
	}

}
