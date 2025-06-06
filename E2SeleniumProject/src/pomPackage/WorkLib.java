package pomPackage;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WorkLib
{
	//21/5/25
	
	public void selectByVisibleText(WebElement dropdown, String text )
	{
		Select sel = new Select(dropdown);
		sel.selectByVisibleText(text);
	}
	
	public void selectByIndex(WebElement dropdown,int index )
	{
		Select sel = new Select(dropdown);
		sel.selectByIndex(index);
	}
	
	public void selectByValue(WebElement dropdown, String value )
	{
		Select sel = new Select(dropdown);
		sel.selectByValue(value);
	}
	
	//To generate random number of 4 digit
	
	public int randomNumber()
	{
		Random random = new Random();
		int rn = random.nextInt(1000,9999);
		return rn;
	}

}
