package com.automation.StepDef;

import java.util.Properties;

import org.fluttercode.datafactory.impl.DataFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import com.automation.Utilities.PropertyFileReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import com.automation.PageObject.contactUsPage;

public class ContactUsStepDef {

	public WebDriver driver ; 
    PropertyFileReader obj = new PropertyFileReader();
    DataFactory df = new DataFactory();
    
	@Given("^I open chrome browser and navigate to contactUs page$")
	public void I_open_chrome_browser_and_navigate_to_contactUs_page() throws Throwable {
		Properties property = obj.getProperty();
   	    System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
   	    driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(property.getProperty("browser.contactUsURL"));
	}
	
	@When("^click first name and enter random text$")
	public void click_first_name_and_enter_random_text(String  fName) throws Throwable {
		for (int i = 0; i < 20; i++) {
			fName = df.getFirstName();
			System.out.println(fName);
	}
		contactUsPage.firstName(driver).sendKeys(fName);
	}
	@Then("^click last Name and enter random text$")
	public void click_last_name_and_enter_random_text(String lName) throws Throwable {
		for (int i = 0; i < 20; i++) {
			lName = df.getLastName();
			System.out.println(lName);
		}
		contactUsPage.lastName(driver).sendKeys(lName);
	}
	/*
	@Then("^click phone number and enter random number$")
	public void click_phone_number_and_enter_random_number(int pNumber) throws Throwable {
		for (int i = 0; i < 100; i++) {
        	 pNumber = df.getNumber();
        	 System.out.println(pNumber);
        	 char pNum = (char)pNumber;
		}
		contactUsPage.lastName(driver).sendKeys(pNum);
	}*/

	@And("^click email and enter random emailID$")
	public void click_email_and_enter_random_emailID(String eMail) throws Throwable {
		for (int i = 0; i < 20; i++) {
    		eMail = df.getEmailAddress();
    		System.out.println(eMail);
    	}
		contactUsPage.lastName(driver).sendKeys(eMail);
	}
	
	@And("^click company name and enter random text$")
	public void click_company_name_and_enter_random_text(String cName) throws Throwable {
		for (int i = 0; i < 20; i++) {
			cName = df.getBusinessName();
			System.out.println(cName);
		}
		contactUsPage.lastName(driver).sendKeys(cName);
	}
	
	@And("^click website URL and enter random text$")
	public void click_website_URL_and_enter_random_text(String URL) throws Throwable {
		for (int i = 0; i < 20; i++) {
    		URL = df.getRandomText(10);
    		System.out.println(URL);
		}
    	    String webURL = URL + "@testdata.com";
    	    contactUsPage.lastName(driver).sendKeys(webURL);
	}		
}