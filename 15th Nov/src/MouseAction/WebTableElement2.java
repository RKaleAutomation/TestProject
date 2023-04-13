package MouseAction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableElement2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_intro.asp");
		Thread.sleep(2000);
		
		List<WebElement> Row = driver.findElements(By.xpath("(//table[@class='ws-table-all notranslate'])[1]//tr"));
		
		//System.out.println(Row.size());
		for(int i=1; i<Row.size(); i++) {
	List<WebElement> Cells = driver.findElements(By.xpath("(//table[@class='ws-table-all notranslate'])[1]//tr[\"+(i+1)+\"]//td"));
	
	//System.out.println(Cells.size());
	
	   for(int j=0; j<Cells.size(); j++) {
		   System.out.println(Cells.get(j).getText()+" ");
	   }
	   System.out.println();
	}
	}
}
