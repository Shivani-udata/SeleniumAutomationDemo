package ext.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsExamples2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");


		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox'] ")).size());
	}

}
