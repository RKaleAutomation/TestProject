package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LastRowNo {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		FileInputStream Row =new FileInputStream("C:\\Users\\Ragini kale\\Desktop\\Book2.xlsx");
		
		int lastrow = WorkbookFactory .create(Row).getSheet("Sheet1").getLastRowNum(); 
		
		System.out.println(lastrow+1);
		
		
		
	}

}
