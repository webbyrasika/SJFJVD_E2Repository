package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSizeOfWindow {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
//		driver.manage().window().maximize();
		
		Dimension size = driver.manage().window().getSize(); // To get the dimension of browser window.
		
		int height = size.getHeight(); // To get the Height of browser window.
		
		int width = size.getWidth(); // To get the width of browser window.
		
		System.out.println("Height is : " + height + " Width is :  " + width );
		
		
        driver.manage().window().maximize(); // To maximize browser window
		
		Dimension size1 = driver.manage().window().getSize();
		
		int height1 = size1.getHeight(); // To get the Height of Browser window
		
		int width1 = size1.getWidth(); // To get the Width of Browser window
		
		System.out.println("After Maximize Height is : " + height1 + " After Maximize Width is :  " + width1 );
		
		//or
//		 int ht = driver.manage().window().getSize().getHeight();
		
		Dimension targetSize = new Dimension(500,300); // Object of Dimension class to specify width and height
		
		driver.manage().window().setSize(targetSize); // pass the specified dimension to setSize().
		
		int ht = driver.manage().window().getSize().getHeight(); // method chaining
		int wd = driver.manage().window().getSize().getWidth();
		
		System.out.println("new height :" + ht + " new width : " + wd);
		
		

	}

}
