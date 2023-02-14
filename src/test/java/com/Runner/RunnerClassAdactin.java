package com.Runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;
@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\PRIYABALA\\eclipse-workspace\\MavenProjectForTesting\\src\\test\\java\\com\\Feature\\Adactin.feature", 
glue = "com.StepDefinition",plugin = {"html:Reports/AdactinReport","pretty","json:Reports/jsonfile.json","com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html"})
public class RunnerClassAdactin {
	
	public static WebDriver driver;
	
@org.junit.BeforeClass
public static void setUp() {
WebDriverManager.chromedriver().setup();
 driver= new ChromeDriver();
driver.manage().window().maximize();

}
@org.junit.AfterClass
	public static void close() {
driver.quit();
	}
	

}
