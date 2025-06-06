package selectClassPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsMethod {

	public static void main(String[] args) throws InterruptedException
	{
		// 12/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		Thread.sleep(1000);
		
		//To find the Multi-select dropDown
		WebElement multiselectDD = driver.findElement(By.id("multiselect1"));
		
		// Create the object of select class to handle the dropdown
		Select sel = new Select(multiselectDD);
		Thread.sleep(1000);
		
		sel.selectByVisibleText("Audi");
		Thread.sleep(500);
		
		sel.selectByIndex(2);
		Thread.sleep(500);
		
		sel.selectByValue("swiftx");
		Thread.sleep(500);
		
		// To fetch all the selected Options from the dropdown
		List<WebElement> allSelectedOps = sel.getAllSelectedOptions();
		
		// To get the text of each options that was selected
		for(WebElement we : allSelectedOps)
		{
			String text = we.getText();
			System.out.println(text);
			Thread.sleep(500);
			
		}
		
		

	}

}
