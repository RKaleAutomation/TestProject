package Popup;




import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrow {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	
	       Set<String> id = driver.getWindowHandles(); //multiple window are handle in getwindow handle method
	       ArrayList<String>Al = new ArrayList<String>(id);
	        String CBadd = Al.get(1);
	        
	        driver.switchTo().window(CBadd);// Child tab window handle the web Element
	        
	       driver.findElement(By.xpath("(//span[text()='Appium'])[1]")).click();
	       Thread.sleep(2000);
	      
	       driver.switchTo().window(Al.get(1));
	       
	       driver.findElement(By.xpath("(//span[text()='Home'])[1]")).click();
	      
	       //driver.switchTo().window(CBadd);
	       
	      // driver.findElement(By.xpath("(//span[text()='More'])[1]")).click();
	       
		
		
	}
}
