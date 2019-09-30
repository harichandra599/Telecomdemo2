package com.Telecom.uiActions;

import java.time.Duration;
import java.time.Instant;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;


public class Telecom_Login_obj 
{
	WebDriver driver;
	SoftAssert softassert=new SoftAssert();
	
    public static final Logger log=Logger.getLogger(Telecom_Login_obj.class.getName());
    
    public  Telecom_Login_obj(WebDriver driver)
    {
    	 this.driver=driver;
    	 PageFactory.initElements(driver, this);
    }
    @FindBy(how = How.NAME, using = "username")
    WebElement tusername; //Web Element and id For user name 
    
    @FindBy(how = How.NAME, using = "password")
    WebElement tpassword; //Web Element and id For user name 
    
    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    WebElement loginbutton; //Web Element  For login button click 
    
   
     
    
    public void Telecom_Login(String username, String password) throws Exception
    {
  	  //enter user name 
  	  Thread.sleep(5000);
  	  tusername.sendKeys(username);
  	  log.info("Entered user name " +username+ " and object is "+tusername.toString());
  	  log.info("<===========Hi User name entered successfully!===========> ");
  	  tpassword.sendKeys(password);
  	  log.info("Entered password " +password+ " and object is "+tpassword.toString());
	  log.info("<===========password entered successfully!===========> ");
	  Thread.sleep(5000);
      loginbutton.click();
      log.info("<===========Login button clicked successfully!===========> ");
     
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
}
}
