package Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFramebasic2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/default.asp");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@name='cnftComm']"));
		
		driver.switchTo().frame(frame);
		
		// driver.findElement(By.xpath("")).click();
		 
		 driver.switchTo().defaultContent();
		 
		 driver.findElement(By.xpath("(//a[@title='Home'])[1]")).click();
	}

}
