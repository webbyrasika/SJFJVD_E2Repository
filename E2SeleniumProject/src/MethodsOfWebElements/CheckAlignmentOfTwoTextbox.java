package MethodsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAlignmentOfTwoTextbox {

	public static void main(String[] args) {
		// 10/4/25

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();

		WebElement emailTB = driver.findElement(By.id("Email"));

		WebElement passTB = driver.findElement(By.id("Password"));

		// location and size of email textBox
		
		Rectangle rectEmail = emailTB.getRect();

		int widthEmail = rectEmail.getWidth();

		int heightEmail = rectEmail.getHeight();

		int xaxisEmail = rectEmail.getX();

		int yaxisEmail = rectEmail.getY();
		
		// location and size of Password textBox

		Rectangle rectPass = passTB.getRect();

		int widthPass = rectPass.getWidth();

		int heightPass = rectPass.getHeight();

		int xaxisPass = rectPass.getX();

		int yaxisPass = rectPass.getY();

		System.out.println("Email : " + " widthEmail : " + widthEmail + ", heightEmail :" + heightEmail + ", xaxisEmail: "
				+ xaxisEmail + ", yaxisEmail :" + yaxisEmail);
		
		System.out.println("Pass : " + " widthPass: " + widthPass + ", heightPass :" + heightPass + ", xaxisPass: "
				+ xaxisPass + ", yaxisPass :" + yaxisPass);
		
		
		//To check left alignment is proper or not
		int leftAlignment = xaxisEmail - xaxisPass;
		System.out.println("leftAlignment :"+leftAlignment);
		
		// give 10 px buffer
		if(leftAlignment > -5 && leftAlignment < 5 )
		{
			System.out.println("Left Alignment is Correct");
		}
		else
		{
			System.out.println("Left Alignment is Not Correct");
		}
		
		// To check right  alignment is  proper or not
		
		int rightAlignment = (widthEmail + xaxisEmail) - (widthPass + xaxisPass);
		System.out.println("rightAlignment : " + rightAlignment);
		
		if(rightAlignment > -5 && rightAlignment < 5 )
		{
			System.out.println("Right Alignment is Correct");
		}
		else
		{
			System.out.println("Right Alignment is Not Correct");
		}
		
		
		// To check textBoxes are overlap or not
		
		int isOverlap = yaxisPass - (yaxisEmail + heightEmail) ;
		
		if(isOverlap > 0)
		{
			System.out.println("Textboxes are not overlapping");
		}
		else
		{
			System.out.println("Textboxes are overlapping");
		}


	}

}
