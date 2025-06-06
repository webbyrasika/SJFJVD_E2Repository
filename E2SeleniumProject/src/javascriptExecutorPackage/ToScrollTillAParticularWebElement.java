package javascriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollTillAParticularWebElement {

	public static void main(String[] args) throws InterruptedException 
	{
		// 29/4/25
		
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get("https://omayo.blogspot.com/");
				
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				
				//To find the Element till where we need to scroll
				WebElement elementToBeScroll = driver.findElement(By.xpath("//button[text()='Dropdown']"));
				Thread.sleep(1000);
				
				// scroll element present at top of the page
				//jse.executeScript("arguments[0].scrollIntoView(true)", elementToBeScroll);
				
				// scroll element present at bottom of the page
				jse.executeScript("arguments[0].scrollIntoView(true)", elementToBeScroll);
				

	}

}
