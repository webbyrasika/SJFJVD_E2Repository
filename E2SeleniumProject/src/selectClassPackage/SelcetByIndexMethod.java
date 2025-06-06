package selectClassPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelcetByIndexMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		// 12/4/25
		
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Dell/OneDrive/Desktop/JavaSeleniumNotes/html/dropdown.html");
		
		// To find Dropdown and store the address in a variable
		WebElement selectDD = driver.findElement(By.name("Companies"));
		
		Thread.sleep(1000);
		
		// Create a object of Select class and pass the ref. of dropDown
		Select sel = new Select(selectDD);
		
		// select an option based on index
		sel.selectByIndex(2); // Amzon is selected

	}

}
