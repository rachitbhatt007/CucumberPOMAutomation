package Testcases;



import Pages.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.After;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
        glue={"stepdefinition"},monochrome = true,dryRun = false ,
        plugin ={"pretty","junit:target/JUnitReports/report.xml"} )
public class Testrunner {

}



