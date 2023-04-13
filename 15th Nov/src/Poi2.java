import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Poi2 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		FileInputStream file = new FileInputStream("C:\\Users\\Ragini kale\\Desktop\\1.xlsx");
		
		double data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
		
		System.out.println(data);
	}

}
