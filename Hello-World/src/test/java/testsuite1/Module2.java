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

public class Module2 {
	
	@BeforeSuite
	public void BeforeSuite2() {
		System.out.println("This line is executed Before each Suite");
		
	}
	
	@BeforeTest
	public void BeforeTest2() {
		System.out.println("This line is executed Before each Test");
	}

	@BeforeClass
	public void BeforeClass2() {
		System.out.println("This line is executed Before each Class");
	}
	
	
	@BeforeMethod
	public void BeforeMethod2() {
		System.out.println("This line is executed before each method");
	}
	
	@BeforeGroups
	public void BeforeGroups2() {
		System.out.println("This line is executed before each Group");
	}
	
	@Test (groups = {"Functional" , "Sanity"})
	public void Testcase012() {
		System.out.println("This line is printed from the method Tescase012");
		Reporter.log("This line is executed from testcase01");
	}
	
	@Test (groups = {"Functional" , "Sanity"})
	public void Testcase022() {
		System.out.println("This line is printed from the method Tescase022");
		Reporter.log("This line is executed from testcase02");
	}
	
	@Test	(groups = {"Functional" , "Sanity"})
	public void Testcase032() {
		System.out.println("This line is printed from the method Tescase032");
		Reporter.log("This line is executed from testcase03");
	}
	
	@Test  (groups = {"Sanity"})
	@Parameters("NAME")
	public void parameterexample1(String Studentname2) {
		System.out.println("The Name of the student is : " +Studentname2);
	}
	
	
	@DataProvider
	public Object[][] datamodule2() {
		
		Object[][] data2 = {{"minnie","mmmmm"},{"micky","yyyyy"}};
		return data2;
				
	}
	
	@Test (dataProvider = "datamodule2")
	public void loginmodule2(String name2,String pwd2) {
		System.out.println(name2 +" and "+ pwd2 );
	}
	
	@AfterGroups
	public void AfterGroups2() {
		System.out.println("This line is executed After each Group");
	}
	
	@AfterMethod
	public void AfterMethod2() {
		System.out.println("This line is executed After each method");
	}
	
	@AfterClass
	public void AfterClass2() {
		System.out.println("This line is executed After each Class");
	}
	
	@AfterTest
	public void AfterTest2() {
		System.out.println("This line is executed After each Test");
	}
	
	@AfterSuite
	public void AfterSuite2() {
		System.out.println("This line is executed After each Suite");
	}

}
