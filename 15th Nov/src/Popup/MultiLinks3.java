package Popup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiLinks3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		
		List<WebElement> sign = driver.findElements(By.xpath("//a"));
		
		System.out.println(sign.size());
		
		for(int i =0; i<sign.size(); i++) {
			System.out.println(sign.get(i).getText()+":"+sign.get(i).getAttribute("href"));
		}
		
	}

}
