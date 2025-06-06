package selectClassPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelctAndDeselectAllOptions {

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
				
				// To check whether the dropdown is multiselect or not
				boolean result = sel.isMultiple(); // Operational method
				
				if(result == true)
				{
					System.out.println("The Dropdown is Multi Select Dropdown");
				}
				else
				{
					System.out.println("The Dropdown is Single Select Dropdown");
					
				}
				
				// To fetch all the options from dropdown
				 List<WebElement> dropdownOps = sel.getOptions(); // Operational Method
				 
				 int i=0; // Initializing the value of i var. to select multiple options from dropdown
				 for(WebElement we : dropdownOps) 
				 {
					 sel.selectByIndex(i); // selecting the options based on index value
					 Thread.sleep(500);
					 i++; // increment the value of i by 1
				 }
				
				Thread.sleep(2000);
				
				sel.deselectAll(); // DeSelect All Options from dropdown at once.
				

				
	}

}
