package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator2 {

	public static void main(String[] args)
	{
		// 27/3/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Dell/OneDrive/Desktop/JavaSeleniumNotes/html/radioButton.html");
		
		// for above radio button page we want to select female radio button but it select male Bcoz findElemnt() gives first element find using name attribute 
		
		driver.findElement(By.name("gender")).click();

	}

}
