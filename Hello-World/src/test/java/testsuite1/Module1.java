package testsuite1;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Module1 {
	
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("This line is executed Before each Suite");
		
	}
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("This line is executed Before each Test");
	}

	@BeforeClass
	public void BeforeClass() {
		System.out.println("This line is executed Before each Class");
	}
	
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("This line is executed before each method");
	}
	
	@BeforeGroups
	public void BeforeGroups() {
		System.out.println("This line is executed before each Group");
	}
	
	@Test (groups = {"Sanity"})
	public void Testcase01() {
		System.out.println("This line is printed from the method Tescase01");
		Reporter.log("This line is executed from testcase01");
	}
	
	@Test  (groups = {"Sanity"})
	public void Testcase02() {
		System.out.println("This line is printed from the method Tescase02");
		Reporter.log("This line is executed from testcase02");
	}
	
	@Test	(groups = {"Functional" , "Sanity"})
	public void Testcase03() {
		System.out.println("This line is printed from the method Tescase03");
		Reporter.log("This line is executed from testcase03");
	}
	
	@Test  (groups = {"Functional" , "Sanity"})
	@Parameters("NAME")
	public void parameterexample(String Studentname) {
		System.out.println("The Name of the student is : " +Studentname);
	}
	
	@DataProvider
	public Object[][] datamodule1() {
		
		Object[][] data = {{"sindhu","sssss"},{"Velu","vvvvv"}};
		return data;
				
	}
	
	@Test (dataProvider = "datamodule1")
	public void loginmodule1(String name,String pwd) {
		
		System.out.println(name +" and "+ pwd );
	}
	
	@AfterGroups
	public void AfterGroups() {
		System.out.println("This line is executed After each Group");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("This line is executed After each method");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("This line is executed After each Class");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("This line is executed After each Test");
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("This line is executed After each Suite");
	}
}
