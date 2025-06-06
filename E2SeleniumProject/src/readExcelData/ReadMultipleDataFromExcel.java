package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		// 6/5/25
		
		// Dynamically get the no. count of row
		
		FileInputStream fis1 = new FileInputStream("./data/TestData.xlsx");
		Workbook wb1 = WorkbookFactory.create(fis1); // create means to load file
		Sheet sheet1 = wb1.getSheet("ipl");
		// getLastRowNum gives last row count and it counts from 0 .
		int rc = sheet1.getLastRowNum();
		System.out.println(rc);
		
		
		// Logic for to get all the teams name
		for(int i=1;i<=rc;i++)
		{
				FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
				Workbook wb = WorkbookFactory.create(fis);
				Sheet sheet = wb.getSheet("ipl");
				Row row = sheet.getRow(i);
				Cell cell = row.getCell(0);
				String data = cell.toString();
				System.out.println(data);
				Thread.sleep(1000);
				
		}		
				

	}

}
