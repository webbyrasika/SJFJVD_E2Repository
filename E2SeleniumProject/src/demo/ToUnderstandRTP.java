package demo;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToUnderstandRTP 
{

	static WebDriver driver; // global variable
	public static void main(String[] args) throws InterruptedException 
	{
       //to achieve run time polyMorphism we have created global static variable which holds object reference addresss
	  // for different browser object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr Browser Name : ");
		
		String browserValue = sc.next();
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browserValue.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Enter valid Browser Name");
				
		}
		
		Thread.sleep(3000);
		driver.close();
			

	}

}
