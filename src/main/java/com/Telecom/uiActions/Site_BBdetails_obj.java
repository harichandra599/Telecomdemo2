package com.Telecom.uiActions;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.Telecom.testBase.TestBase;

import junit.framework.Assert;

public class Site_BBdetails_obj extends TestBase
{
	WebDriver driver;
	SoftAssert softassert=new SoftAssert();
	
    public static final Logger log=Logger.getLogger(Site_BBdetails_obj.class.getName());
    
    public  Site_BBdetails_obj(WebDriver driver)
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
    
    @FindBy(how = How.CSS, using  = ".label-tab-2")
    WebElement bbdetails ; //Web Element  For BB details
    
    @FindBy(how = How.CSS, using  = ".cdk-column-BtsName .f16")
    WebElement btsname1; //Web Element  For BTS Name
    
    @FindBy(how = How.CSS, using  = ".tab:nth-child(6) .f15")
    WebElement location1; //Web Element  For Location 
    
    @FindBy(how = How.CSS, using  = ".cdk-column-count > app-table-row > .fw-normal")
    WebElement Batterybanks1 ; //Web Element  For Battery banks
    
    @FindBy(how = How.CSS, using  = ".cdk-column-Below-50- .f17")
    WebElement below501 ; //Web Element  For Below 50%
    
    @FindBy(how = How.CSS, using  = ".cdk-column-50----80- .f17")
    WebElement fiftyto801; //Web Element  For  50 to 80%
    
    @FindBy(how = How.CSS, using  = ".cdk-column-80----above .f17")
    WebElement eightyabove1; //Web Element  For 80% above 
    
    @FindBy(how = How.CSS, using  = ".mat-cell:nth-child(7) .icon-Expand-icon")
    WebElement bbpopup1; //Web Element  For BB details expand
    
    
    
    @FindBy(how = How.CSS, using  = "td:nth-child(1)")
    WebElement btspopup; //Web Element  For bts name in popup
    
    @FindBy(how = How.CSS, using  = "td:nth-child(2)")
    WebElement locationpopup; //Web Element  For location name in popup
    
    @FindBy(how = How.CSS, using  = "td:nth-child(3)")
    WebElement cellspopup; //Web Element  For cells count 
    
    @FindBy(how = How.CLASS_NAME, using  = "ng-star-inserted")
    WebElement cellnames; //Web Element  For cell name values 
    
    @FindBy(how = How.CSS, using  = ".hover-text-red")
    WebElement popupclose ; //Web Element  For popup close  
    
    /*@FindBy(how = How.CSS, using  = "")
    WebElement ; //Web Element  For  */  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void sites_BBdetails_operations() throws Exception
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
  	  //click on BB details 
  	  bbdetails.click();
  	  log.info("BB Details button clicked successfully");
  	  //Print BTS name 
  	  log.info("BTS Name is :-" +btsname1.getText());
  	  //Print Locations 
  	  log.info("Location name is :-" +location1.getText());
  	  //Store bts name web element in one string
      String btsnametext = btsname1.getText();
      //Store location web element in one string
      String locationtext = location1.getText();
  	  //Print count of Battery banks 
  	  log.info("Count of Battery Banks is :-" +Batterybanks1.getText());
  	  //print battery banks count below 50%
  	  log.info("Battery banks count below 50% is :-" +Batterybanks1.getText());
  	  //Print Battery banks count 50% to 80%
  	  log.info("Battery banks count 50% to 80% is :-" +fiftyto801.getText());
  	  //print battery banks count above 80% 
  	  log.info("Battery baknks count above 80% is :-" +eightyabove1.getText());
  	  //click on Expand button 
  	  bbpopup1.click();
  	  log.info("BB details expand popup clicked successfully");
  	  Thread.sleep(5000);
      //Validate BTS name with BTS name in expanded pop up
  	  //System.out.println(btsnametext);
  	  Assert.assertEquals(btsnametext,btspopup.getText());
  	  log.info("BTS name validated successfully");
  	  //Validate Location name with location in expanded popup
  	  //System.out.println(locationtext);
  	  Assert.assertEquals(locationtext,locationpopup.getText());
  	  log.info("Location name validated successfully");
  	  //Print count of cells 
  	  log.info("Count of cells in popup is :-" +cellspopup.getText());
  	  List<WebElement> cellscount=driver.findElements(By.cssSelector(".cdk-column-Cell-Name .ng-star-inserted"));
	  log.info("Cell name columns count is :-"+cellscount.size()); 
	  int cellfinalcount = cellscount.size()- 1;
	  Assert.assertEquals(cellfinalcount,cellspopup.getText());
	  log.info("cells count verified successfully!");
	  popupclose.click();
	  log.info("Battery cell details popup closed successfully");
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  
  	  

}
}