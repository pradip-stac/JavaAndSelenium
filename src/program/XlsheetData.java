package program;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XlsheetData {
	public static String xldata (String SheetName,int row,int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\New folder\\pradip.xlsx");
		
      
	String a = WorkbookFactory.create(file).getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
	
	return a;
	
	
	}
	public static double exelintdata (String SheetName, int row,int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream file =new FileInputStream("C:\\\\New folder\\\\pradip.xlsx");
		
	double d =	WorkbookFactory.create(file).getSheet(SheetName).getRow(row).getCell(cell).getNumericCellValue();
	
	return d;
	}

}