package testNGAnnotation2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandStaleElementReferenceException {

	public static void main(String[] args) throws InterruptedException 
	{
		// 16/5/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		WebElement emailTB = driver.findElement(By.id("Email"));
		driver.navigate().refresh(); // Bcoz of refresh we get StaleElementReferenceException as address of that element is changed.
		Thread.sleep(1000);
		
		emailTB.sendKeys("tembhare@gmail.com");	
		Thread.sleep(1000);
		
		WebElement pwdTB = driver.findElement(By.id("Password"));
		pwdTB.sendKeys("123456");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		

	}

}

