package day_08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TutorialsNinja_TestCases_POM {

	// Program to solve the test case for Tutorials Ninja Shopping page

	public static WebDriver chromedriver = new ChromeDriver();
	String URL = "http://tutorialsninja.com/demo/index.php";
	String err;
	String success;
	String eco;
	String vatt;
	String err2;
	String mactext;
	String success2;

	By currency = By.xpath("//span[text()='Currency']");
	By currencydrop = By.xpath("//button[text()='€ Euro']");
	By cannon = By.xpath("//a[contains(text(),'Canon EOS 5D')]");
	By cannonaddcart = By.xpath("//div[@id='product']/div[2]//button");
	By error = By.xpath("//select[@id='input-option226']//option");
	By home = By.xpath("//i[@class='fa fa-home']");
	By iphone = By.xpath("//h4/a[text()='iPhone']");
	By qtytxtbox = By.id("input-quantity");
	By automtools = By.id("tool-2");
	By continents = By.xpath("//select[@class='input-xlarge']/option[text()='North America']");
	By Selcmd = By.xpath("//select[@class='input-xlarge']/option[text()='WebElement Commands']");
	By iphoneaddcart = By.xpath("//div[@id='product']/div[1]//button");
	By Successmsg1 = By.xpath("//div[@class='alert alert-success alert-dismissible']");
	By carticon = By.xpath("//div[@id='cart']//button[@data-toggle='dropdown']");
	By viewcart = By.xpath("//p[@class='text-right']//strong");
	By txtbox = By.xpath("//div[@class='input-group btn-block']/input");
	By updbtn = By.xpath("//button[@data-toggle='tooltip']/i");
	By Ecotax = By.xpath("//div[@class='col-sm-4 col-sm-offset-8']/table//tr[2]//td[2]");
	By vat = By.xpath("//div[@class='col-sm-4 col-sm-offset-8']/table//tr[3]//td[2]");
	By Chkout = By.xpath("//a[text()='Checkout']");
	By error2 = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	By remove = By.xpath("//button[@data-toggle='tooltip'][@type='button']");
	By home2 = By.xpath("//ul[@class='breadcrumb']/li[1]/a");
	By mac = By.xpath("//a[text()='MacBook']");
	By macaddcart = By.xpath("//div[@id='product']/div/button");
	By maxtxtbox = By.id("input-quantity");
	By shopcart = By.xpath("//a[@title='Shopping Cart']//span");
	By couponbttn = By.xpath("//div[@id='accordion']/div[1]//a");
	By coupontxt = By.id("input-coupon");
	By applycoup = By.id("button-coupon");
	By giftcertbtn = By.xpath("//div[@id='accordion']/div[2]//a");
	By giftcerttxt = By.id("input-voucher");
	By applygiftcert = By.id("button-voucher");
	By myaccdropdn = By.xpath("//div[@id='top-links']//li[2][@class='dropdown']//span[1]");
	By register = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[text()='Register']");
	By firstname = By.id("input-firstname");
	By lastname = By.id("input-lastname");
	By email = By.id("input-email");
	By Phno = By.id("input-telephone");
	By password = By.id("input-password");
	By confirmpsw = By.id("input-confirm");
	By newsletter = By.xpath("//label[@class='radio-inline']/input[@value='0']");
	By agree = By.name("agree");
	By continuebtn = By.xpath("//input[@class='btn btn-primary']");
	By contactus = By.linkText("Contact Us");
	By yourname = By.id("input-name");
	By enquiry = By.id("input-enquiry");
	By email2 = By.id("input-email");
	By continue1 = By.linkText("Continue");

	@Test
	public void submit() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\eclipse-workspace\\Hello-World\\src\\test\\resources\\Drivers\\chromedriver.exe");
		ChromeOptions Co = new ChromeOptions();
		Co.setAcceptInsecureCerts(true);
		chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		chromedriver.manage().window().maximize();
		chromedriver.get(URL);
		chromedriver.findElement(currency).click();
		chromedriver.findElement(currencydrop).click();
		chromedriver.findElement(cannon).click();
		chromedriver.findElement(cannonaddcart).click();
		err = chromedriver.findElement(error).getText();
		System.out.println("Error message due to bug in select option in Cannon : " + err);
		chromedriver.findElement(home).click();
		chromedriver.findElement(iphone).click();
		chromedriver.findElement(qtytxtbox).clear();
		chromedriver.findElement(qtytxtbox).sendKeys("2");
		Thread.sleep(2000);
		chromedriver.findElement(iphoneaddcart).click();
		success = chromedriver.findElement(Successmsg1).getText();
		System.out.println("Success Message After Iphone added to cart : " + success);
		chromedriver.findElement(carticon).click();
		chromedriver.findElement(viewcart).click();
		chromedriver.findElement(txtbox).clear();
		chromedriver.findElement(txtbox).sendKeys("3");
		chromedriver.findElement(updbtn).click();
		eco = chromedriver.findElement(Ecotax).getText();
		vatt = chromedriver.findElement(vat).getText();
		System.out.println("Eco Tax is : " + eco);
		System.out.println("VAT amt is : " + vatt);
		chromedriver.findElement(Chkout).click();
		err2 = chromedriver.findElement(error2).getText();
		System.out.println("Error Message aft Checkout : " + err2);
		chromedriver.findElement(remove).click();
		Thread.sleep(2000);
		chromedriver.navigate().to("http://tutorialsninja.com/demo/index.php?route=common/home");
		chromedriver.findElement(mac).click();
		mactext = chromedriver.findElement(maxtxtbox).getAttribute("value");
		if (mactext.equals("1")) {
			System.out.println("Macbook Quantity is 1 -- Verified");
			chromedriver.findElement(macaddcart).click();
			success2 = chromedriver.findElement(Successmsg1).getText();
		} 
		else {
			System.out.println("Macbook Quantity is not 1");
		}
		if (success2.contains("Success")) {

			System.out.println("Macbook Success message verified");
		} else {
			System.out.println("Macbook not success");
		}

		chromedriver.findElement(shopcart).click();
		chromedriver.findElement(couponbttn).click();
		chromedriver.findElement(coupontxt).sendKeys("ABCD123");
		chromedriver.findElement(applycoup).click();
		Thread.sleep(2000);
		err2 = chromedriver.findElement(error2).getText();
		System.out.println("Error Message aft applying coupon : " + err2);
		Thread.sleep(2000);
		chromedriver.findElement(giftcertbtn).click();
		chromedriver.findElement(giftcerttxt).sendKeys("AXDFGH123");
		chromedriver.findElement(applygiftcert).click();
		Thread.sleep(2000);
		err2 = chromedriver.findElement(error2).getText();
		System.out.println("Error Message aft applying gift certificate : " + err2);
		chromedriver.findElement(giftcerttxt).clear();
		chromedriver.findElement(couponbttn).click();
		chromedriver.findElement(coupontxt).clear();
		chromedriver.findElement(Chkout).click();
		chromedriver.findElement(myaccdropdn).click();
		chromedriver.findElement(register).click();
		chromedriver.findElement(firstname).sendKeys("Minnie1");
		chromedriver.findElement(lastname).sendKeys("Mouse1");
		chromedriver.findElement(email).sendKeys("minnie.mouse1@disney.com");
		chromedriver.findElement(Phno).sendKeys("123456789");
		chromedriver.findElement(password).sendKeys("micky");
		chromedriver.findElement(confirmpsw).sendKeys("micky");
		chromedriver.findElement(newsletter).click();
		chromedriver.findElement(agree).click();
		chromedriver.findElement(continuebtn).click();
		chromedriver.findElement(contactus).click();
		chromedriver.findElement(yourname).sendKeys("Minnie1");
		chromedriver.findElement(enquiry).sendKeys("I am getting error message.. Please do the needful");
		chromedriver.findElement(continuebtn).click();
		chromedriver.findElement(continue1).click();

		 
	}

	public static void main(String[] args) throws InterruptedException {

		TutorialsNinja_TestCases_POM TN = new TutorialsNinja_TestCases_POM();
		TN.submit();
	}

}
