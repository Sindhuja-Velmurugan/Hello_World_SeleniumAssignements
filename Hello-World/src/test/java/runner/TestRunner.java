package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

//@RunWith(Cucumber.class) //Junit execution

@CucumberOptions(
		plugin = {"pretty", "html:target/sindhu.html"}, //reporting purpose
		monochrome=false,  //console output
		tags = "@TS_001", //tags from feature file
		features = {"C:\\Users\\User\\eclipse-workspace\\Hello-World\\src\\test\\resources\\features"}, //location of feature files
		glue= "stepdefinition") //location of step definition files


public class TestRunner extends AbstractTestNGCucumberTests{
	
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
				
		return super.scenarios();
    }

}