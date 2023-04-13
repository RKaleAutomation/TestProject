package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name=\"promptalertbox1234\"]")).click();
		
		 Alert alt = driver.switchTo().alert();
		 alt.sendKeys("yes");
		 Thread.sleep(2000);
		 
		 alt.accept();
	}

}
