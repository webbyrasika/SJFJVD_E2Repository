package methodsOfWebDriver;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod2 
{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, MalformedURLException
	{
        WebDriver driver = new ChromeDriver(); // To Launch Browser
		
		driver.get("https://www.goindigo.in/");
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
        Navigation nav = driver.navigate();
        
       //URL url = new URL("https://www.dream11.com/");
		//nav.to(url);
        
        nav.to(new URL("https://www.dream11.com/")); // Create the Object of URL class inside to() and pass URL
		Thread.sleep(2000);
		
		nav.back(); // To Perform Backward Navigation Operation
		Thread.sleep(2000);
		
		nav.forward();// To Perform Forward Navigation Operation
		Thread.sleep(2000);
		
		nav.refresh(); // To Perform Refresh Operation

	}

}
