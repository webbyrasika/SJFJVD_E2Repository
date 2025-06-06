package javascriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandScrollTo {

	public static void main(String[] args) throws InterruptedException
	{
		// 29/4/25
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://omayo.blogspot.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		
		// Scrolling 0 pixels on x-axis and 1000 pixels on y-axis(Top to bottom)
		jse.executeScript("window.scrollTo(0,1000)");
		Thread.sleep(1000);
		
		// Scrolling 0 pixels on x-axis and 1000 pixels on y-axis(Top to bottom)
		// scrollTo() will count the pixels from 0 again
		jse.executeScript("window.scrollTo(0,500)");
		

	}

}
