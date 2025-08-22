package ext.locators;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("http://brillonadmin:brillonadmin@brillonconsumer.com/Windchill/app/#ptc1/homepage");
		
		//navigating to product -> create part
		driver.findElement(By.id("object_main_navigation_nav")).click();
		driver.findElement(By.className("x-tree-node-anchor")).click();
		driver.findElement(By.linkText("Folders")).click();
		
		 String originalHandle=driver.getWindowHandle();
		
		//creating part
		driver.findElement(By.xpath("(//button[@class=' x-btn-text blist'])[2]")).click();
		
		//handling part switching
		Set<String> handles = driver.getWindowHandles();
		 
		for (String handle : handles) {
		    if (!handle.equals(originalHandle)) {
		        driver.switchTo().window(handle);
		        break;
		    }
		}
		//Opening dropdown of soft types
		driver.findElement(By.xpath("//select[@class='required accessibleChange ']")).click();
		
		//selecting Formula Recipe from drop down
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@class='required accessibleChange ']"));
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByVisibleText("Formula Recipe");
		
		//driver.findElement(By.xpath("//select[@class='required accessibleChange ']")).click();
		
		//passing value for name of the part
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("testPartBySelenium2");
		
		
		driver.findElement((By.xpath("(//button[@type='button'])[4]"))).click();
		
		

	}

}
