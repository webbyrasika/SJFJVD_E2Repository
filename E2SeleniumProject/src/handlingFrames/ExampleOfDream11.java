package handlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class ExampleOfDream11 {

	public static void main(String[] args) throws InterruptedException 
	{
		// 28/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.get("https://www.dream11.com/");
		// To switch control to frame using index method
		//driver.switchTo().frame(0);
		
		//To switch control to frame using the value of id or name attribute
		//driver.switchTo().frame("send-sms-iframe");
		
		//To switch control to frame using  web element
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='send-sms-iframe']"));
		
		driver.switchTo().frame(frameElement);
		
		driver.findElement(By.id("regEmail")).sendKeys("9881829985");
		Thread.sleep(1000);

		// To switch control to one frame out
		//driver.switchTo().parentFrame();
		
		// To switch the control out of all the frames
		driver.switchTo().defaultContent();
		
		// To verify if the control has switch back to the main webpage
		driver.findElement(By.id("select-selected")).click();
		
	}

}
