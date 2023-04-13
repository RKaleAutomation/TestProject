import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2 {

	

	public static void main(String[] args) {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/reg/");
		 
		 WebElement  Month =driver.findElement(By.xpath("//select[@title='Month']"));
		 Select s =new  Select(Month);
		 
		 boolean result =s.isMultiple();
		 System.out.println(result);
		 
		 if(result ==true) {
			 System.out.println("The given listbox is multiselected");
		 }
		 else {
			 System.out.println("Listbox is single selected");
		 }
		 
	}
}
