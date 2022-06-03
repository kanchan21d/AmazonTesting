package InitialTest;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelsheetTestClass {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String path="E:\\Selenium\\ExcelSample.xlsx";	
		FileInputStream file=new FileInputStream(path);
		String value=WorkbookFactory.create(file).getSheet("Velocity").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
	}

}
