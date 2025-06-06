package actionClassPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {

	public static void main(String[] args) 
	{
		// ActionClass Notes 16/4/25
		/* 1. Action class is used to perform Mouse actions
		 2.  It contains NonStatic methods
		 3. Actions class constructor is parameterized  and accepts driver ref.
		 4. At the end all actions we need to call perform() method otherwise no action will perform
		 syntax is Action act = new Actions()  */
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://in.kalkifashion.com/");
		
	    WebElement targetElement = driver.findElement(By.id("HeaderMenu-saree"));
		
//		WebElement te = driver.findElement(By.xpath("//span[text()='Saree']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(targetElement).perform();

	}

}
