import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver=new ChromeDriver();   // upcasting
		
		driver.get("https://www.facebook.com/reg/");
		
		//WebElement cutomGen=driver.findElement(By.xpath("//input[@name='custom_gender']"));
     
		//cutomGen.click(); //is not require display prog.
		
	//boolean result=cutomGen.isDisplayed();   //result is false
	
	//System.out.println(result);
		
		WebElement text= driver.findElement(By.xpath("//div[@class='_8fgl _9l2p']"));
		 //(this method is all sign up page displayed)
		
		
		String result=text.getText();
		System.out.println(result);
	}
}
