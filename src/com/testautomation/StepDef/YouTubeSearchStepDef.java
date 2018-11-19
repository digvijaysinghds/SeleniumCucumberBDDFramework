package com.testautomation.StepDef;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

import com.testautomation.Utility.PropertyFileReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class YouTubeSearchStepDef {
	
	public static WebDriver driver;
	PropertyFileReader obj = new PropertyFileReader();
	
	@Given("^Open chrome browser and enter url$")
	public void opne_chrome_browser_and_enter_url() throws Throwable{
		
		Properties properties = obj.getProperty(); 
		
		System.setProperty("webdrivrer.chrome.driver", System.getProperty("user.dir")+"/DriverExe/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(properties.getProperty("browser.baseurl"));
		//driver.get("https://");
		Thread.sleep(3000);
	}
	
	@When("^Enter search criteria$")
	public void enter_search_criteria() throws Throwable{
		driver.findElement(By.id("search")).sendKeys("Selenium automation");
		Thread.sleep(2000);
	}
	
	@Then("^Click on search button$")
	public void click_on_search_button() throws Throwable{
		driver.findElement(By.cssSelector("#search-icon-legacy")).click;
		Thread.sleep(3000);
	}
	
	

}
