package testNGHelperAttributes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ThreadPoolSizeHelperAttribute 
{
	//23/5/25
	
	/*
	 * threadPoolSize is related to browser launching only
	 */
	
  @Test (invocationCount = 5, threadPoolSize = 2)
  public void launchSelenium() throws InterruptedException 
  {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.selenium.dev/");
	 Thread.sleep(2000);
	 Reporter.log("Selenium.dev is launched !! ", true);
	 driver.close();
  }
  
  @Test (invocationCount = 5, threadPoolSize = 3)
  public void launchJavaTPoint() throws InterruptedException 
  {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.tpointtech.com/");
	 Thread.sleep(2000);
	 Reporter.log("Java TPoint is launched !! ", true);
	 driver.close();
  }
}
