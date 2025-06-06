package testNGHelperAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodsHelperAttribute
{
	//23/5/25
	
  @Test(dependsOnMethods = "addToCart")
  public void buyProduct() 
  {
	  Reporter.log("This is Buy Product Method", true);
  }
  
  @Test(dependsOnMethods = "register")
  public void login() 
  {
	  int a = 10;
	  System.out.println(a/0);
	  Reporter.log("This is Login Method", true);
  }
  
  @Test 
  public void register()
  {
	  Reporter.log("This is Register Method", true);
  }
  
  @Test(dependsOnMethods = {"register","login"})
  public void addToCart()
  {
	  Reporter.log("This is Add To Cart Method", true);
  }
}
