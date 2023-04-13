package MouseAction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.khanacademy.org/");
		
		Thread.sleep(2000);
		
	//driver.manage().window().maximize();
		
		JavascriptExecutor scroll = (JavascriptExecutor)driver;
		
		scroll.executeScript("window.scrollBy(0,500)");  //scroll down
		Thread.sleep(2000);
		scroll.executeScript("window.scrollBy(0,-600)"); //scroll up
		Thread.sleep(2000);
		scroll.executeScript("window.scrollBy(3000,0)");  //scoll right
		Thread.sleep(2000);
		scroll.executeScript("window.scrollBy(-3000,0)");  //scoll left
		
	}
}
