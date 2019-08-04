package com.automation.PageObject;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
 
public class contactUsPage{

        private static WebElement element = null;
       
        public void getSecurepayHomePageTitle(WebDriver driver){
        	       Assert.assertEquals("Contact Us", driver.getTitle());    		   
        }
        
        public static WebElement firstName(WebDriver driver){
                   element = driver.findElement(By.cssSelector("input[name='first-name']"));
          	       return element;
        }
     
        public static WebElement lastName(WebDriver driver){
                   element = driver.findElement(By.cssSelector("input[name='last-name']"));
   	               return element;
 }
        public static WebElement email(WebDriver driver){
            element = driver.findElement(By.cssSelector("input[name='email-address']"));
               return element;
}
        public static WebElement phoneNumber(WebDriver driver){
            element = driver.findElement(By.cssSelector("input[name='phone-number']"));
               return element;
}
        public static WebElement websiteURL(WebDriver driver){
            element = driver.findElement(By.cssSelector("input[name='website-url']"));
               return element;
}
        public static WebElement companyName(WebDriver driver){
            element = driver.findElement(By.cssSelector("input[name='business-name']"));
               return element;
}
        public static WebElement reasonForEnquiryDropDown (WebDriver driver){
        	element = driver.findElement(By.xpath("//*[@id='wpcf7-f3455-p95-o1']/form/p[7]/label/span/select"));
        	return element;
        }
}

