package com.Telecom.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.Telecom.testBase.TestBase;

public class Siteobj extends TestBase
{
	WebDriver driver;
	SoftAssert softassert=new SoftAssert();
	
    public static final Logger log=Logger.getLogger(Siteobj.class.getName());
    
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
    
    @FindBy(how = How.CSS, using = ".text-dark-cerulean")
    WebElement mainmenu; //Web Element  For main menu
    
    @FindBy(how = How.CSS, using = "div:nth-child(2) > a .mt4")
    WebElement sites; //Web Element  For sites
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(1) .col1 .f16") 
    WebElement BTSname1; //Web Element  For BTS Name  
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(1) .col1 .f15")
    WebElement location1; //Web Element  For location 
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(1) .col1 > .pl4:nth-child(2) > div")
    WebElement alerts1; //Web Element  For alerts count 
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(1) .pl4:nth-child(1) > .text-charcoal > .ng-star-inserted")
    WebElement sitestatus1; //Web Element  For site status 
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(1) .pl4:nth-child(2) .ng-star-inserted")
    WebElement mainlinestatus1; //Web Element  For main line status 
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(1) .pl4:nth-child(3) .ng-star-inserted")
    WebElement bbstatus1; //Web Element  For BB Status
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(1) .pl4:nth-child(4) .ng-star-inserted")
    WebElement dgstatus1; //Web Element  For DG Status 
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(1) .pl4:nth-child(5) .ng-star-inserted")
    WebElement energyconsumption1; //Web Element  For Energy consumption 
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(1) .text-kelly-green")
    WebElement acstatusl1; //Web Element  For AC Status left 
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(1) .text-center")
    WebElement acstatusr1; //Web Element  For AC Status Right 
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(1) .pl4:nth-child(6) > .text-charcoal")
    WebElement roomtemp1; //Web Element  For Room Temp 
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(1) .pl4:nth-child(7) .ng-star-inserted")
    WebElement mcbdown1; //Web Element  For MCB Down 
    
    //Elements for click on location
    @FindBy(how = How.XPATH, using = "//div[2]/div/p")
    WebElement btsname11; //Web Element  For BTS Name 
    
    @FindBy(how = How.CSS, using = ".f18:nth-child(2)")
    WebElement location11; //Web Element For location
    
    //Sites Second row web elements 
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(2) .col1 .f16") 
    WebElement BTSname2; //Web Element  For BTS Name  
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(2) .col1 .f15")
    WebElement location2; //Web Element  For location 
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(2) .col1 > .pl4:nth-child(2) > div")
    WebElement alerts2; //Web Element  For alerts count 
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(2) .pl4:nth-child(1) > .text-charcoal > .ng-star-inserted")
    WebElement sitestatus2; //Web Element  For site status 
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(2) .pl4:nth-child(2) .ng-star-inserted")
    WebElement mainlinestatus2; //Web Element  For main line status 
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(2) .pl4:nth-child(3) .ng-star-inserted")
    WebElement bbstatus2; //Web Element  For BB Status
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(2) .pl4:nth-child(4) .ng-star-inserted")
    WebElement dgstatus2; //Web Element  For DG Status 
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(2) .pl4:nth-child(5) .ng-star-inserted")
    WebElement energyconsumption2; //Web Element  For Energy consumption 
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(2) .text-kelly-green")
    WebElement acstatus2; //Web Element  For AC Status left 
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(2) .text-center")
    WebElement acstatusr2; //Web Element  For AC Status Right 
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(2) .pl4:nth-child(6) > .text-charcoal")
    WebElement roomtemp2; //Web Element  For Room Temp 
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(2) .pl4:nth-child(7) .ng-star-inserted")
    WebElement mcbdown2; //Web Element  For MCB Down
    //Sites third row web elements 
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(3) .col1 .f16") 
    WebElement BTSname3; //Web Element  For BTS Name  
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(3) .col1 .f15")
    WebElement location3; //Web Element  For location 
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(3) .col1 > .pl4:nth-child(2) > div")
    WebElement alerts3; //Web Element  For alerts count 
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(3) .pl4:nth-child(1) > .text-charcoal > .ng-star-inserted")
    WebElement sitestatus3; //Web Element  For site status 
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(3) .pl4:nth-child(2) .ng-star-inserted")
    WebElement mainlinestatus3; //Web Element  For main line status 
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(3) .pl4:nth-child(3) .ng-star-inserted")
    WebElement bbstatus3; //Web Element  For BB Status
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(3) .pl4:nth-child(4) .ng-star-inserted")
    WebElement dgstatus3; //Web Element  For DG Status 
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(3) .pl4:nth-child(5) .ng-star-inserted")
    WebElement energyconsumption3; //Web Element  For Energy consumption 
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(3) .text-kelly-green")
    WebElement acstatus3; //Web Element  For AC Status left 
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(3) .text-center")
    WebElement acstatusr3; //Web Element  For AC Status Right 
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(3) .pl4:nth-child(6) > .text-charcoal")
    WebElement roomtemp3; //Web Element  For Room Temp 
    
