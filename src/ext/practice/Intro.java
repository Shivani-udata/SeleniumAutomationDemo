package ext.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Users/ShivaniUdata/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://outlook.office.com/mail/");
		System.out.println("title is "+driver.getTitle());
		System.out.println("Current URL is "+driver.getCurrentUrl());
		driver.close();

	}

}
