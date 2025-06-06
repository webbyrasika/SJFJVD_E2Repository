package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator4 {

	public static void main(String[] args)
	{
		// 29/3/25
		
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://demowebshop.tricentis.com/");
	  
	  driver.findElement(By.linkText("Log in")).click();
	  
//	  driver.findElement(By.cssSelector(".login-button")).click(); // using another syntax for cssSelector as .classValue
	  
	  driver.findElement(By.cssSelector("input.login-button")).click(); //  using tagname.classValue syntax
	  

	}

}
