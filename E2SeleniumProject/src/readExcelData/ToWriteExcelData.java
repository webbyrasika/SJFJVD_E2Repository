package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToWriteExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		// 7/5/25
		
		//Creating the Object of FileInputStream and specifying the path of the file
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		
		// To make the File Ready to Read
		Workbook wb = WorkbookFactory.create(fis); // create means to load file
		
		//To get into the sheet
		Sheet sheet = wb.getSheet("ipl");
		
		//To create a new row virtually
		Row row = sheet.createRow(11);
		
		//To create a new cell virtually
		Cell cell = row.createCell(0);
		
		//To set a value for the cell
		cell.setCellValue("PUNE");
		
		//To write the data in the Specified Files
		FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx");
		
		wb.write(fos);
		
		
		
		

	}

}
