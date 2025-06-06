package selectClassPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		// 12/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		Thread.sleep(1000);
		
		WebElement dayDD = driver.findElement(By.id("day"));
		
		WebElement monthDD = driver.findElement(By.id("month"));
		
		WebElement yearDD = driver.findElement(By.id("year"));
		
		Thread.sleep(1000);
		
		//Select class object to handle Day dropDown
		Select day = new Select(dayDD);
		day.selectByIndex(24); // using index method we want to select 25 as day so index will be 24 
		Thread.sleep(1000);
		
		// Select class object to Handle month dropDown
		Select month = new Select(monthDD);
		month.selectByValue("6"); // Selecting the option based on value
		Thread.sleep(1000);
		
		// Select class object to handle year dropDown 
		Select year = new Select(yearDD); // Selecting option based on visible text for 1996
		year.selectByVisibleText("1996");
		
		

	}

}
