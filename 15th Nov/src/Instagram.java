import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdiver.chrome.driver","C:\\Users\\Ragini kale\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("raginiskale7@gamil.com");
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("RK@96");
}
}