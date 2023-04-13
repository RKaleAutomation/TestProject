import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selinium2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdiver.chrome.driver","C:\\Users\\Ragini kale\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.flipkart.com/");
		//Thread.sleep(4000);
      driver.navigate().to("https://www.flipkart.com/");   //rapeat url page
      Thread.sleep(4000);
      driver.navigate().back();   // back to browser  back only tab
      Thread.sleep(4000);
      driver.navigate().forward();     //  forward page
      Thread.sleep(4000);
      driver.navigate().refresh();
      Thread.sleep(4000);
      
     driver.manage().window().maximize();
     Thread.sleep(4000);
     driver.close();
}
}