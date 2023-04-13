package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dismiss {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
		
		Thread.sleep(2000);
		
		Alert Alt = driver.switchTo().alert();
		Alt.sendKeys("No");
		
		Thread.sleep(2000);
		
		Alt.accept();
		
		
		
	}

}
