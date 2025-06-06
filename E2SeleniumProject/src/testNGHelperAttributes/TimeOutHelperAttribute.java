package testNGHelperAttributes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeOutHelperAttribute 
{
	//26/5/25
	/*
	 * timeOut attribute specifies maximum time or limit within that time test case should execute.
	 */
	
  @Test(timeOut = 7000)
  public void zomato()
  {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://www.zomato.com/");
  }
}
