package MethodsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {

	public static void main(String[] args) 
	{
		// 9/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//getSize() : Dimension (c)
		// width : getWidth(): int ,  height:getHeight():int
		
		WebElement emailTB = driver.findElement(By.id("email"));	
		
		Dimension size = emailTB.getSize();
		
		int width = size.getWidth();
		
		int height = size.getHeight();
		
		System.out.println("Width of Email textbox : " + width + " \n Height of Email textbox : " + height);
		

	}

}
