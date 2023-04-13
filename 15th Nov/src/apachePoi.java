
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class apachePoi {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		FileInputStream file = new FileInputStream("C:\\Users\\Ragini kale\\Desktop.xlsx");
		
		String data= WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
		
		System.out.println(data);
		
	
	}
}
