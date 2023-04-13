import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ListMultiProg {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg/");
		
		WebElement  year = driver.findElement(By.xpath("//select[@title='Year']"));
		
		Select s = new Select (year);
		List<WebElement> option =s.getOptions();
		 
		int size = option.size();  //to get size of listbox / count all year
		System.out.println(size);
		
		//to print all options present in listbox
		for(int i=0; i<=option.size()-1; i++) {
			 System.out.println(option.get(i).getText());
		}
	}

}
