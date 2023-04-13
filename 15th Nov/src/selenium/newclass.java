

	package selenium;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class newclass {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdiver.chrome.driver","C:\\Users\\Ragini kale\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
 
	
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
	}


