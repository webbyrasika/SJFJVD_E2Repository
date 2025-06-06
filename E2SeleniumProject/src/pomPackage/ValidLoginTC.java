package pomPackage;

import java.io.IOException;

// extend ValidLogin class to BaseTest to access the browserSetUp method
public class ValidLoginTC extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		// 17/5/25
		
		// Creating the object of BaseTest class
		BaseTest bt = new BaseTest();
		bt.browserSetup(); // using obj ref accessing browserSetUP method
		
		// now create the object of welcome page to access the login link element
		WelcomePage wp = new WelcomePage(driver); // driver reference coming from BaseTest parent class
		wp.getLoginLink().click(); // call getter method and click on login link using click() method
		
		// Create the object of FLib class to read data from Excel files
		FLib flib = new FLib();
		String email = flib.readExcelData(EXCEL_PATH, VALIDCREDS, 1, 0);
		String pwd = flib.readExcelData(VALIDCREDS, 1, 1,EXCEL_PATH);
		
		// Create the object of LoginPage
		LoginPage lp = new LoginPage(driver);
		lp.validLoginMethod(email, pwd);
		

	}

}
