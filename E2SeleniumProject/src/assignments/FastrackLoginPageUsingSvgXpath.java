package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FastrackLoginPageUsingSvgXpath {

	public static void main(String[] args) throws InterruptedException 
	{
		// 6/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.fastrack.in/");
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//button[@data-submit-text='Login-submit']")).click();
	  
		
	//	driver.findElement(By.xpath("//div[@class='custom-img account-username '] /..//*[name()='svg']")).click();
		Thread.sleep(1000);
//		
		driver.findElement(By.xpath("//div[contains(@class,'account-pop-cta fw-account-pop-cta d-flex')]/div[@id='common-button']")).click();
//		
   driver.findElement(By.xpath("//input[@class='form-control tw-floating-input login-input-phone mobileinputfield input-mobile-field dirty show-error']")).sendKeys("9881829985");
	}

}
