package ext.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigmnet6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	    driver.findElement(By.xpath("//input[@value='option2']")).click();
	    WebElement e = driver.findElement(By.xpath("//input[@value='option2']"));
		String value= e.getAttribute("value");
		
		driver.findElement(By.xpath("//body//div//div//fieldset//select")).click();
		
		
		

	}

}
