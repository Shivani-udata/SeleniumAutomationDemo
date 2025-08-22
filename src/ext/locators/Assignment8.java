package ext.locators;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("ind");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List <WebElement> suggestiveList = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		
		
		for(WebElement suggested : suggestiveList) {
			if(suggested.getText().equalsIgnoreCase("INDIA")) {
				suggested.click();
				break;
			}
		}


	}

}
