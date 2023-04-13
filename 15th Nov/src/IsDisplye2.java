import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplye2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();    //upcasting
		
		driver.get("https://www.facebook.com/reg/");
		
		WebElement ele =driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]"));
		
		//(all syntax are same only change index of other attribute value )
		
		
		String attribute =ele.getAttribute("autocompelet");
		
		System.out.println(attribute);
	}

}
