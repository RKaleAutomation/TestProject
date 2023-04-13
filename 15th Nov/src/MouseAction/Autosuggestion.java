package MouseAction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		  
	 driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("oneplus");
		Thread.sleep(2000);
		
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='aajZCb']"));
		//System.out.println(options.size());
		
	//	for(int i= 0; i<options.size();i++) {
		//	System.out.println(options.get(i).getText());
		
		
		for(WebElement Eachoptions : options) { //advance for loop 
			System.out.println(Eachoptions.getText());
			
			
			
		}
	}		
	

}
