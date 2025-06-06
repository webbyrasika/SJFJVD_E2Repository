package javascriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformScrolling {

	public static void main(String[] args) throws InterruptedException 
	{
		// 29/4/25
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://omayo.blogspot.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		
		// Scrolling 400 pixels on x-axis(RHS) and 1000 pixels on y-axis(Top to bottom)
		jse.executeScript("window.scrollBy(400,1000)");
		Thread.sleep(1000);
		
		// Scrolling 150 pixels on x-axis(LHS) and 300 pixels on y-axis(top to bottom)
		jse.executeScript("window.scrollBy(-150,300)");
		Thread.sleep(1000);
		
		//Scrolling 0 pixels on x-axis and 650 pixels on y-axis (Bottom to top)
		jse.executeScript("window.scrollBy(0,-650)");
		
		
		
		

		

	}

}
