package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver(); // To Launch Browser
		
		driver.get("https://www.goindigo.in/");
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
//		driver.navigate().to("https://www.dream11.com/"); // To launch the web application 
//		
//		Thread.sleep(2000);
//		
//		driver.navigate().back(); // To perform backward navigation operation
//		Thread.sleep(2000);
//		
//		driver.navigate().forward(); // To perform forward navigation operation
//		Thread.sleep(2000);
//		
//		driver.navigate().refresh(); // To perform refresh operation
		
//		OR
		
		Navigation nav = driver.navigate();
		
		nav.to("https://www.dream11.com/");
		Thread.sleep(2000);
		
		nav.back();
		Thread.sleep(2000);
		
		nav.forward();
		Thread.sleep(2000);
		
		nav.refresh();
		
		
		
		

	}
	

}
