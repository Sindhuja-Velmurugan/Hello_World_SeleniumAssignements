package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_Practice_Page {
	
	public void Test_Page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Hello-World\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		String oldwindow =chromedriver.getWindowHandle();	
		chromedriver.get("https://cosmocode.io/automation-practice/");
		chromedriver.findElement(By.linkText("Click here to reload this page")).click();
		chromedriver.findElement(By.id("firstname")).sendKeys("Sindhuja");
		chromedriver.findElement(By.className("lastname")).sendKeys("Velmurugan");
		WebElement female = chromedriver.findElement(By.xpath("//input[@value='Female']"));
		WebElement male = chromedriver.findElement(By.xpath("//input[@value='Male']"));
		WebElement StillExp = chromedriver.findElement(By.xpath("//input[@value='donotknow']"));
		StillExp.click();
		male.click();
		female.click();
		chromedriver.findElement(By.name("language_c#")).click();
		WebElement agedropdown = chromedriver.findElement(By.xpath("//select[@name='age']//option[text()='Under 40']"));
		//Select select1 = new Select(agedropdown);
		//select1.selectByValue("30 to 39");
		agedropdown.click();
		chromedriver.findElement(By.id("submit_htmlform")).click();
		//chromedriver.findElement(By.linkText("random-text-xyz-i-wont-change-random-digit-123")).click();
		chromedriver.findElement(By.linkText("Click Me to get Alert")).click();
		chromedriver.switchTo().alert().accept();
	    chromedriver.findElement(By.linkText("Click Me to open New Window")).click();
	    Set<String> handles = chromedriver.getWindowHandles();
	    
	    for (String newwindow1 : handles) {
	    	
	    	chromedriver.switchTo().window(newwindow1);
	    }
        
		//second window
		WebElement windowdropdown = chromedriver.findElement(By.id("list-second-window"));
		Select select2 = new Select(windowdropdown);
		select2.selectByValue("1");		
		chromedriver.findElement(By.linkText("Click Me To Open Third Window")).click();
		
	    Set<String> handles1 = chromedriver.getWindowHandles();
	    
	    for (String newwindow2 : handles1) {
	    	
	    	chromedriver.switchTo().window(newwindow2);
	    }
		
	    //third window
		WebElement windowdropdown1 = chromedriver.findElement(By.id("list-third-window"));
		Select select3 = new Select(windowdropdown1);
		select3.selectByValue("2");		
		 
		
				
	}
	
	public static void main(String[] args) {
		
		Automation_Practice_Page app = new Automation_Practice_Page();
		app.Test_Page();

	}

}
