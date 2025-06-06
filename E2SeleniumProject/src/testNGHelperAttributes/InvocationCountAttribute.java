package testNGHelperAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

//22/5/25
/*
 * method is called as test case
 * instruction we write inside method is called as test step
 * by default invocation count is 1
 * In order to execute multiple time we gives invocation count after @Test annotation
 * by default it executes according to alphabetical order
 */
public class InvocationCountAttribute 
{
  @Test (invocationCount = 0) // This method will not invoked
  public void login() 
  {
	Reporter.log("This is Login Method", false);
  }
  
  @Test (invocationCount = 1) // This method  will be invoked 1 time
  public void register()
  {
	  Reporter.log("This is Register Method", true);
  }
  
  @Test (invocationCount = 2) // this method will run 2 times
  public void addToCart()
  {
	  Reporter.log("This is Add to Cart Method", true);
  }
  
}
