package genericPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pomPackage.LoginPage;
import pomPackage.WelcomePage;

public class BaseTest implements IAutoConstant
{
	
  public static WebDriver driver ;
  
  @BeforeClass
  public void browserSetup() throws IOException
  {
	 FLib flib = new FLib();
	String browservalue = flib.readPropertiesData(MAIN_PROP_PATH, "chrome");
	
	String url = flib.readPropertiesData(MAIN_PROP_PATH, "url");
	
	if(browservalue.equalsIgnoreCase("chrome"))
	{
		driver = new ChromeDriver();
	}
	else if(browservalue.equalsIgnoreCase("firefox"))
	{
		driver = new FirefoxDriver();
	}
	else if(browservalue.equalsIgnoreCase("edge"))
	{
		driver = new EdgeDriver();
	}
	else 
	{
		System.out.println("Invalid Browser");
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(url);
  }
  
  @AfterClass
  public void browserTearDown() 
  {
	  driver.quit();
  }
  
  @BeforeMethod
  public void login() throws EncryptedDocumentException, IOException, InterruptedException 
  {
	    WelcomePage wp = new WelcomePage(driver); 
		wp.getLoginLink().click(); 
		
		// Create the object of FLib class to read data from Excel files
		FLib flib = new FLib();
		String email = flib.readExcelData(MAIN_EXCEL_PATH, VALIDCREDS, 1, 0);
		String pwd = flib.readExcelData(VALIDCREDS, 1, 1,MAIN_EXCEL_PATH);
		
		// Create the object of LoginPage
		LoginPage lp = new LoginPage(driver);
		lp.validLoginMethod(email, pwd);
		
  }
  
  @AfterMethod
  public void logout()
  {
	  WelcomePage wp = new WelcomePage(driver); 
		wp.getLogoutLink().click();
  }
}
