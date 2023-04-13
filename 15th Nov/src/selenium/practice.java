package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.khanacademy.org/profile/me/courses");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class=\"empty-field  pure-hidden-xs\"]"));
		
		
		
	}
}
