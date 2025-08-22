package ext.locators;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Countoflinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println("Count of links in whole context "+driver.findElements(By.tagName("a")).size());
		
		//creating webelemnt for specific block 
		WebElement footerDriver = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		
		System.out.println("Count of links in footer block "+footerDriver.findElements(By.tagName("a")).size());
		
		//creating webelemnt for specific column 
		WebElement columnDriver = footerDriver.findElement(By.xpath("//tbody/tr/td[1]/ul[1]"));
		
		System.out.println("count of links on 1st column "+columnDriver.findElements(By.tagName("a")).size());
		
		//clicking on each link of column 
		for(int i=1;i<columnDriver.findElements(By.tagName("a")).size();i++) {
			
			String clickLinkTab=Keys.chord(Keys.CONTROL, Keys.ENTER);
			
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickLinkTab);
			Thread.sleep(2000);
			
		}
			//opening all tabs & priting title of each tabs
			Set<String> windows = driver.getWindowHandles();
			Iterator<String> it = windows.iterator();
			while(it.hasNext()) {
				
				driver.switchTo().window(it.next());
				System.out.println("Title of child windows "+driver.getTitle());
			}
		
		

	}

}
