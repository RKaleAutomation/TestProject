import java.io.File;
import java.io.IOException;
import java.sql.Date;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class BasicScreen {
	


	public static void main(String[] args) throws IOException {
		//System.setProperty("Webdriver.chrome.driver","C:\\Users\\Ragini kale\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		System.setProperty("webdriver.http.factory", "jdk-http-client");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/reg/");
	File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	File destination = new File("C:\\Users\\Ragini kale\\Desktop\\ScreenShot\\ScreenBasic.jpg");
	
	FileHandler.copy(source, destination);
	
	
	}
}
	//take a screenshot
	
	
	//for(int i=1; i<=10; i++){
		//File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	////	String random = RandomString.make(2);
		//File destination = new File("C:\\Users\\Ragini kale\\Desktop\\ScreenShot\\Test123"+random+".jpg");
		
	//	FileHandler.copy(source, destination); 
		
	
	
	
	
	
	
	
	