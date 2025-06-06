package dataDrivenFramework;

//import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
//import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginUsingProperties extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		// 9/5/25
		
		BaseTest bt = new BaseTest();
		// calling NS Method to launch browser
		bt.browserSetup();
		
		driver.findElement(By.linkText("Log in")).click();
		
		// Logic to get data from properties file
		
		FLib flib = new FLib();
		
		String email = flib.readPropertiesData(PROP_PATH, "email");
		
		String password = flib.readPropertiesData(PROP_PATH, "password");
		
        driver.findElement(By.id("Email")).sendKeys(email);
        Thread.sleep(500);
		
		driver.findElement(By.id("Password")).sendKeys(password);
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}

}
