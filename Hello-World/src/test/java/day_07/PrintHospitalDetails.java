package day_07;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrintHospitalDetails {
	
	//Program to print the hospital details for the selected zone area
	
	public static void PrintDetails() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Hello-World\\src\\test\\resources\\Drivers\\chromedriver.exe");
		ChromeOptions Co = new ChromeOptions();
		Co.setAcceptInsecureCerts(true);
		WebDriver chromedriver = new ChromeDriver(Co);
		chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		chromedriver.manage().window().maximize();
		chromedriver.get("https://westbengal.covidsafe.in/");
		
    	chromedriver.findElement(By.xpath("//div[@class='dropdown']")).click();
		
	
		WebElement dropdown = chromedriver.findElement(By.xpath("//div[@class='dropdown-menu show']/a[text()='Howrah']"));
		dropdown.click();
		
		System.out.println("*********************************************************************************************");
		String zone = chromedriver.findElement(By.xpath("//tbody/tr[1]/td[1]//span[1]")).getText();
		System.out.println("Zone : "+ zone);
		System.out.println("*********************************************************************************************");
		System.out.println("List of Hospitals in the zone '"+ zone+ "' are as follows,"); 
		int j =0;
		int tothosp = chromedriver.findElements(By.xpath("//tbody/tr")).size();
		
		for (int i = 1; i <= tothosp ; i++ ) {
			
			System.out.println("*********************************************************************************************");
			System.out.println("Hospital no : " +i);
			
			WebElement hosname = chromedriver.findElement(By.xpath("//tbody/tr[" + i + "]//strong"));
			String hn = hosname.getText();
			System.out.println("Name of the Hospital is : "+hn);
			
			String o2beds = chromedriver.findElement(By.xpath("//tbody/tr[" + i + "]/td[3]//span/span")).getText();
			System.out.println("O2 beds availability : "+ o2beds);
			int yeso2 = Integer.parseInt(o2beds);
			
			String o2nobeds = chromedriver.findElement(By.xpath("//tbody/tr[" + i + "]/td[2]/span/span")).getText();
			int noo2 = Integer.parseInt(o2nobeds);
						
			String ventbeds = chromedriver.findElement(By.xpath("//tbody/tr[" + i + "]/td[5]/span/span")).getText();
			System.out.println("Ventialtor(s) availability : " + ventbeds);
			int yesvent = Integer.parseInt(ventbeds);
			
			String noventbed = chromedriver.findElement(By.xpath("//tbody/tr[" + i + "]/td[4]/span/span")).getText();
			int novent = Integer.parseInt(noventbed);
			
			int totalbeds = yeso2 + noo2 + yesvent + novent ;
			
			System.out.println("Total Beds Availability : " +totalbeds);
			
			Thread.sleep(3000);
		
		    hosname.click();
			j= i + 1;
	        String phno = chromedriver.findElement(By.xpath("//tbody/tr[" + j + "]/td/p[2]//span")).getText();
			System.out.println(phno);
				
			String address = chromedriver.findElement(By.xpath("//tbody/tr[" + j + "]/td/p[4]//span")).getText();
			System.out.println(address);
			hosname.click();
			
			JavascriptExecutor je = (JavascriptExecutor) chromedriver;
			je.executeScript("window.scrollBy(0,120)");
		
		}
		
		System.out.println("*********************************************************************************************");
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		PrintDetails();
	}

}
