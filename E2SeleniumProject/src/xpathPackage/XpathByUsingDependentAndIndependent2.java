package xpathPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByUsingDependentAndIndependent2 {

	public static void main(String[] args) throws InterruptedException
	{
		// 4/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("ELECTRONICS")).click();
		driver.findElement(By.linkText("Cell phones")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@alt='Picture of Smartphone']/../../..//input[@value='Add to cart']")).click();
		
//	OR //driver.findElement(By.xpath("//a[text()=\"Smartphone\"]/../..//input[@value='Add to cart']")).click();

	}

}
