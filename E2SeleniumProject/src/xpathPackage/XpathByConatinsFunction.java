package xpathPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByConatinsFunction {

	public static void main(String[] args)
	{
		// 31/3/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		// find element using partial text value using xPath by contains() syntax
		
		WebElement welcomeText = driver.findElement(By.xpath("//h1[contains(text(),'Welcome')]"));
		
		System.out.println(welcomeText.getText());

	}

}
