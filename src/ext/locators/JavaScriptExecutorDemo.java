package ext.locators;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		js.executeScript("window.scrollBy(0,700)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		
		List <WebElement> amount = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int sum=0;
		
		for(int i=0;i<amount.size();i++) {
			
			System.out.println(Integer.parseInt(amount.get(i).getText()));
			sum= sum +Integer.parseInt(amount.get(i).getText());
			
			
			
		}
		System.out.println("Sum is "+sum);
		
		String count = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim();
		//Integer.parseInt(count);
		Assert.assertEquals(sum, Integer.parseInt(count));
		
		
		//Assignment 7
		System.out.println("Total Rows are "+driver.findElements(By.xpath("(//table[@id='product'])[1]/tbody/tr")).size());
		System.out.println("Total Coulmns are "+driver.findElements(By.xpath("(//table[@id='product'])[1]/tbody/tr/th")).size());
		
		List <WebElement> data = driver.findElements(By.xpath("(//table[@id='product'])[1]/tbody/tr[3]"));
		Iterator<WebElement> it = data.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getText());
		}
		
		

	}

}
