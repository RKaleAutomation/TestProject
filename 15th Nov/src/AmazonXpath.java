import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXpath {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdiver.chrome.driver","C:\\Users\\Ragini kale\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/ap/signin");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("7020857997");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@tabindex='5']")).click();
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ragini@*28");
		
		
		driver.findElement(By.xpath("//input[@tabindex='3']")).click();

}
}