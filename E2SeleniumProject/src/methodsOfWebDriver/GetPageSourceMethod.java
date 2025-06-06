package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://dribbble.com/");
		
		String pageSource  = driver.getPageSource(); // To give page source
		
		System.out.println(pageSource);
		

	}

}
