package ext.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseInterations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(7000);
		WebElement move = driver.findElement(By.xpath("(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]"));
		
		//handling mouse interactions
		Actions a = new Actions(driver);
		
		a.moveToElement(move).build().perform();
		
		//writing keys in caps 
		
		a.moveToElement(driver.findElement(By.xpath("//input[@type='text']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();

	}

}
