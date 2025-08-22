package ext.locators;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators {
	public static void main(String args[]) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "Users/ShivaniUdata/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//redireting to website and tryiing to log in by entering username , password & clicking fon sing in button
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Shivani");
		driver.findElement(By.name("inputPassword")).sendKeys("abc123");
		driver.findElement(By.className("signInBtn")).click();
		
		//printing the text of error & clicking on forget password 
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//filling details & clicking on reset button
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("john");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("john@rms.com");
		//driver.findElement(By.cssSelector("input[type='text']:nth-child(5)")).sendKeys("983465");		
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("983465");		
		driver.findElement(By.className("reset-pwd-btn")).click();
		Thread.sleep(1000);
		
		//printing the text shown
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		//go to login
		driver.findElement(By.xpath("//button[normalize-space()='Go to Login']")).click();
		 String password = getPassword(driver);
		//entering username & password and trying to log in 
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("shivani");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		
		
		//using assert for compare expected and actual output by selenium.
		
		System.out.println(driver.findElement(By.tagName("p")).getText());
	    Assert.assertEquals("driver.findElement(By.tagName(\"p\")).getText()","You are successfully logged in.");
		
		
	}
	
	
	
	public static String getPassword(WebDriver driver) throws InterruptedException{

	driver.get("https://rahulshettyacademy.com/locatorspractice/");

	driver.findElement(By.linkText("Forgot your password?")).click();

	Thread.sleep(1000);

	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

	String passwordText =driver.findElement(By.cssSelector("form p")).getText();

	//Please use temporary password 'rahulshettyacademy' to Login.

	String[] passwordArray = passwordText.split("'");

	// String[] passwordArray2 = passwordArray[1].split("'");

	// passwordArray2[0]

	String password = passwordArray[1].split("'")[0];

	return password;

	//0th index - Please use temporary password

	//1st index - rahulshettyacademy' to Login.



	//0th index - rahulshettyacademy

	//1st index - to Login.





	}



}
