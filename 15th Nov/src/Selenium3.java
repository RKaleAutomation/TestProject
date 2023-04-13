

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium3 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ragini kale\\Downloads\\chromedriver_win32\\Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		 driver.get("https://www.flipkart.com/");
		
		Dimension d= new Dimension(300,400);
				driver.manage().window().setSize(d);
				Thread.sleep(3000);
				
				Point p=new Point (100,400);
				driver.manage().window().setPosition(p);
				Thread.sleep(3000);
				//driver.quit();
				driver.close();
	}

}
