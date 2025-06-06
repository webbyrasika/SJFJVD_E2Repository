package testNGBikes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BajajBikesTC 
{
	//26/5/25
	
  @Test(groups = {"FT","RT"}) 
  public void bajaj() 
  {
	  WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.bajajauto.com/");
		 driver.quit();
  }
}
