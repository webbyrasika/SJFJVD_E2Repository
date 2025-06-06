package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWSLogin {

	public static void main(String[] args) throws  IOException 
	{
		// 5/5/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		//Thread.sleep(1000);
		
        FileInputStream fis = new FileInputStream("./data/TestData.properties");
		
		// To creating the object of Properties class to access load()
		Properties prop = new Properties();
		
		//To load the the specified file or make the file ready to read
		prop.load(fis);
		
		// To read the email(data) from property file
		String email = prop.getProperty("email");
		//System.out.println(email);
		
		// To read the password(data) from property file
		String password = prop.getProperty("password");

		
		driver.findElement(By.id("Email")).sendKeys(email);
		//Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys(password);
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}

}
