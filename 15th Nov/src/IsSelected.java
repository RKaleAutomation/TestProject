import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver=new ChromeDriver();    //upcasting
		
		driver.get("https://www.facebook.com/reg/");
		WebElement male=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		
		male.click();
		
		boolean result =male.isSelected();
		System.out.println(result);     
		if(result=true) {
			System.out.println(" Given element is selected");
		}
		else {
			System.out.println("element is not selected");
		}
	}
}
