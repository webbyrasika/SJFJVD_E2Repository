package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException 
	{
		// 22/4/25
		
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
				
				driver.get("https://omayo.blogspot.com/");
				
				driver.findElement(By.id("alert1")).click();
				
				Alert simpleAlert = driver.switchTo().alert();
				
				Thread.sleep(2000);
			
				System.out.println(simpleAlert.getText());
				
				simpleAlert.accept();
				
				//simpleAlert.dismiss();
				
                 
				driver.close();

	}

}
