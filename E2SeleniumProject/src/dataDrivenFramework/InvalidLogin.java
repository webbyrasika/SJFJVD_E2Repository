package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLogin extends BaseTest{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		// 9/5/25
		
		// create object of parent class in-order to  access NS method of BaseTest class
		BaseTest bt = new BaseTest();
		// calling NS Method to launch browser
		bt.browserSetup();
		
		driver.findElement(By.linkText("Log in")).click();
		
		
		// Logic to read excel data
		FLib flib = new FLib();
		
		int rc = flib.getLastRowCount(EXCEL_PATH, INVALIDCREDS);
		
		for(int i=1;i<=rc;i++)
		{
		String email = flib.readExcelData(EXCEL_PATH, INVALIDCREDS, i, 0);
		
		String password = flib.readExcelData(EXCEL_PATH, INVALIDCREDS, i, 1);
	
		
		driver.findElement(By.id("Email")).sendKeys(email);
		Thread.sleep(500);
		
		driver.findElement(By.id("Password")).sendKeys(password);
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Password")).clear();
		}

	}

}
