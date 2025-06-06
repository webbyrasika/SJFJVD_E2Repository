package pomPackage;

import java.io.IOException;

public class InvalidLoginTC extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		// 19/5/25
		
		BaseTest bt = new BaseTest();
		bt.browserSetup();

		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		
		// create object reference  of FLib class to call readExcelData method in order to read data from excel sheet
		FLib flib = new FLib();
		
		LoginPage lp = new LoginPage(driver);
		
		// get the row count of excelPath
		int rc = flib.getLastRowCount(EXCEL_PATH, INVALIDCREDS);
		
		// for invalid login using multiple inputs
		for(int i = 1; i<=rc; i++)
		{
			String email = flib.readExcelData(EXCEL_PATH, INVALIDCREDS, i, 0);
			String password = flib.readExcelData(EXCEL_PATH, INVALIDCREDS, i, 1);
		
			// using LopinPage ref. call InvalidLoginMethod to perform login operations
			lp.invalidLoginMethod(email, password);
			
		}
		
	}

}
