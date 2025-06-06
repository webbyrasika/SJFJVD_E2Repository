package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandImplicitWait 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// 21/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Declaring implicitWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // use before findElement method 
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Thread.sleep(2000); // not recomonded .
		
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys("Admin");
		
		WebElement pwdTB = driver.findElement(By.name("password"));
		pwdTB.sendKeys("admin123");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[contains(. , 'Login ')]"));
		loginButton.click();
		
		

	}

}
