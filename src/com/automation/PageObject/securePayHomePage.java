package com.automation.PageObject;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
 
public class securePayHomePage{

        private static WebElement element = null;
        
        public void getSecurepayHomePageTitle(WebDriver driver){
         	String pageTitle = driver.getTitle();
         	Assert.assertEquals("Securepay", pageTitle);  
         	System.out.println(pageTitle);
      
         }
       
        public static WebElement supportMenuLink(WebDriver driver){
                   element = driver.findElement(By.xpath("//*[@id='menu-item-3367']/a"));
          	       return element;
        }
     
         public static WebElement contactUslink(WebDriver driver){
                   element = driver.findElement(By.xpath("//*[@id='wrapper']/p"));
                   return element;
         }
 
}

