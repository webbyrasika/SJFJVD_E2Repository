package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveElement {

	public static void main(String[] args) throws InterruptedException 
	{
		//21/3/25
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		
		// switching to active elements and passing data in search box of google 
		driver.switchTo().activeElement().sendKeys("zomato",Keys.ENTER);
		
		
		

	}

}
