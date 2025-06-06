package dataDrivenFramework;

//import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginUsingExel extends BaseTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		// 7/5/25
		
		BaseTest bt = new BaseTest();
		// calling NS Method to launch browser
		bt.browserSetup();
		driver.findElement(By.linkText("Log in")).click();
		
          // 8/5/25
		
		// Logic to read excel data
		FLib flib = new FLib();
		String email = flib.readExcelData(EXCEL_PATH, VALIDCREDS, 1, 0);
		// as password is stored in numeric value hence used overloaded method bcoz of that filePath given at the end
		String password = flib.readExcelData(VALIDCREDS, 1, 1,EXCEL_PATH);
		
		System.out.println(email);
		System.out.println(password);
		
		
		driver.findElement(By.id("Email")).sendKeys(email);
		
		driver.findElement(By.id("Password")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();


	}

}
