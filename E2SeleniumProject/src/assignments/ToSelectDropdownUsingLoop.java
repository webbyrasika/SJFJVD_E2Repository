package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelectDropdownUsingLoop {

	public static void main(String[] args) throws InterruptedException 
	{
		// 15/4/25

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");

		Thread.sleep(1000);

		WebElement dayDD = driver.findElement(By.id("day"));

		WebElement monthDD = driver.findElement(By.id("month"));

		WebElement yearDD = driver.findElement(By.id("year"));

		Thread.sleep(1000);

		// Getting day dropdown and selecting using index value
		System.out.println("----------- All day's options ------------- ");
		Select day = new Select(dayDD);

		List<WebElement> allDayOps = day.getOptions();

		int i = 0;
		for (WebElement we : allDayOps) 
		{
//		    System.out.println(we.getText());
	     	day.selectByIndex(i);
			i++;
			
		}
		
		Thread.sleep(1000);


		System.out.println("----------- All Months options ------------- ");
		// Getting month dropdown and selecting all by Visible text
		Select month = new Select(monthDD);
		
		List<WebElement> allMonthOps = month.getOptions();
		
		for(WebElement we:allMonthOps)
		{
			String text = we.getText();
//			System.out.println(text);
			
			month.selectByVisibleText(text);
			
			
		}
		
		Thread.sleep(1000);
		

		System.out.println("----------- All Year options ------------- ");
		// Getting year dropdown and selecting all by values
	    Select year = new Select(yearDD); 
	    
	    List<WebElement> allYearOps = year.getOptions();
	    
	    for(WebElement we:allYearOps)
	    {
	    	String text = we.getText();
//			System.out.println(text);
			
			year.selectByValue(text);
			
	    }
	    
		

	}

}
