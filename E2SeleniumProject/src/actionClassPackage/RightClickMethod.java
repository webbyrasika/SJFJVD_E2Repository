package actionClassPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		// 17/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//section[text()='Button']/..")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Right Click")).click();
		Thread.sleep(3000);
		
		WebElement button1 = driver.findElement(By.id("btn30"));
		
		WebElement button2 = driver.findElement(By.id("btn31"));
		
		WebElement button3 = driver.findElement(By.id("btn32"));
		
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		
		act.moveToElement(button1).contextClick().perform(); // Perform right click operation on button1 
		
		// click using webElement click() method
		driver.findElement(By.xpath("//div[text()='Yes']")).click(); // Selecting yes option
		Thread.sleep(500);
		// Capturing the message after selecting yes option
		WebElement msg1 = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']"));
		System.out.println(msg1.getText()); // printing the captured msg.
		
		// click using actions class() click method
//		Thread.sleep(2000);
//		act.click(driver.findElement(By.xpath("//div[text()='Yes']"))).perform(); //selecting yes option
		
		
		act.contextClick(button2).perform(); // Perform right click operation on button2
		driver.findElement(By.xpath("//div[text()='No']")).click(); // Selecting No option
		Thread.sleep(500);
		// Capturing the message after selecting No option
		WebElement msg2 = driver.findElement(By.xpath("//span[text()='You selected \"No\"']"));
		System.out.println(msg2.getText()); // printing the captured msg.
		
		
		act.contextClick(button3).perform(); // Perform right click operation on button3
		driver.findElement(By.xpath("//div[text()='5']")).click(); // Selecting  option 5.
		Thread.sleep(500);
		WebElement msg3 = driver.findElement(By.xpath("//span[text()='You selected \"5\"']"));
		System.out.println(msg3.getText());
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
