package testNGBikes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RoyalEnfieldTC {
  @Test(groups = "RT")
  public void royal()
  {
	  WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.royalenfield.com/");
		 driver.quit();
  }
}
