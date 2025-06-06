package TakeScreenshotPackage;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakingScreenshotOfAWebElement {

	public static void main(String[] args) throws IOException 
	{
		// 15/4/25
		
				String dateTime = LocalDateTime.now().toString();
				System.out.println(dateTime);
				
				String timeStamp = dateTime.replaceAll(":", "-");
				System.out.println(timeStamp);
				
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://www.facebook.com/");
				
				// Step 1: Locating the webElwment and storing 
				WebElement loginButton = driver.findElement(By.name("login"));
				
				// Step 2:  capturing the screenshot of WE by accessing getScreenshotAs() through ref var of WE
				File src = loginButton.getScreenshotAs(OutputType.FILE);
				
				// step 3:  Creating new file and specifying pathname and extension to store the screenshot
				File dest = new File("./screenshots/FbLoginButton"+timeStamp+".png");
				
				// Step 4: Storing the screenshots by using copy() of files com.google.common.io package
				Files.copy(src, dest);
				

	}

}
