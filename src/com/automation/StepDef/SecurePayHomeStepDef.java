package com.automation.StepDef;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import com.automation.Utilities.PropertyFileReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.automation.PageObject.securePayHomePage;

public class SecurePayHomeStepDef {

	public WebDriver driver ; 
    PropertyFileReader obj = new PropertyFileReader();
    
    @Given("^I open chrome browser and navigate to securepay$")
	public void i_open_chrome_browser_and_navigate_to_securepay() throws Throwable {
		Properties property = obj.getProperty();
   	    System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
   	    driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(property.getProperty("browser.securepayURL"));
	}
	
	@When("^I click support link in menu$")
	public void I_click_support_link_in_menu() throws Throwable {
		securePayHomePage.supportMenuLink(driver).click();
		System.out.println("support link clicked");
	}
	
	@Then("^I click Contact Us link$")
	public void I_click_Contact_Us_link() throws Throwable {
		securePayHomePage.contactUslink(driver).click();
		System.out.println("clicked on contact us link");
	}
}