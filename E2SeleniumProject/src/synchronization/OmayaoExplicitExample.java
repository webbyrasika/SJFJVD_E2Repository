package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OmayaoExplicitExample {

	public static void main(String[] args) 
	{
		// 22/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.xpath("//button[text()='Check this']")).click();
		
//		WebElement checkbox = driver.findElement(By.id("dte"));
		// elementToBeClickable using web element
//		wait.until(ExpectedConditions.elementToBeClickable(checkbox));
//		checkbox.click();
//		
		// OR 
		// elementToBeClickable using By locator
		wait.until(ExpectedConditions.elementToBeClickable(By.id("dte"))).click();
		
		
		
		
		
	}

}
