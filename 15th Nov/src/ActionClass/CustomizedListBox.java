package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CustomizedListBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		Actions act = new Actions(driver) ;  // action method perform default space move to element
		//act.moveToElement(login).perform();
		
	//	Thread.sleep(2000);
		//WebElement orders = driver.findElement(By.xpath("//div[text()='Orders']"));
		//act.click(orders).perform();
		
	act.contextClick(login).perform();
	//act.contextClick(orders).perform();
		
	}

}