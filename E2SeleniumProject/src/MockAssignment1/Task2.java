package MockAssignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task2 {

	public static void main(String[] args) 
	{
		// 15/5/25
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone 16",Keys.ENTER);
		
		WebElement pinkPhone = driver.findElement(By.xpath("//span[contains(text(),'iPhone 16 512 GB:') and contains(text(),'Pink') ]/../../../..//span[@class='a-price-whole']"));
		System.out.println("price :"+pinkPhone.getText());
		
		driver.findElement(By.xpath("//span[contains(text(),'iPhone 16 512 GB:') and contains(text(),'Pink') ]/../../../..//button[contains(@id,'a-autoid')]")).click();
		
	}

}
