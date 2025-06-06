package readExcelData;

import java.io.FileInputStream;
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

public class DWSInvalidLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		// 7/5/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		FileInputStream fis1 = new FileInputStream("./data/TestData.xlsx");
		Workbook wb1 = WorkbookFactory.create(fis1); // create means to load file
		Sheet sheet1 = wb1.getSheet("invalidcreds");
		// getLastRowNum gives last row count and it counts from 0 .
		int rc = sheet1.getLastRowNum();
		System.out.println(rc);
		
		// Logic for to get all the teams name
		for(int i=1;i<=rc;i++)
		{
				FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
				Workbook wb = WorkbookFactory.create(fis);
				Sheet sheet = wb.getSheet("invalidcreds");
				Row row = sheet.getRow(i);
				Cell cell = row.getCell(0);
				String email = cell.toString();
				//System.out.println(email);
				Thread.sleep(1000);
				
				Cell cell1 = row.getCell(1);
				String password = cell1.toString();
				
				driver.findElement(By.id("Email")).sendKeys(email);
				
				driver.findElement(By.id("Password")).sendKeys(password);
				
				driver.findElement(By.xpath("//input[@value='Log in']")).click();

				Thread.sleep(500);
				
				driver.findElement(By.id("Email")).clear();
				driver.findElement(By.id("Password")).clear();
		}				

	}

}
