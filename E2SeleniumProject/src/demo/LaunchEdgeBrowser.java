package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new EdgeDriver(); // UpCasting
		Thread.sleep(2000); // pause execution for 2 seconds
		driver.close(); // used to close browser
			

	}

}
