package MethodsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		// 7/4/25
		
        WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://demowebshop.tricentis.com/");
	    
	    WebElement loginText = driver.findElement(By.linkText("Log in"));
	   
	    loginText.click();
	   
	    Thread.sleep(2000);
	    
	    WebElement emailTB = driver.findElement(By.id("Email"));
	    emailTB.sendKeys("abc@gmail.com");
	    Thread.sleep(1000);
	    
	    emailTB.sendKeys(Keys.CONTROL+"a");
	    Thread.sleep(1000);
	    
	    emailTB.sendKeys(Keys.CONTROL+"c");
	    Thread.sleep(1000);
	    
	    
	    emailTB.clear();
	    Thread.sleep(1000);
	    
	    emailTB.sendKeys(Keys.CONTROL+"v");
	    Thread.sleep(1000);
	    
	    emailTB.clear();


	}

}
