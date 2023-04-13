import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg/");
		
		WebElement Month=driver.findElement(By.xpath("//select[@title='Month']"));
		
		Select s = new Select(Month);
		
		//s.selectByIndex(7);       // index throw output 0,1,2,3,4,5,6,7 
		
		//s.selectByValue("5");   //this method indicate the 5th month (may)
		
		//s.selectByVisibleText("Mar");   // write as it is given month in the listbox
		
		//System.out.println(s.getFirstSelectedOption().getText());
		 // this is indicate the  selected month shows
		
		//List<WebElement> allOptions = s.getOptions();  // output is all month 
		
		List<WebElement> allOptions =s.getAllSelectedOptions(); // only select month is output
		for(int i=0; i<=allOptions.size()-1; i++) {
			System.out.println(allOptions.get(i).getText());
		}
		
		
		
	}

}
