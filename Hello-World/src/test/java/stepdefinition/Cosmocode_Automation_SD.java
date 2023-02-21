package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cosmocode_Automation_SD {
	
	public static WebDriver chromedriver = new ChromeDriver();
	String URL = "https://cosmocode.io/automation-practice/";
	
	By firstname = By.id("firstname");
	By Lastname = By.className("lastname");
	By Gender = By.xpath("//input[@value='Female']");
	By newwindow = By.linkText("Click Me to open New Window");
	
	@Given("I want to open the web page and maximize it")
	public void i_want_to_open_the_web_page_and_maximize_it() {
		chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		chromedriver.manage().window().maximize();
		chromedriver.get(URL);
	}

	@Given("I want to enter the details")
	public void i_want_to_enter_the_details() {
		chromedriver.findElement(firstname).sendKeys("Sindhuja");
		chromedriver.findElement(Lastname).sendKeys("Velmurugan");
	}

	@When("I want to enter the all the inputs")
	public void i_want_to_enter_the_all_the_inputs() {
		chromedriver.findElement(Gender).click();
		//chromedriver.findElement(newwindow).click();
	}

	@Then("I close the browser")
	public void i_close_the_browser() {
	    //chromedriver.quit();
	}

}
