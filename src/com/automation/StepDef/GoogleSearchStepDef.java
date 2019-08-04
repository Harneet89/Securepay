package com.automation.StepDef;

import java.util.Properties;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import com.automation.Utilities.PropertyFileReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import com.automation.PageObject.googleSearch;

public class GoogleSearchStepDef {

	public WebDriver driver ; 
    PropertyFileReader obj = new PropertyFileReader();
    
    @Given("^I open chrome browser$")
	public void i_open_chrome_browser() throws Throwable {
		Properties property = obj.getProperty();
   	    System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
   	    driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(property.getProperty("browser.baseURL"));
	}
	
	@And("^I searched Securepay in searchbar$")
	public void i_searched_Securepay_in_searchbar() throws Throwable {
		googleSearch.searchTextBox(driver).sendKeys("Securepay");
		System.out.println("Searching the text on search bar");
	}
	
	@When("^I press Enter key$")
	public void i_press_Enter_key() throws Throwable {
		googleSearch.searchTextBox(driver).sendKeys(Keys.ENTER);
		System.out.println("Press Enter key");
	}
	
	@Then("^I should see Securepay results$")
	public void i_should_see_Securepay_results() throws Throwable {
		googleSearch.linkName(driver);
		System.out.println("User should see results relate to Securepay");
	}
	
	@And("^I click on the First result to see the Securepay homepage$")
	public void i_click_on_the_First_result_to_see_the_Securepay_homepage() throws Throwable {
		googleSearch.firstResult(driver).click();
		System.out.println("User should able to click first link");
	}
	
}