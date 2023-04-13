package Popup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multilinks4 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
	List<WebElement> flip = driver.findElements(By.xpath("//a"));
	
	System.out.println(flip.size());
	
	for(int i= 0; i<flip.size(); i++) {
		System.out.println(flip.get(i).getText()+":"+flip.get(i).getAttribute("href"));
	}
		
	
	}

}
