package testNGAssertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToUnderstandSoftAssert {
  @Test
  public void verifyUsingSoftAssert() 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demowebshop.tricentis.com/");
	  
	  String expectedTitleOfElectronicsPage = "Demo Web Shop. Electronics";
	  
	  driver.findElement(By.linkText("ELECTRONICS")).click();
	  
	 SoftAssert sa = new SoftAssert();
	 sa.assertNotEquals(driver.getTitle(), expectedTitleOfElectronicsPage, "Electronic page is not displayed");
	 
	 driver.findElement(By.xpath("//img[@title='Show products in category Cell phones']")).click();
	  
	  String  expectedCellPhonePageTitle = "Demo Web Shop. Cell phones";
	  
	  sa.assertEquals(driver.getTitle(), expectedCellPhonePageTitle, "Cell phone page is not displayed");
	  
	  sa.assertAll();
	  
  }
}
