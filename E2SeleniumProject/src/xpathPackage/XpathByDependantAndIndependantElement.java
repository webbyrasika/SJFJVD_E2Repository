package xpathPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByDependantAndIndependantElement {

	public static void main(String[] args) throws InterruptedException 
	{
		// 4/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		
		driver.findElement(By.id("onward_cal")).click(); // click on date input element
		//OR 
		// driver.findElement(By.id("date-box")).click(); OR
	   //driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='May']/../..//span[text()='10']")).click();
		
		// xPath by Dependent and Independent Elements
		// 1. Identify the Independent element.
		//2. Traverse till the common parent of both dependent and Independent elements.
		//3. Traverse till the dependent / child element.

	}

}
