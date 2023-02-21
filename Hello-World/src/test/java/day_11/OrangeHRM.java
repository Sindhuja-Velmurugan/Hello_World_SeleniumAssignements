package day_11;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRM {
	
	//Program to excute the tescase for the web browser Orange HRM
	
	public static WebDriver chromedriver = new ChromeDriver();
	JavascriptExecutor js = (JavascriptExecutor) chromedriver;
	String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	By username = By.name("username");
	By password = By.name("password");
	By loginbt = By.xpath("//button[@type='submit']");
	By myinfo = By.xpath("//span[text()='My Info']");
	By contactdetails = By.linkText("Contact Details");
	By street1 = By.xpath("//label[text()='Street 1']/../../div[2]/input");
	By street2 = By.xpath("//label[text()='Street 2']/../../div[2]/input");
	By city = By.xpath("//label[text()='City']/../../div[2]/input");
	By state = By.xpath("//label[text()='State/Province']/../../div[2]/input");
	By zipcode =  By.xpath("//label[text()='Zip/Postal Code']/../../div[2]/input");
	By countryclick = By.xpath("//div[text()='-- Select --']");
	By countryselect = By.xpath("//div[@role='option']/span[text()='United States']");
	By homeph = By.xpath("//label[text()='Home']/../../div[2]/input");
	By mobileph = By.xpath("//label[text()='Mobile']/../../div[2]/input");
	By workph = By.xpath("//label[text()='Work']/../../div[2]/input");
	By workemail = By.xpath("//label[text()='Work Email']/../../div[2]/input");
	By otheremail = By.xpath("//label[text()='Other Email']/../../div[2]/input");
	By savebtn = By.xpath("//button[@type='submit']");
	By emergencycontact = By.linkText("Emergency Contacts");
	By addbtn = By.xpath("//div[@class='orangehrm-edit-employee-content']/div[1]//button");
	By name = By.xpath("//label[text()='Name']/../../div[2]/input");
	By relation = By.xpath("//label[text()='Relationship']/../../div[2]/input");
	By mobile = By.xpath("//label[text()='Mobile']/../../div[2]/input");
	By dependents = By.linkText("Dependents");
	By dependentrelation = By.xpath("//div[@role='option']/span[text()='Child']");
	By dob = By.xpath("//label[text()='Date of Birth']/../../div[2]//input");
	By recruitbtn = By.xpath("//span[text()='Recruitment']");
	By addcandidbtn = By.xpath("//div[@class='orangehrm-header-container']/button");
	By firstname = By.name("firstName");
	By middlename = By.name("middleName");
	By lastname = By.name("lastName");
	By vacancyselect = By.xpath("//div[text()='-- Select --']");
	By vaccancy = By.xpath("//div/span[text()='Software Engineer']");
	By candemail = By.xpath("//label[text()='Email']/../../div[2]/input");
	By candcontactno = By.xpath("//label[text()='Contact Number']/../../div[2]/input");
	By dateofappln = By.xpath("//label[text()='Date of Application']/../../div[2]//input");
	By notes = By.xpath("//label[text()='Notes']/../../div[2]/textarea");
	By shorlistbtn = By.xpath("//button[text()=' Shortlist ']");
	By schdleintervbtn = By.xpath("//button[text()=' Schedule Interview ']");
	By interviewtitle = By.xpath("//label[text()='Interview Title']/../../div[2]/input");
	By interviewerclick = By.xpath("//label[text()='Interviewer']/../../div[2]//input"); 
	By interviewvalue = By.xpath("//div/span[text()='Peter Mac Anderson']"); //Cecil  Bonaparte
	By intervdate = By.xpath("//label[text()='Date']/../../div[2]//input");
	By intervtime = By.xpath("//label[text()='Time']/../../div[2]//input");
	By interhr = By.xpath("//input[@value='PM']");
	By intervpassbtn = By.xpath("//button[text()=' Mark Interview Passed ']");
	By offerjobbtn = By.xpath("//button[text()=' Offer Job ']");
	By hirebtn = By.xpath("//button[text()=' Hire ']");
	By candidname = By.xpath("//label[text()='Candidate Name']/../../div[2]//input");
	By Candidnameselect = By.xpath("//div/span[text()='Candidate4 C Sample']");
	By admintab = By.xpath("//span[text()='Admin']");
	By userroleclick = By.xpath("//label[text()='User Role']/../../div[2]/div/div/div[1]");
	By userroleselect = By.xpath("//div/span[text()='ESS']");
	By employeenameclick = By.xpath("//label[text()='Employee Name']/../../div[2]//input");
	By userstatusselect = By.xpath("//div/span[text()='Enabled']");
	By usrname = By.xpath("//label[text()='Username']/../../div[2]/input");
	By passwd = By.xpath("//label[text()='Password']/../../div[2]/input");
	By confirmpasswd = By.xpath("//label[text()='Confirm Password']/../../div[2]/input");
	By accountclick = By.xpath("//span[@class='oxd-userdropdown-tab']/p");
	By logout = By.linkText("Logout");
	
	
	public void Login() throws InterruptedException {
		
		Actions at = new Actions(chromedriver);
		chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		chromedriver.manage().window().maximize();
		chromedriver.get(URL);
		
		//login
		chromedriver.findElement(username).sendKeys("Admin");
		chromedriver.findElement(password).sendKeys("admin123");
		chromedriver.findElement(loginbt).click();
		chromedriver.findElement(myinfo).click();
		
	}
	
	public void ContactDetails() throws InterruptedException {
		
				
		chromedriver.findElement(contactdetails).click();
		
		//entering contact details
		Thread.sleep(1000);
		chromedriver.findElement(street1).sendKeys("Adams St");
		chromedriver.findElement(street2).sendKeys("Lowe Ave");
		chromedriver.findElement(city).sendKeys("Norfolk");
		chromedriver.findElement(state).sendKeys("Delaware");
		chromedriver.findElement(zipcode).sendKeys("203050");
		chromedriver.findElement(countryclick).click();
		chromedriver.findElement(countryselect).click();
		chromedriver.findElement(homeph).sendKeys("7894561230");
		chromedriver.findElement(mobileph).sendKeys("3216547893");
		chromedriver.findElement(workph).sendKeys("6548954725");
		chromedriver.findElement(workemail).sendKeys("admin@admin.com");
		chromedriver.findElement(otheremail).sendKeys("sample@sample.com");
		Thread.sleep(4000);
		chromedriver.findElement(savebtn).click();
		//WebElement save1 = chromedriver.findElement(By.xpath("//button[@type='submit']"));
		//js.executeScript("arguments[0].click();", save1);
		Thread.sleep(4000);
		
	}
	
	public void EmergencyContactDetails() {
		//Navigate to emergency contact
		
		chromedriver.findElement(emergencycontact).click();
		chromedriver.findElement(addbtn).click();
		chromedriver.findElement(name).sendKeys("Emergence Sample");
		chromedriver.findElement(relation).sendKeys("Friend");
		chromedriver.findElement(mobile).sendKeys("6547418521");
		chromedriver.findElement(savebtn).click();
		
}
	
	public void DependentDetails() {
		
		//Navigate to dependent details
		
		chromedriver.findElement(dependents).click();
		chromedriver.findElement(addbtn).click();
		chromedriver.findElement(name).sendKeys("Dependent1");
		chromedriver.findElement(countryclick).click();
		chromedriver.findElement(dependentrelation).click();
		chromedriver.findElement(dob).sendKeys("2010-02-12");
		chromedriver.findElement(savebtn).click();		
		
	}
	
	public void RecruitmentMenu() {
		
		//navigate to recruitment menu and add candidate
		
		chromedriver.findElement(recruitbtn).click();
		chromedriver.findElement(addcandidbtn).click();
		chromedriver.findElement(firstname).sendKeys("Candidate4");
		chromedriver.findElement(middlename).sendKeys("C");
		chromedriver.findElement(lastname).sendKeys("Sample");
		chromedriver.findElement(vacancyselect).click();
	    chromedriver.findElement(vaccancy).click();
		chromedriver.findElement(candemail).sendKeys("candidate@sample.com");
		chromedriver.findElement(candcontactno).sendKeys("3216547532");
		//chromedriver.findElement(dateofappln).sendKeys("2023-02-09");
		chromedriver.findElement(notes).sendKeys("College Fresher");
		chromedriver.findElement(savebtn).click();
		
		//Shorlist and schedule interview
		
		chromedriver.findElement(shorlistbtn).click();
		chromedriver.findElement(savebtn).click();
		chromedriver.findElement(schdleintervbtn).click();
		chromedriver.findElement(interviewtitle).sendKeys("Technical Round");
		chromedriver.findElement(interviewerclick).click();
		chromedriver.findElement(interviewerclick).sendKeys("c");
		chromedriver.findElement(interviewvalue).click();
		chromedriver.findElement(intervdate).sendKeys("2023-02-10");
		chromedriver.findElement(intervtime).click();
		chromedriver.findElement(interhr).click();
		chromedriver.findElement(intervtime).click();
		chromedriver.findElement(notes).sendKeys("Technical Round");
		chromedriver.findElement(savebtn).click();
		
		//Mark the interview passed and offer job
		
		chromedriver.findElement(intervpassbtn).click();
		chromedriver.findElement(notes).sendKeys("Interview Passed");
		chromedriver.findElement(savebtn).click();
		chromedriver.findElement(offerjobbtn).click();
		chromedriver.findElement(notes).sendKeys("Job Offered");
		chromedriver.findElement(savebtn).click();
		
		
		//Hire the candidate and print the candidate history
		
		chromedriver.findElement(hirebtn).click();
		chromedriver.findElement(notes).sendKeys("Candidate Hired");
		chromedriver.findElement(savebtn).click();
		int rows =  chromedriver.findElements(By.xpath("//div[@class='orangehrm-container']/div/div[2]/div")).size();
		int cols = chromedriver.findElements(By.xpath("//div[@class='orangehrm-container']/div/div[1]/div/div")).size();
		
		for(int row = 1; row<=rows; row++) {
			
			  String value = chromedriver.findElement(By.xpath("//div[@class='orangehrm-container']/div/div[2]/div["+row+"]/div[1]")).getText();
			  System.out.println(value);
			
		}
		
	    
	    //Navigate back to the Recruitment tab and search for the above candidate and verify the status 
		chromedriver.findElement(recruitbtn).click();
		chromedriver.findElement(candidname).click();
		chromedriver.findElement(candidname).sendKeys("Candidate4");
		chromedriver.findElement(Candidnameselect).click();
		chromedriver.findElement(savebtn).click();
		WebElement status = chromedriver.findElement(By.xpath("//div[text()='Hired']"));
		String st1 = status.getText();
		if(st1.contains("Hired")) {
			System.out.println("Status Verified");
		}
		else {
			System.out.println("Status not verifed");
		}
			
	}
	
	public void AdminTab() throws InterruptedException {
		
		//Navigate to the Admin tab and create a user with ESS role for the above employee 
		chromedriver.findElement(admintab).click();
		chromedriver.findElement(addcandidbtn).click();
		chromedriver.findElement(userroleclick).click();
		chromedriver.findElement(userroleselect).click();
		chromedriver.findElement(employeenameclick).click();
		chromedriver.findElement(employeenameclick).sendKeys("Candidate4");
		chromedriver.findElement(Candidnameselect).click();
		chromedriver.findElement(vacancyselect).click();
		chromedriver.findElement(userstatusselect).click();
		chromedriver.findElement(usrname).sendKeys("Candidateuser");
		chromedriver.findElement(passwd).sendKeys("Cand@1234");
		chromedriver.findElement(confirmpasswd).sendKeys("Cand@1234");
		Thread.sleep(1000);
		chromedriver.findElement(savebtn).click();
		Thread.sleep(1000);
		
		//Logout from the application and login with the above created username & password 
		chromedriver.findElement(accountclick).click();
		chromedriver.findElement(logout).click();
		chromedriver.findElement(username).sendKeys("Candidateuser");
		chromedriver.findElement(password).sendKeys("Cand@1234");
		chromedriver.findElement(loginbt).click();
		Thread.sleep(1000);
		chromedriver.findElement(accountclick).click();
		chromedriver.findElement(logout).click();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		OrangeHRM ohrm = new OrangeHRM();
		ohrm.Login();
		ohrm.ContactDetails();
		ohrm.EmergencyContactDetails();
		ohrm.DependentDetails();
		ohrm.RecruitmentMenu();
		ohrm.AdminTab();
		
	}

}
