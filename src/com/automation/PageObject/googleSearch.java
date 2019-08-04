package com.automation.PageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
public class googleSearch{
 
        private static WebElement element = null;
       
        public static WebElement searchTextBox(WebDriver driver){
                   element = driver.findElement(By.cssSelector("input[name='q']"));
          	       return element;
        }
     
         public static WebElement linkName(WebDriver driver){
                   element = driver.findElement(By.partialLinkText("Securepay"));
                   return element;
         }
     
     public static WebElement firstResult(WebDriver driver){
                   element = driver.findElement(By.xpath("//*[@id='vn1s0p1c0']/h3"));
         		   return element;
 
         }
}
