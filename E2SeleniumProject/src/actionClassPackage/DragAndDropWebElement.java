package actionClassPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropWebElement {

	public static void main(String[] args) throws InterruptedException 
	{
		// 16/4/25
		
				WebDriver driver = new ChromeDriver();
			    driver.manage().window().maximize();
						
				driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
				Thread.sleep(1000);
				
				// Finding the source element
				WebElement osloBoxSrc = driver.findElement(By.id("box1"));
				System.out.println(osloBoxSrc.getText());
				
				//To get background color of src element before dropping
				System.out.println("Before transfering or dropping to Norway Box");
				System.out.println(osloBoxSrc.getCssValue("background-color"));
				
				// Finding the target Element
				WebElement norwayBoxTarget = driver.findElement(By.id("box101"));
				System.out.println(norwayBoxTarget.getText());
				
				// Creating the object of Actions class
				Actions act = new Actions(driver);
				
				// To drag the src element and drop into target element
			
				act.dragAndDrop(osloBoxSrc, norwayBoxTarget).perform(); // Drag the oslo box into norway box
				
				//To get background color of src element after dropping
				System.out.println("After transfering or dropping to Norway Box");
				System.out.println(osloBoxSrc.getCssValue("background-color"));


	}

}
