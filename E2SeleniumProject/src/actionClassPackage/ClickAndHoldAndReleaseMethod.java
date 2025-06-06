package actionClassPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldAndReleaseMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		// 18/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
		Thread.sleep(2000);
		
		WebElement clickAndHoldElement = driver.findElement(By.xpath("//div[@id='circle']"));
		
		Actions act = new Actions(driver);
		
		// Click and hold element for 3 seconds using parameterized method
		act.moveToElement(clickAndHoldElement).clickAndHold().perform();
		Thread.sleep(3000);
		
		// To release the element which is held
		act.moveToElement(clickAndHoldElement).release().perform();
		
		// click and hold using parameterized method
		act.clickAndHold(clickAndHoldElement).perform();
		
		Thread.sleep(2000);
		
		
		act.release(clickAndHoldElement);
		
	}

}
