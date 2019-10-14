package com.Telecom.uiActions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import com.Telecom.testBase.TestBase;
import com.Telecom.config.*;

public class Site_MCB_obj extends TestBase
   {
	WebDriver driver;
	SoftAssert softassert=new SoftAssert();
   
    
    public static final Logger log=Logger.getLogger(Site_MCB_obj.class.getName());
    
    public  Site_MCB_obj(WebDriver driver)
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
    
    @FindBy(how = How.CSS, using  = ".label-tab-3")
    WebElement mcb ; //Web Element  For MCB
    
    @FindBy(how = How.CSS, using  = ".pointer:nth-child(2) > .cdk-column-BTSName .f16")
    WebElement btsname1; //Web Element  For BTS name first row
    
    @FindBy(how = How.CSS, using  = ".tab:nth-child(7) .pointer:nth-child(2) .f15")
    WebElement location1; //Web Element  For Location First row
    
    @FindBy(how = How.CSS, using  = ".pointer:nth-child(2) .fw-extrabold")
    WebElement mcbsoff1 ; //Web Element  For Mcb's off
    
    @FindBy(how = How.CSS, using  = ".pointer:nth-child(2) > .mat-cell:nth-child(5) .icon-Expand-icon")
    WebElement popup1; //Web Element  For popup in first row 
    
    @FindBy(how = How.CSS, using  = ".ng-star-inserted > .text-left:nth-child(1)")
    WebElement btsnamepopup; //Web Element  For 
    
    @FindBy(how = How.CSS, using  = ".f16:nth-child(2)")
    WebElement locationpopup; //Web Element  For 
    
    @FindBy(how = How.CSS, using  = ".f16:nth-child(3)")
    WebElement mcbsoffpopup; //Web Element  For 
    
    @FindBy(how = How.CSS, using  = ".f16:nth-child(4)")
    WebElement mcbsonpopup; //Web Element  For 
    
    /*@FindBy(how = How.CSS, using  = "")
    WebElement ; //Web Element  For 
    
    @FindBy(how = How.CSS, using  = "")
    WebElement ; //Web Element  For 
    
    @FindBy(how = How.CSS, using  = "")
    WebElement ; //Web Element  For 
    
    @FindBy(how = How.CSS, using  = "")
    WebElement ; //Web Element  For*/ 
    
    
    
    
    
    
    
    
    
    
    
    
    public void sites_MCB_operations() throws IOException, Exception 
    {
      //call property file for reading user name and password 
      Properties prop=new Properties();
      FileInputStream propfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\Telecom\\config\\config.properties");
      prop.load(propfile);
      //enter user name 
      Thread.sleep(5000);
      tusername.sendKeys(prop.getProperty("username"));
      log.info("<=========== User name entered successfully!===========> ");
      //enter password
      tpassword.sendKeys(prop.getProperty("password"));
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
  	  //click on MCB 
  	  mcb.click();
  	  log.info("MCB button clicked successfully");
  	  //print first row BTS name 
  	  log.info("BTS name first row is :-" +btsname1.getText());
  	  //Print first row Location name 
  	  log.info("Location name in first row is :-"+location1.getText());
  	  //Print MCB's OFF count 
  	  log.info("MCB's Off count is :- "+mcbsoff1.getText());
  	 //Store bts name web element in one string
      String btsnametext = btsname1.getText();
      //Store location web element in one string
      String locationtext = location1.getText();
  	  //click on MCB row first popup 
  	  popup1.click();
  	  log.info("MCB first row popup clicked successfully");
  	  Thread.sleep(4000);
  	  //Validate BTS name with BTS name in expanded pop up
  	  //System.out.println(btsnametext);
  	  Assert.assertEquals(btsnametext,btsnamepopup.getText());
  	  log.info("BTS name validated successfully");
  	  //Validate Location name with location in expanded popup
  	  //System.out.println(locationtext);
  	  Assert.assertEquals(locationtext,locationpopup.getText());
  	  log.info("Location name validated successfully");
  	  //print the counts of MCB's off
  	  log.info("count of MCB's off :-"+mcbsoffpopup.getText());
  	  //print the counts of MCB's On 
  	  log.info("count of MCB's On :-" +mcbsonpopup.getText());
  	  
}
}