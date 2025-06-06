package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NykkaLoginPageUsingContainsXpath {

	public static void main(String[] args) throws InterruptedException 
	{
		// 5/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.nykaa.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//button[contains(text(),'Sign in with Mobile / Email')]")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Sign in') and @kind='secondary']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@label='Mobile Number']")).sendKeys("9881829985");
//		driver.findElement(By.xpath("//span[text()='Mobile Number']/..//input[@label='Mobile Number']")).sendKeys("9881829985");
		Thread.sleep(2000);
		

		driver.findElement(By.xpath("//button[text()='Get OTP']")).click();
	}

}
