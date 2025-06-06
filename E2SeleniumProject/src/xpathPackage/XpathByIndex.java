package xpathPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex {

	public static void main(String[] args) throws InterruptedException
	{
		// 5/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Dell/OneDrive/Desktop/JavaSeleniumNotes/html/textbox.html");
		
		Thread.sleep(1000);
		// using index method we get element uniquely but this method is not recommended .
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("wadks346");
		

	}

}
