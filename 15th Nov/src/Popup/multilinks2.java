package Popup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multilinks2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
     WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.instagram.com/accounts/login/");
	Thread.sleep(2000);
	
	 List<WebElement> list = driver.findElements(By.xpath("//a"));
	 System.out.println(list.size());
	 
	 for(int i= 0; i<list.size(); i++) {
		 System.out.println(list.get(i).getText()+":"+list.get(i).getAttribute("href"));
	 }

}
}