package Popup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multilink {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/login/");
	
	Thread.sleep(2000);
	      List<WebElement> links = driver.findElements(By.xpath("//a"));
	       
	       System.out.println(links.size());
	       
	       for( int i=0; i<links.size();i++) {
	    	   System.out.println(links.get(i).getText()+":"+links.get(i).getAttribute("href"));
	    	   
	       }
	
	}

}
