package handlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleOfGoogle {

	public static void main(String[] args) throws InterruptedException
	{
		// 28/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		
		
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		
		driver.switchTo().frame("app"); // frame by using name
		
		//driver.findElement(By.xpath("//a[contains(@aria-label,'Maps, row 1 of 5 and column 3 of 3 in')]")).click();
		
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		//driver.switchTo().defaultContent(); // switch control back to main page
		
		//driver.findElement(By.id("APjFqb")).sendKeys("google");

	}

}
