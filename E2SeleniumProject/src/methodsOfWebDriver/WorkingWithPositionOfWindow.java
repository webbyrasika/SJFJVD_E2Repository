package methodsOfWebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithPositionOfWindow {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		// To get position (x and y axis) of the window
		Point point = driver.manage().window().getPosition();
		
		int xaxix = point.getX(); // To get the value of x axis
		int yaxis = point.getY();// To get the value of y axis
		
		System.out.println("X-Axis is : "+xaxix+" Y-Axis is : " + yaxis); // to print
		Thread.sleep(2000);
		
		// Creating object of Point and passing x and y values in pixel
		Point targetPoint = new Point(250,180);
		
		// To set the position of browser window
		driver.manage().window().setPosition(targetPoint);
		
		

	}

}
