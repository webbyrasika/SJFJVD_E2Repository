package handlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExamplesOfBluestone {

	public static void main(String[] args) throws InterruptedException 
	{
		// 28/4/25
		
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get("https://www.bluestone.com/");
				Thread.sleep(2000);
				
				driver.switchTo().frame("fc_widget");
				
				driver.findElement(By.id("chat-icon")).click();
				
				driver.switchTo().parentFrame();				
				Thread.sleep(2000);
				
				driver.findElement(By.id("chat-fc-name")).sendKeys("Rasika");
				
				driver.findElement(By.id("chat-fc-email")).sendKeys("rasika@gmail.com");
				
				driver.findElement(By.id("chat-fc-phone")).sendKeys("9876543210");
	}
}
