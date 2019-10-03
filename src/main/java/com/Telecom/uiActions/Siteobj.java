package com.Telecom.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.Telecom.testBase.TestBase;

public class Siteobj extends TestBase
{
	WebDriver driver;
	SoftAssert softassert=new SoftAssert();
	
    public static final Logger log=Logger.getLogger(Telecomobj.class.getName());
    
    public  Siteobj(WebDriver driver)
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
    
    public void sitesoperations() throws Exception
    {
  	  //enter user name  
      Thread.sleep(5000);
      tusername.sendKeys("Dharmendra.pandit@techolution.com");
      log.info("<=========== User name entered successfully!===========> ");
      tpassword.sendKeys("empty123");
  	  log.info("<===========password entered successfully!===========> ");
  	  Thread.sleep(5000);
      loginbutton.click();
      log.info("<===========Login button clicked successfully!===========> "); 	
  	  Thread.sleep(5000);
  	  log.info("Telecom Dashoard displayed");
  	  
}
}