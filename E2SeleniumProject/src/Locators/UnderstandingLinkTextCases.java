package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingLinkTextCases {

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.jawamotorcycles.com/");
		
//		driver.findElement(By.linkText("Motorcycles")).click(); // NoSuchElementException
		
		driver.findElement(By.linkText("MOTORCYCLES")).click(); // take text present on web page not in source code ie. Html page
		
	}

}
