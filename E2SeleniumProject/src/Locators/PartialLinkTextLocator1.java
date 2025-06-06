package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocator1 {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		// partialLinkText() method works on partial text also 
		
//		driver.findElement(By.partialLinkText("Forgotten password?")).click(); // provide full text
		
//		driver.findElement(By.partialLinkText("Forgotten password")).click(); // works
		
		driver.findElement(By.partialLinkText("Forgotten")).click(); // works

	}

}
