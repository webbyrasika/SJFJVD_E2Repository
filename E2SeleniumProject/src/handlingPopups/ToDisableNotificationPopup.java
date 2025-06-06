package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToDisableNotificationPopup {

	public static void main(String[] args) 
	{
		// 23/4/25
		
		// Creating the Object of ChromeOptions class
		ChromeOptions co = new ChromeOptions();
		
		// To disable the notification Popup
		co.addArguments("--disable-notifications");

		// Creating the Object of ChromeDriver and passing the reference of ChromeOptions to disable the notification popup
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		driver.get("https://www.easemytrip.com/");

	}

}
