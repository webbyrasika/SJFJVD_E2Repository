package xpathPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAndandOrLogicalOperator {

	public static void main(String[] args) throws InterruptedException 
	{
		// 1/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Dell/OneDrive/Desktop/JavaSeleniumNotes/html/radioButton.html");
		
		// select female when both the condition are true
		driver.findElement(By.xpath("//input[@name='gender' and contains(@value, 'Female')]")).click();
		Thread.sleep(2000);
		
		driver.navigate().refresh();// to refresh the page
		
		Thread.sleep(1000);
		
		// Select male  radio button as first condition gets true
		driver.findElement(By.xpath("//input[@name='gender' or contains(@value, 'Female')]")).click();

	}

}
