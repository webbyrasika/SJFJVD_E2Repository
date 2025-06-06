package javascriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleHiddenWebElement {

	public static void main(String[] args) 
	{
		// 30/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		// finding the  hidden webElement and storing it
		WebElement hiddenTB = driver.findElement(By.id("custom_gender"));
		
		//TypeCasting webDriver ref into JavaScript executor interface
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//To pass input in the hidden web element
		jse.executeScript("arguments[0].value='It is working??'", hiddenTB);
		
		
		
		
		
	}

}
