package methodsOfWebDriver;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException
	{
		// 5/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		
		// switching to active elements and passing data in search box of google 
		WebElement activeElement = driver.switchTo().activeElement();
		activeElement.sendKeys("bikes");
		Thread.sleep(1000);
		
		List<WebElement> bikesOptions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
		for(WebElement we : bikesOptions)
		{
			String text = we.getText();
			System.out.println(text);
			Thread.sleep(1000);
		}
		

	}

}
