package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args)
	{
		//28/3/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Dell/OneDrive/Desktop/JavaSeleniumNotes/html/textbox.html");
		
		driver.findElement(By.tagName("input")).sendKeys("123456");
    }

}

