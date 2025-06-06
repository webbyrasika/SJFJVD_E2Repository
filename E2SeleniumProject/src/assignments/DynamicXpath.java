package assignments;

import java.time.LocalDateTime;
import java.time.Month;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) throws InterruptedException 
	{
		// 11/4/25

		// To get todays system date
		LocalDateTime todaysDate = LocalDateTime.now();
		System.out.println(todaysDate);
		
		// To get month and get month value in the form of enum
		Month month = todaysDate.getMonth();
		System.out.println(month);
		
		// To convert enum value into string format
		String monthInString = month.toString();
		
		// To get the values in the form of April means first letter capital  and rest letters in small
		
		String newMonth = monthInString.charAt(0) + monthInString.substring(1).toLowerCase();
		System.out.println(newMonth);
		
		// to get today day of month
		int day = todaysDate.getDayOfMonth();
		System.out.println(day);
		
		
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.redbus.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.id("date-box")).click();
		Thread.sleep(1000);
		
		//static Xpath
		//driver.findElement(By.xpath("//div[text()='May']/../..//span[text()='12']")).click();
		
		
		// Dynamic path
		driver.findElement(By.xpath("//div[text()='"+newMonth+"']/../..//span[text()='"+day+"']")).click();
	}

}
