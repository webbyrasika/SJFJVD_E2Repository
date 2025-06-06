package testNGHelperAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

//23/5/25

/*
 * By default priority for all method is 0
 * least number has higher priority
 * If we don't give @Test annotation then that method will not execute
 * 
 */

public class PriorityHelperAttribute {
	
  @Test (priority = 2)
  public void login() 
  {
	  Reporter.log("This is Login Method", true);
  }
  
  @Test (priority = -3)
  public void register()
  {
	  Reporter.log("This is Register Method", true);
  }
  
  @Test (priority = 5)
  public void addToCart()
  {
	  Reporter.log("This is Add To Cart Method", true);
  }
}
