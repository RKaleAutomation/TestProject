package MouseAction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(2000);
		
		List<WebElement> noOfrow = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		// tr is row data of table
		
		//System.out.println(noOfrow.size()); //7
		for(int i=1; i<noOfrow.size();i++) {
		
		List<WebElement> noOfcell = driver.findElements(By.xpath("//table[@id='customers']//tr[\"+(i+1)+\"]//td"));
		//td is coloum data
		
		//System.out.println(noOfcell.size());   //18
		for(int cell = 0; cell<noOfcell.size(); cell++) {
			System.out.println(noOfcell.get(cell).getText()+" ");
		}
		
		System.out.println();
	}

}
}