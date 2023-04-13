package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.http.factory", "jdk-http-client");
		
	System.setProperty("webdiver.chrome.driver","C:\\Users\\Ragini kale\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	Thread.sleep(3000);
    //driver.close();     //  current tab closer
   // driver.quit();       //current browser closed
	
	
	String title= driver.getTitle();
	//System.out.println("Stand");
	System.out.println(title);
	String exptitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	if(title.equalsIgnoreCase(exptitle)){
		System.out.println("Nevegate to valide page");
	}
	else {
		System.out.println("Nevigate invalide page");
	}
}
}