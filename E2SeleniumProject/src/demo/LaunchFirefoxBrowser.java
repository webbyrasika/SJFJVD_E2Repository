package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver =  new FirefoxDriver();
		Thread.sleep(2000);
		driver.close();

	}

}
