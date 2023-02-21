package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello_World {
	
	//Java program to open a given url in chrome browser
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Hello-World\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver(); 
		chromedriver.get("https://amazon.com");
		
	}

}
