package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver(); // To Launch the browser
		
		driver.get("https://www.zomato.com/"); // To Launch Web Application
		
		// getTitle method used to get the title of the page 
		String title = driver.getTitle(); // To fetch title of the page
		
		System.out.println(title); // To print the title
	}

}
