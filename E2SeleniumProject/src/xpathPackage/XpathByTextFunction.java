package xpathPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByTextFunction {

	public static void main(String[] args) throws InterruptedException
	{
		// 31/3/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		// syntax:1  //tagName[text()='text of WebElement']
		// syntax:2  //tagName[.='text of WebElement']
		
//		driver.findElement(By.xpath("//a[text()='Log in']")).click(); //  using text() function to find element using text which is present directly inside link text
		
		driver.findElement(By.xpath("//li[.='Log in']")).click(); // used when text text is not directly present inside <a> tag
		
		Thread.sleep(1000);
		
		// xPath using text
		
		WebElement emailText = driver.findElement(By.xpath("//label[text()='Email:']"));
		
		String text = emailText.getText(); // find element using email text and get back text using getText() method and call using reference
		
		System.out.println(text); // print text in console
		

	}

}
