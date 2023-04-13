package Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFramebasic {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		WebDriver driver = new ChromeDriver();  //upcasting
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//driver.findElement(By.xpath("//button[@type='button']")).click();
		WebElement iframe =driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
	driver.switchTo().frame(iframe); //changed selenium focus main page to iframe
	
	driver.findElement(By.xpath("//button[@type='button']")).click();
	
	//driver.switchTo().defaultContent();  //selenium focused changed to Main page
	
	driver.switchTo().parentFrame();
	
	driver.findElement(By.xpath("//a[@id='tryhome']")).click();
	}

}
