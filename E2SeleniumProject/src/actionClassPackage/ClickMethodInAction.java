package actionClassPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickMethodInAction {

	public static void main(String[] args) 
	{
		// 16/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		// Trying to click on the web element by using web element interface
//		driver.findElement(By.id("uploadfile")).click();  // Gives InvalidArgumentException (RunTimeException)
		
		// Finding web element and storing in a variable
		WebElement uploadFileButton = driver.findElement(By.id("uploadfile"));
		
		//Creating the Object of Actions class 
		Actions act = new Actions(driver);
		
		//way 1 To perform click operation using click() of Action class
//		act.moveToElement(uploadFileButton).click().perform();
		
		// way 2 To perform click Operation using click(WebElement target ) of Actions.
    	act.click(uploadFileButton).perform();
		

	}

}
