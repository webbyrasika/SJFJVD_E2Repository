package javascriptExecutorPackage;

import java.time.Duration;

//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleDisabledTextbox {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		
		jse.executeScript("document.getElementById('tb2').value='Rasika'");
		

	}

}
