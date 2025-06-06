package selectClassPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUseOperationalMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		// 14/4/25
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///C:/Users/Dell/OneDrive/Desktop/JavaSeleniumNotes/html/dropdown.html");
				
		Thread.sleep(1000);
		
		WebElement dropdown = driver.findElement(By.name("Companies2"));
		
		Select sel = new Select(dropdown);
		
		sel.selectByIndex(4);
		Thread.sleep(500);
		
		sel.selectByVisibleText("Neilsoft");
		Thread.sleep(500);
		
		sel.selectByValue("v8");
		Thread.sleep(500);
		
		boolean result = sel.isMultiple();
		
		if(result == true)
		{
			System.out.println("The dropdown is Multi select dropdown");
		}
		else
		{
			System.out.println("The dropdown is Single select dropdown");
		}
		
		System.out.println("--------------- Firsty selected option----------");
		WebElement firstSelected = sel.getFirstSelectedOption();
		
		String firstOptionText = firstSelected.getText();
		
		System.out.println("First Selected option is: "+ firstOptionText);
		
		System.out.println("--------------- All selected option----------");
		
		List<WebElement> allSelected = sel.getAllSelectedOptions();
		
		for(WebElement we: allSelected) 
		{
			System.out.println(we.getText());
		}
		
		
		// Logic to options which are not selected
		
		List<WebElement> allOptions = sel.getOptions();
		
		allOptions.removeAll(allSelected);
		
		System.out.println("--------------- Not Selected option----------");
		
		for(WebElement we: allOptions)
		{
			System.out.println(we.getText());
		}
		
		

		
		
		
		
		
		
		
		
		


	}

}
