package com.Telecom.uiActions;

import java.io.FileInputStream;
import java.util.Properties;

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
    @FindBy(how = How.NAME, using = "username")
    WebElement tusername; //Web Element and id For user name 
    
    @FindBy(how = How.NAME, using = "password")
    WebElement tpassword; //Web Element and id For user name 
    
    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    WebElement loginbutton; //Web Element  For login button click 

    @FindBy(how = How.CSS, using = ".text-dark-cerulean")
    WebElement dbmainmenubtn; //Web Element and css For main menu button
    
    @FindBy(how = How.CSS, using = "div:nth-child(2) > a .mt4")
    WebElement sites; //Web Element and css For Sites
    
    @FindBy(how = How.CSS, using = "div:nth-child(3) .flex > .mt4")
    WebElement assets; //Web Element and css For assets
    
    @FindBy(how = How.CSS, using = "div:nth-child(4) .mt4")
    WebElement settings; //Web Element and css For settings
    
    @FindBy(how = How.CSS, using = "div:nth-child(1) > a .mt4")
    WebElement dashboard; //Web Element and css For dash board
    
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
    
    @FindBy(how = How.CSS, using = "app-usage-card:nth-child(3) .fw-light:nth-child(1)")
    WebElement batteryutlization; //Web Element and css For battery utilization
    
    @FindBy(how = How.CSS, using = ".mt3:nth-child(3) .f12")
    WebElement soh1; //Web Element and css For status of health in 0-2 hours
    
    @FindBy(how = How.CSS, using = ".mt3:nth-child(4) .f12")
    WebElement soh2; //Web Element and css For status of health in 3-5 hours
    
    @FindBy(how = How.CSS, using = ".mt3:nth-child(5) .f12")
    WebElement soh3; //Web Element and css For status of health in 6-8 hours
    
    //State of Charge(SOC) perecentage
    @FindBy(how = How.CSS, using = ".w33p:nth-child(1) .percentage:nth-child(3)")
    WebElement soc1; //Display perecentage and battery banks count 
    
   //State of Charge(SOC) battery banks count
    @FindBy(how = How.CSS, using = ".w33p:nth-child(1) .f24")
    WebElement soc1b; //Display perecentage and battery banks count
    
    //State of Charge(SOC) perecentage
    @FindBy(how = How.CSS, using = ".w33p:nth-child(2) .percentage:nth-child(3)")
    WebElement soc2; //Display perecentage and battery banks count 
    
   //State of Charge(SOC) battery banks count
    @FindBy(how = How.CSS, using = ".w33p:nth-child(2) .f24")
    WebElement soc2b; //Display perecentage and battery banks count
    
    //State of Charge(SOC) perecentage
    @FindBy(how = How.CSS, using = ".w33p:nth-child(3) .percentage:nth-child(3)")
    WebElement soc3; //Display perecentage and battery banks count 
    
   //State of Charge(SOC) battery banks count
    @FindBy(how = How.CSS, using = ".w33p:nth-child(3) .f24")
    WebElement soc3b; //Display perecentage and battery banks count
    
    //Alerts
    @FindBy(how = How.CSS, using = ".mt2:nth-child(1) .f24")
    WebElement alnonres; //Display alerts for Non responsive
    
    @FindBy(how = How.CSS, using = ".mt2:nth-child(2) .f24")
    WebElement allowbat; //Display alerts for Low battery
    
    @FindBy(how = How.CSS, using = ".mt2:nth-child(3) .f24")
    WebElement alneedm; //Display alerts for Need Maintenance
    
    @FindBy(how = How.CSS, using = ".mt2:nth-child(4) .f24")
    WebElement alnewsites; //Display alerts for new sites
    
    @FindBy(how = How.CSS, using = ".mt2:nth-child(5) .f24")
    WebElement alpowerout; //Display alerts for power outage
    
    //Diesel level status 
    @FindBy(how = How.CSS, using = "app-usage-card:nth-child(1) .f40")
    WebElement dls; //Display diesel level gas status
    
    @FindBy(how = How.CSS, using = ".ng-star-inserted:nth-child(1) > .flex > .f22")
    WebElement dgs1; //Display diesel level gas status first row
    
    @FindBy(how = How.CSS, using = ".ng-star-inserted:nth-child(1) > .flex > .pr3")
    WebElement dgs1g; //Display diesel level gas status first row
    
    @FindBy(how = How.CSS, using = ".ng-star-inserted:nth-child(2) > .flex > .f22")
    WebElement dgs2; //Display diesel level gas status second row
    
    @FindBy(how = How.CSS, using = ".ng-star-inserted:nth-child(2) > .flex > .pr3")
    WebElement dgs2g; //Display diesel level gas status second row
    
    @FindBy(how = How.CSS, using = ".ng-star-inserted:nth-child(3) .f22")
    WebElement dgs3; //Display diesel level gas status third row
    
    @FindBy(how = How.CSS, using = ".ng-star-inserted:nth-child(3) .pr3")
    WebElement dgs3g; //Display diesel level gas status third row
     
     
    public void telecomoperations() throws Exception
    {
      //call property file for reading user name and password 
      Properties prop=new Properties();
      FileInputStream propfile = new FileInputStream(System.getProperty("user.dir")+"\\config.properties");
      prop.load(propfile);
      //enter user name 
      Thread.sleep(5000);
      tusername.sendKeys(prop.getProperty("username"));
      log.info("<=========== User name entered successfully!===========> ");
      //enter password
      tpassword.sendKeys(prop.getProperty("password"));
      log.info("<===========password entered successfully!===========> ");
      loginbutton.click();
      log.info("<===========Login button clicked successfully!===========> "); 	
  	  Thread.sleep(5000);
  	  log.info("Telecom Dashoard displayed");
  	  //Click on site locations 
  	  Thread.sleep(5000);
  	  //Click on dash board main menu button
  	  dbmainmenubtn.click();
  	  log.info("Dash board main menu button clicked successfully");
  	  //click on sites
  	  Thread.sleep(5000);
  	  sites.click();
  	  log.info("Sites cliked successfully on left Menu");
  	  //click on Assets
  	  Thread.sleep(5000);
  	  dbmainmenubtn.click();
  	  //assets.click();
  	  log.info("Assets cliked successfully on left Menu");
  	  //click on settings
  	  Thread.sleep(5000);
  	  //settings.click();
  	  log.info("Settings cliked successfully on left Menu");
  	  //click on Dashboard
  	  Thread.sleep(3000);
  	  dashboard.click();
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
	  //Battery Bank utilization 
	  //print battery bank utilization in hours 
      log.info("Battery bank utilization in hours :-" +batteryutlization.getText());
      //print status of health 	under 0-2 hours
      log.info("Status of health under 0-2 hours :-" +soh1.getText());
      //print status of health 	under 0-2 hours
      log.info("Status of health under 3-5 hours :-" +soh2.getText());
      //print status of health 	under 0-2 hours
      log.info("Status of health under 6-8 hours :-" +soh3.getText());
	  
      //status of charge(SOC)
      //print Current Charge of battery Banks in first column
      String soc1s = soc1.getText(); String soc1s1 =soc1b.getText();
      log.info( soc1s +"charge for "+ soc1s1 +" Battery banks");
      //print Current Charge of battery Banks in second column
      String soc2s = soc2.getText(); String soc2s1 =soc2b.getText();
      log.info( soc2s +"charge for "+ soc2s1  +" Battery banks");
      //print Current Charge of battery Banks in second column
      String soc3s = soc2.getText(); String soc3s1 =soc2b.getText();
      log.info( soc3s +"charge for "+ soc3s1  +" Battery banks");
      
      //Alerts 
      //print alert count for Non responsive
      log.info("alerts count for Non responsive:-" +alnonres.getText());
      //print alert count for Low battery
      log.info("alerts count for Low battery:-" +allowbat.getText());
      //print alert count for need maintenance
      log.info("alerts count for need maintenance:-" +alneedm.getText());
      //print alert count for new sites
      log.info("alerts count for new sites:-" +alnewsites.getText());
      //print alert count for power outage
      log.info("alerts count for power outage:-" +alpowerout.getText());
      
      //Diesel level status
      //display diesel level status 
      log.info("gal Diesel Consumption value is:-" +dls.getText());
      //display diesel level status first row 
      String dgs1s =dgs1.getText(); String dgs1gs =dgs1g.getText();
      log.info("Diesel level status for " +dgs1s +" Dg Status " +dgs1gs);
      
      //display diesel level status second row 
      String dgs2s =dgs2.getText(); String dgs2gs =dgs2g.getText();
      log.info("Diesel level status for " +dgs2s +" Dg Status " +dgs2gs);
      
    //display diesel level status third row 
      String dgs3s =dgs3.getText(); String dgs3gs =dgs1g.getText();
      log.info("Diesel level status for " +dgs3s +" Dg Status " +dgs3gs);
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
	}
}
