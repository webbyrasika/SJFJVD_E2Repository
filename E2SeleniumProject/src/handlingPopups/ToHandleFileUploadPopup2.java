package handlingPopups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleFileUploadPopup2 {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		// 26/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		
		// Launching the web application
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		WebElement fileUploadButton = driver.findElement(By.id("uploadfile"));
		//Thread.sleep(5000);
		//fileUploadButton.sendKeys("‪‪C:\\Users\\Dell\\Downloads\\Rasika_Tembhare_Resume.docx"); // InvalidArgumentException
		
		Actions act = new Actions(driver);
		//act.click(fileUploadButton).perform();
		act.moveToElement(fileUploadButton).click().perform();
		
		//Runtime.getRuntime().exec("./autoitPrograms/FileUploadPopup.exe");
		
		Runtime.getRuntime().exec("./autoitPrograms/FileUploadPoup.exe");
		

	}

}
