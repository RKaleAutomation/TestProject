package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Customizedlistbox2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		WebElement more = driver.findElement(By.xpath("(//div[@class='_28p97w'])[2]"));
         Actions act = new Actions(driver);
        // act.contextClick(more).perform();
         act.moveToElement(more).perform();
         
         Thread.sleep(2000);
         //driver.get("https://www.flipkart.com/communication-preferences/push?t=all");
         WebElement helpC = driver.findElement(By.xpath("//div[text()='Advertise']"));
	act.click(helpC).perform();
         
	}
}


