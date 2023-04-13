package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintSinglrRow {
	

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		FileInputStream data = new FileInputStream("C:\\Users\\Ragini kale\\Desktop\\Book2.xlsx");
		
  Sheet	 sheet1 =	WorkbookFactory.create(data).getSheet("Sheet1");
	
	short cellsize = sheet1.getRow(0).getFirstCellNum();
	System.out.println(cellsize);
	
	for(int i =0; i<cellsize; i++) {
		String Data = sheet1.getRow(0).getCell(i).getStringCellValue();
		
		System.out.println(" "+ Data);
	}
	}

}
