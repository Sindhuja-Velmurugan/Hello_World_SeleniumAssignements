package day_09;

import java.time.Duration;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Juice_Shop_Testcase {
	
	//Program to execute the test cases for Juice shop
	
	public static WebDriver chromedriver = new ChromeDriver();
	String URL = "https://juice-shop.herokuapp.com/#/register";
	
	static String rdcountry;
	static int rdmobile;
	static String mob;
	static String nam;
	static int zipcode;
	static String zip;
	static String addr;
	static String cit;
	static String stat;
	String err;
	
	By dismissBtn = By.xpath("//button//span[text()='Dismiss']");
	By emailID = By.id("emailControl");
	By passwordTxt = By.id("passwordControl");
	By confirmPassword = By.id("repeatPasswordControl");
	By secQnBox = By.xpath("//div[@id='mat-select-value-1']/span");
	By secQn = By.xpath("//mat-option[2]/span");
	By secQnAns = By.id("securityAnswerControl");
	By coockiedismiss = By.xpath("//a[text()='Me want it!']");
	By registerbtn = By.id("registerButton");
	By loginemail = By.id("email");
	By loginpwd = By.id("password");
	By loginbtn = By.id("loginButton");
	By item1 = By.xpath("//div[text()=' Fruit Press ']/../../../div[2]//span[text()='Add to Basket']");
	By nxtpg = By.xpath("//div[@class='mat-paginator-range-actions']/button[2]/span[1]");
	By item2 = By.xpath("//div[text()=' OWASP Juice Shop Sticker Page ']/../../../div[2]//span[text()='Add to Basket']");
	By yrbasket = By.xpath("//button[@aria-label='Show the shopping cart']");
	By plusbtn1 = By.xpath("//mat-row[@class='mat-row cdk-row ng-star-inserted'][1]//button[2]");
	By plusbtn2 = By.xpath("//mat-row[@class='mat-row cdk-row ng-star-inserted'][2]//button[2]");
	By checkout = By.id("checkoutButton");
	By newaddress = By.xpath("//button[@aria-label='Add a new address']");
	By country = By.id("mat-input-7");
	By name = By.id("mat-input-8");
	By mobile = By.id("mat-input-9");
	By zipcd = By.id("mat-input-10");
	By Address = By.id("address");
	By city = By.id("mat-input-12");
	By state = By.id("mat-input-13");
	By submitbtn = By.id("submitButton");
	By radiobtn = By.xpath("//mat-radio-button[@class='mat-radio-button mat-accent']//input");
	By continuebtn = By.xpath("//button[@aria-label='Proceed to payment selection']");
	By deliverysp = By.id("mat-radio-41-input");
	By continue1 = By.xpath("//button[@aria-label='Proceed to delivery method selection']");
	By card = By.id("mat-expansion-panel-header-0");
	By cardname = By.xpath("//input[@id='mat-input-14']");
	By Cardno = By.xpath("//input[@id='mat-input-15']");
	By expmonth = By.xpath("//select[@id='mat-input-16']/option[@value='2']");
	By expyear = By.xpath("//select[@id='mat-input-17']/option[@value='2083']");
	By submitbtn2 = By.id("submitButton");
	By couponexp = By.id("mat-expansion-panel-header-1");
	By coupon = By.id("coupon");
	By redeembtn = By.id("applyCouponButton");
	By error1 = By.xpath("//div[text()='Invalid coupon. ']");
	By selectcard = By.id("mat-radio-44");
	By continue2 = By.xpath("//button[@aria-label='Proceed to review']");
	By placeorder = By.id("checkoutButton");
	By account = By.id("navbarAccount");
	By order = By.xpath("//button[@aria-label='Show Orders and Payment Menu']");
	By orderhis = By.xpath("//button[@aria-label='Go to order history page']");
	By print = By.xpath("//div[@class='heading']//button[@aria-label='Print order confirmation']");
	By track = By.xpath("//div[@class='heading']//button[@aria-label='Track Your Order']");
	By logout = By.id("navbarLogoutButton");
	
	
	
	public void register() throws InterruptedException {
		
		Actions act = new Actions(chromedriver);
		chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		chromedriver.manage().window().maximize();
		chromedriver.get(URL);
		chromedriver.findElement(dismissBtn).click();
		chromedriver.findElement(emailID).sendKeys("sindhuja1@vv.com");
		chromedriver.findElement(passwordTxt).sendKeys("sssss");
		chromedriver.findElement(confirmPassword).sendKeys("sssss");
		chromedriver.findElement(secQnBox).click();
		chromedriver.findElement(secQn).click();
		chromedriver.findElement(secQnAns).sendKeys("vvv");
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		chromedriver.findElement(coockiedismiss).click();
		WebElement registerbton = chromedriver.findElement(By.id("registerButton"));
		JavascriptExecutor js = (JavascriptExecutor) chromedriver;
		js.executeScript("arguments[0].click();", registerbton);
		chromedriver.findElement(loginemail).sendKeys("sindhuja1@vv.com");
		chromedriver.findElement(loginpwd).sendKeys("sssss");
		chromedriver.findElement(loginbtn).click();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		chromedriver.findElement(item1).click();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		WebElement nextpage = chromedriver.findElement(By.xpath("//div[@class='mat-paginator-range-actions']/button[2]/span[1]"));
		js.executeScript("arguments[0].click();", nextpage);
		WebElement itemno2 = chromedriver.findElement(By.xpath("//div[text()=' OWASP Juice Shop Sticker Page ']/../../../div[2]//span[text()='Add to Basket']"));
		js.executeScript("arguments[0].click();", itemno2);		
		chromedriver.findElement(yrbasket).click();
		chromedriver.findElement(plusbtn1).click();
		act.sendKeys(Keys.ENTER).build().perform();
		chromedriver.findElement(plusbtn2).click();
		act.sendKeys(Keys.ENTER).build().perform();		
		chromedriver.findElement(checkout).click();
		chromedriver.findElement(newaddress).click();
		random();
		chromedriver.findElement(country).sendKeys(rdcountry);
		chromedriver.findElement(name).sendKeys(nam);
		chromedriver.findElement(mobile).sendKeys(mob);
		chromedriver.findElement(zipcd).sendKeys(zip);
		chromedriver.findElement(Address).sendKeys(addr);
		chromedriver.findElement(city).sendKeys(cit);
		chromedriver.findElement(state).sendKeys(stat);
		WebElement submitbton = chromedriver.findElement(By.id("submitButton"));
		js.executeScript("arguments[0].click();", submitbton);		
		WebElement radio = chromedriver.findElement(By.xpath("//mat-radio-button[@class='mat-radio-button mat-accent']//input"));
		act.moveToElement(radio).click().build().perform();
		chromedriver.findElement(continuebtn).click();
		WebElement delivery = chromedriver.findElement(By.id("mat-radio-41-input"));
		act.moveToElement(delivery).click().build().perform();
		chromedriver.findElement(continue1).click();
		chromedriver.findElement(card).click();
		chromedriver.findElement(cardname).sendKeys("qqqqq");
		chromedriver.findElement(Cardno).sendKeys("1234567890123456");
		chromedriver.findElement(expmonth).click();
		chromedriver.findElement(expyear).click();
		chromedriver.findElement(submitbtn2).click();
		chromedriver.findElement(card).click();
		WebElement couponexpd = chromedriver.findElement(By.xpath("//mat-expansion-panel[@id='collapseCouponElement']/mat-expansion-panel-header"));
		js.executeScript("arguments[0].click();", couponexpd);	
		WebElement couponn = chromedriver.findElement(By.id("coupon"));
		js.executeScript("arguments[0].click();", couponn);	
		chromedriver.findElement(coupon).sendKeys("3216549872");
		chromedriver.findElement(redeembtn).click();
		err = chromedriver.findElement(error1).getText();
		if (err.contains("Invalid")) {

			System.out.println("Invalid coupon message verified");
		} else {
			System.out.println("Coupon Message not verified");
		}
		chromedriver.findElement(couponexp).click();
		chromedriver.findElement(selectcard).click();
		WebElement continu2 = chromedriver.findElement(By.xpath("//button[@aria-label='Proceed to review']"));
		js.executeScript("arguments[0].click();", continu2);	
		chromedriver.findElement(placeorder).click();
		chromedriver.findElement(account).click();
		chromedriver.findElement(order).click();
		chromedriver.findElement(orderhis).click();
		chromedriver.findElement(print).click();
	    Set<String> handles = chromedriver.getWindowHandles();
	    
	    for (String newwindow1 : handles) {
	    	
	    	chromedriver.switchTo().window(newwindow1);
	    } 
	    chromedriver.close();
	    Set<String> handles1 = chromedriver.getWindowHandles();
	    
	    for (String newwindow2 : handles1) {
	    	
	    	chromedriver.switchTo().window(newwindow2);
	    } 
		chromedriver.findElement(track).click();
		chromedriver.findElement(account).click();
		chromedriver.findElement(logout).click();
		
		
	}
	
	public static void random() {
		
		Random rd = new Random();
		rdcountry = UUID.randomUUID().toString();
		rdcountry = rdcountry.substring(0,Math.min(rdcountry.length(),10));
		nam = UUID.randomUUID().toString();
		nam = nam.substring(0,Math.min(nam.length(),8));
		rdmobile = rd.nextInt(100000000);
		mob = String.format("%d", rdmobile);
		zipcode = rd.nextInt(100000);
		zip = String.format("%d", zipcode);
		addr = UUID.randomUUID().toString();
		addr = addr.substring(0,Math.min(addr.length(),20));
		cit = UUID.randomUUID().toString();
		cit = cit.substring(0,Math.min(cit.length(),6));
		stat = UUID.randomUUID().toString();
		stat = stat.substring(0,Math.min(stat.length(),6));

			
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Juice_Shop_Testcase js = new Juice_Shop_Testcase();
		js.register();
	}

}
