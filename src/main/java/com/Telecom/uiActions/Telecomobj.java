package com.Telecom.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.Telecom.testBase.TestBase;



public class Telecomobj extends TestBase
{
	WebDriver driver;
	SoftAssert softassert=new SoftAssert();
	
    public static final Logger log=Logger.getLogger(Telecomobj.class.getName());
    
    public  Telecomobj(WebDriver driver)
    {
    	 this.driver=driver;
    	 PageFactory.initElements(driver, this);
    }
    @FindBy(how = How.CSS, using = ".site-count > .f18")
    WebElement sitelocations; //Web Element and css For site locations
    
    @FindBy(how = How.CSS, using = ".site-count > .f34")
    WebElement Sitelocationcount; //Web Element and css For sitelocation count
    
    @FindBy(how = How.CSS, using = ".hvac-count > .f18")
    WebElement hvac; //Web Element and css For for hvac
    
    @FindBy(how = How.CSS, using = ".hvac-count > .f34")
    WebElement hvaccount; //Web Element and css For hvac count
    
    @FindBy(how = How.CSS, using = ".minw50p:nth-child(1) app-status-bar:nth-child(1) .p0")
    WebElement needsattention; //Web Element and css For needs attention
    
    @FindBy(how = How.CSS, using = ".minw50p:nth-child(1) app-status-bar:nth-child(2) .p0")
    WebElement workingcond; //Web Element and css For working condition
    
    @FindBy(how = How.CSS, using = ".minw50p:nth-child(2) app-status-bar:nth-child(1) .p0")
    WebElement needsattention2; //Web Element and css For needs attention under main status
    
    @FindBy(how = How.CSS, using = ".mt2:nth-child(1) .f24")
    WebElement workingcond2; //Web Element and css For working condition under main status 
    
    @FindBy(how = How.CSS, using = ".mt2:nth-child(1) .f24")
    WebElement nonresponsive; //Web Element and css For nonresponsive under Alerts
    
    @FindBy(how = How.CSS, using = ".mt2:nth-child(2) .f24")
    WebElement Lowbattery; //Web Element and css For Low battery under Alerts
    
    @FindBy(how = How.CSS, using = ".mt2:nth-child(3) .f24")
    WebElement NeedMaintenance; //Web Element and css For Need Maintenance under Alerts
    
    @FindBy(how = How.CSS, using = ".mt2:nth-child(4) .f24")
    WebElement NewSites; //Web Element and css For New Sites under Alerts
    
    @FindBy(how = How.CSS, using = ".mt2:nth-child(5) .f24")
    WebElement PowerOutage; //Web Element and css For Power Outage under Alerts
    
   
    
    public void telecomoperations() throws Exception
    {
  	  //enter user name 
  	  Thread.sleep(5000);
  	  log.info("Telecom Dashoard displayed");
  	  //Click on site locations 
  	  Thread.sleep(5000);
  	  Actions a= new Actions(driver);
  	  a.moveToElement(sitelocations).click().build().perform();
  	  //sitelocations.click();
  	  log.info("page navigiated to site results");
  	  //page navigated to Dashboard
  	  Thread.sleep(5000);
  	  driver.navigate().back();
  	  log.info("page navigiated to home page");
  	  //print the Site locations count
  	  Thread.sleep(5000);
  	  log.info("Site locations count is:- " +Sitelocationcount.getText());
	  Thread.sleep(5000);
	  //click on HVAC
	  a.moveToElement(hvac).click().build().perform();
  	  //sitelocations.click();
  	  log.info("page navigiated to hvac results");
  	  //page navigated to Dashboard
  	  Thread.sleep(5000);
  	  driver.navigate().back();
  	  log.info("page navigiated to home page");
  	  //print the Site locations count
  	  Thread.sleep(5000);
  	  log.info("Hvac count is:- " +hvaccount.getText());
	  Thread.sleep(5000);
	  //Display count of Needs Attention under HVAC Status
	  log.info("needs attention count under HVAC status is :- " +needsattention.getText());
	  //Display count of working condition under HVAC Status
	  log.info("working condition under HVAC status is:- " +workingcond.getText());
	  //Display count of Needs Attention under main Status
	  log.info("needs attention count under main Status is:- " +needsattention2.getText());
	  //Display count of working condition under Main Status
	  log.info("working condition count under main Status is:- " +workingcond2.getText());
	  //Display count of Non Responsive under Alerts 
	  log.info("Non Responsive count under Alerts:- " +nonresponsive.getText());
	  //Display count of Low battery under Alerts 
	  log.info("Low battery count under Alerts:- " +Lowbattery.getText());
	  //Display count of Need Maintenance under Alerts 
	  log.info("Need Maintenance count under Alerts:- " +NeedMaintenance.getText());
	  //Display count of  New Sites  under Alerts 
	  log.info("New Sites count  under Alerts:- " +NewSites.getText());
	  //Display count of Power Outage under Alerts 
	  log.info("Power Outage count under Alerts:- " +PowerOutage.getText());
	  
	  
	}
}
