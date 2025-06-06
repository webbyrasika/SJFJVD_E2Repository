package MethodsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	public static void main(String[] args) throws InterruptedException
	{
		// 7/4/25
		
		//click():void (Return Type)
		//WebElement is an interface which has non static abstract methods and implementation is given in RemoteWebElement class.
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://demowebshop.tricentis.com/");
	    
	   WebElement loginText = driver.findElement(By.linkText("Log in"));
	   
	   loginText.click();
	   
	   Thread.sleep(2000);
	   
	  WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
	  
	  loginButton.click();
	   

	}

}
