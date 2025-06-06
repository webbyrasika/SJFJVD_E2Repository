package handlingPopups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleNotificationPopup {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		// 24/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		driver.get("https://www.easemytrip.com/");
		
		Thread.sleep(5000);
		
		//NOTE :-  Be careful while using Robot class if you forget to release the key then it is always be press until you release it
		
		//Create the object of robot class as it consists of non-static methods
		Robot robot = new Robot();
		
		// To press TAB key
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		//To Release TAB key
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(500);
		
		// To press Enter key
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		//To release Enter key
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	


	}

}

