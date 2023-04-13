package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RowCellXml {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		FileInputStream stram = new FileInputStream ("C:\\Users\\Ragini kale\\Desktop\\Book2.xlsx");
		
		String data = WorkbookFactory .create(stram).getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
		System.out.println(data);
	}
	
	

}
