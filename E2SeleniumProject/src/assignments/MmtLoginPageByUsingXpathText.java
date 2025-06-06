package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MmtLoginPageByUsingXpathText {

	public static void main(String[] args) throws InterruptedException
	{
		// 5/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//p[text()='Login or Create Account']")).click();
		//  org.openqa.selenium.ElementClickInterceptedException: element click intercepted:
		//Element <p data-cy="LoginHeaderText">...</p> is not clickable at point (1118, 26). 
		//Other element would receive the click: <div class="imageSlideContainer">...</div>

		driver.findElement(By.xpath("//div[@class='makeFlex column flexOne whiteText latoBold']")).click();
		
		
	driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("9881829985");
		
		
		

		
	}

}
