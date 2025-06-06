package actionClassPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysMethodOfActionsClass {

	public static void main(String[] args) throws InterruptedException
	{
		// 18/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		
		WebElement emailTB = driver.findElement(By.id("Email"));
		
		WebElement passwordTB = driver.findElement(By.id("Password"));
		
		WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Log in']"));
		
		Actions act = new Actions(driver);
		
		// Sending inputs to email textfield using sendKeys() of actions class
		
		//act.moveToElement(emailTB).sendKeys("qspwakad@gmail.com").perform();
		
		act.sendKeys(emailTB, "qspwakad@gmail.com").perform();
		Thread.sleep(1000);
		
		// Sending inputs to password textfield using sendKeys() of actions class
		
		//act.moveToElement(passwordTB).click().sendKeys("wertyu67").perform();
		act.sendKeys(passwordTB, "werty678").perform();
		
		//Performing click operation on login button using click() of actions class
		act.click(loginBtn).perform();
		

	}

}
