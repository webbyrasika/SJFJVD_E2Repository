package testNGDataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 
{
	@DataProvider(name="invalidcreds")
	public String [][] dataProvideMethod()
	{
		String [][] arr = {
				{"abc@gmail.com","wakad@23"},
				{"dbstest@gmail.com","testgb56"},
				{"ganesh@gmail.com","g a n e s h @ 1 2 3"},
				{"omkar@gmail.com","wadekar$456"},
				{"co ll in @gmail.com","CoLlin%1234"},
				{"qspiders@yahoo.com","W a k a d&2212"}		
		};
		
		return arr;
	}
	
	
	
  @Test(dataProvider = "invalidcreds",dataProviderClass = testNGDataProvider.DataProvider1.class)
  public void invalidLogin(String email,String password) throws InterruptedException 
  {
	WebDriver driver =  new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.linkText("Log in")).click();
	
	driver.findElement(By.id("Email")).sendKeys(email);
	Thread.sleep(500);
	
	driver.findElement(By.id("Password")).sendKeys(password);
	Thread.sleep(500);
	
	driver.findElement(By.xpath("//input[@value = 'Log in']")).click();
	Thread.sleep(500);
	
	driver.quit();
	//driver.findElement(By.id("Email")).clear();
	
	//driver.findElement(By.id("Password")).clear();
	
	
  }
}
