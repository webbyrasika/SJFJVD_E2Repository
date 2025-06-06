package MethodsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException
	{
		// 10/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		
		WebElement checkBox = driver.findElement(By.id("RememberMe"));
		
//		if(checkBox.isSelected())
//		{
//			System.out.println("RememberMe checkbox is Selected");
//		}
//		else
//		{
//			System.out.println("RememberMe checkbox is Not Selected");
//		}
//			
		if(checkBox.isSelected())
		{
			System.out.println("RememberMe checkbox is Alraedy Selected");
		}
		else
		{
			checkBox.click();
			
		}
		


	}

}
