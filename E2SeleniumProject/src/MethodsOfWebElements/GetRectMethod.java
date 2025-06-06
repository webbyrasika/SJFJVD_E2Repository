package MethodsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {

	public static void main(String[] args) {
		// 9/4/25

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement passTB = driver.findElement(By.id("pass"));

		Rectangle rect = passTB.getRect();

		int width = rect.getWidth();

		int height = rect.getHeight();

		int xaxis = rect.getX();

		int yaxis = rect.getY();

		System.out.println("Width of Password TB is : " + width + "\n Height of Password TB is: " + height
				+ "\n X-axis is: " + xaxis + "\n Y-axis is: " + yaxis);

	}

}
