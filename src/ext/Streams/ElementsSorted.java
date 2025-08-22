package ext.Streams;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.google.common.base.StandardSystemProperty;

public class ElementsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//click on column 
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//capture all elements 
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
		
		//captures text of all webelement into new (original) list
		List<String> orginalList= elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort on the original list of step 3 -> sorted List
		
		List<String> sortedList = orginalList.stream().sorted().collect(Collectors.toList());
		
		//compare orginal list vs sorted list
		
		Assert.assertTrue(orginalList.equals(sortedList));
		
		System.out.println("Sorted and both List are same");
		
		
		//finding beans from list returing the price value of it 
		
		List<String> price= elementsList.stream().filter(s->s.getText().contains("Beans")).map(s->getVeggies(s)).collect(Collectors.toList());
		
		price.forEach(s->System.out.println(s));
		

	}

	private static String getVeggies(WebElement s) {
		// TODO Auto-generated method stub
		
		String prizevalue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return prizevalue ;
	}

}