    @FindBy(how = How.CSS, using = ".bg-white:nth-child(3) .pl4:nth-child(7) .ng-star-inserted")
    WebElement mcbdown3; //Web Element  For MCB Down
    
    
    
    
    
    
    public void sitesoperations() throws Exception
    {
  	  //enter user name  
      Thread.sleep(5000);
      tusername.sendKeys("dharmendra.pandit@techolution.com");
      log.info("<=========== User name entered successfully!===========> ");
      //enter password
      tpassword.sendKeys("mt123");
  	  log.info("<===========password entered successfully!===========> ");
  	  Thread.sleep(5000);
  	  //click on login button
      loginbutton.click();
      log.info("<===========Login button clicked successfully!===========> "); 	
  	  Thread.sleep(5000);
  	  log.info("Telecom Dashoard displayed");
  	  //click on Main menu button
  	  mainmenu.click();
  	  log.info("main menu button clicked successfully");
  	  //click on site results 
  	  sites.click();
  	  log.info("Sites clicked successfully on left menu");
  	  //Display BTS Name
  	  log.info("BTS Name is :- " +BTSname1.getText());
  	  //Display locations
  	  log.info("Location is :-" +location1.getText());
  	  //Display count of alerts
  	  log.info("alerts count is :-"+alerts1.getText());
  	  //Display site status
  	  log.info(" Site Status is :-"+sitestatus1.getText());
  	  //Display Main Line Status
  	  log.info("Main line status is :-"+mainlinestatus1.getText());
      //Display BB status
  	  log.info("BB status is :-"+bbstatus1.getText());
  	  //Display DG Status
  	  log.info("DG Status is :-"+dgstatus1.getText());
  	  //Display Energy Consumption
  	  log.info("Energy consumption is :-"+energyconsumption1.getText());
  	  //Display AC Status left value
  	  log.info("AC status left value is :-"+acstatusl1.getText());
  	  //Display AC Status Right value
  	  log.info("AC status Right value is :-"+acstatusr1.getText());
  	  //Display Room Temp
  	  log.info("Room Temp is :-"+roomtemp1.getText());
  	  //Display MCB Down
  	  log.info(" MCB Down value is :-"+mcbdown1.getText());
  /*	  //click on site location 1
  	  BTSname1.click();
  	  log.info("first site location clicked successfully");
  	  Thread.sleep(4000);
  	  //Validate Site name
  	  System.out.println(btsname11.getText());
  	  System.out.println(BTSname1.getText());
      Assert.assertEquals(BTSname1.getText(),btsname11.getText());
      log.info("Site name validated successfully");
      Assert.assertEquals(location1.getText(), location11.getText());
      log.info("Site location validated successfully");*/
      

  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  //Display site second row data
  	  log.info("<===========Sites Second Row Data===========> ");
  	  //Display BTS Name in Second Row
  	  log.info("BTS Name is :- " +BTSname2.getText());
  	  //Display locations
  	  log.info("Location is :-" +location2.getText());
  	  //Display count of alerts
  	  log.info("alerts count is :-"+alerts2.getText());
  	  //Display site status
  	  log.info(" Site Status is :-"+sitestatus2.getText());
  	  //Display Main Line Status
  	  log.info("Main line status is :-"+mainlinestatus2.getText());
      //Display BB status
  	  log.info("BB status is :-"+bbstatus2.getText());
  	  //Display DG Status
  	  log.info("DG Status is :-"+dgstatus2.getText());
  	  //Display Energy Consumption
  	  log.info("Energy consumption is :-"+energyconsumption2.getText());
  	  //Display AC Status left value
  	  log.info("AC status left value is :-"+acstatus2.getText());
  	  //Display AC Status Right value
  	  log.info("AC status Right value is :-"+acstatusr2.getText());
  	  //Display Room Temp
  	  log.info("Room Temp is :-"+roomtemp2.getText());
  	  //Display MCB Down
  	  log.info(" MCB Down value is :-"+mcbdown2.getText());
  	  
  	  //Display site second row data
  	  log.info("<===========Sites Third Row Data===========> ");
  	  //Display BTS Name in Second Row
  	  log.info("BTS Name is :- " +BTSname3.getText());
  	  //Display locations
  	  log.info("Location is :-" +location3.getText());
  	  //Display count of alerts
  	  log.info("alerts count is :-"+alerts3.getText());
  	  //Display site status
  	  log.info(" Site Status is :-"+sitestatus3.getText());
  	  //Display Main Line Status
  	  log.info("Main line status is :-"+mainlinestatus3.getText());
      //Display BB status
  	  log.info("BB status is :-"+bbstatus3.getText());
  	  //Display DG Status
  	  log.info("DG Status is :-"+dgstatus3.getText());
  	  //Display Energy Consumption
  	  log.info("Energy consumption is :-"+energyconsumption3.getText());
  	  //Display AC Status left value
  	  log.info("AC status left value is :-"+acstatus3.getText());
  	  //Display AC Status Right value
  	  log.info("AC status Right value is :-"+acstatusr3.getText());
  	  //Display Room Temp
  	  log.info("Room Temp is :-"+roomtemp3.getText());
  	  //Display MCB Down
  	  log.info(" MCB Down value is :-"+mcbdown3.getText());
  	  
}
}