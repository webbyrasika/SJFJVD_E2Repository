package methodsOfWebDriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveElement2 {

	public static void main(String[] args) throws InterruptedException 
	{
		//21/3/25
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		
//		driver.findElement(By.linkText(""))
		
		// Switching element to active element DWS login page and passing data in email Text box
		driver.switchTo().activeElement().sendKeys("Rasika");

	}

}
