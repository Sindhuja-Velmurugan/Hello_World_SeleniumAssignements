package day_07;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class PageObjectModelforTechlistic {
	
	
	public static WebDriver chromedriver = new ChromeDriver();
	String URL = "https://www.techlistic.com/p/selenium-practice-form.html";
	
	By firstname = By.name("firstname");
	By lastname = By.name("lastname");
	By gender = By.id("sex-1");
	By yrofexp = By.id("exp-4");
	By date = By.id("datepicker");
	By profession = By.id("profession-1");
	By automtools = By.id("tool-2");
	By continents = By.xpath("//select[@class='input-xlarge']/option[text()='North America']");
	By Selcmd = By.xpath("//select[@class='input-xlarge']/option[text()='WebElement Commands']");
	
	@Test
	public void submit()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Hello-World\\src\\test\\resources\\Drivers\\chromedriver.exe");
		ChromeOptions Co = new ChromeOptions();
		Co.setAcceptInsecureCerts(true);
		chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		chromedriver.manage().window().maximize();
		chromedriver.get(URL);
		chromedriver.findElement(firstname).sendKeys("Sindhuja");
		chromedriver.findElement(lastname).sendKeys("Velmurugan");
		chromedriver.findElement(gender).click();
		chromedriver.findElement(yrofexp).click();
		chromedriver.findElement(date).sendKeys("02/01/2023");
		chromedriver.findElement(profession).click();
		chromedriver.findElement(automtools).click();
		chromedriver.findElement(continents).click();
		chromedriver.findElement(Selcmd).click();
	}
	
  public static void main(String[] args) {

	  PageObjectModelforTechlistic pom = new PageObjectModelforTechlistic();
	  pom.submit();
}
}
