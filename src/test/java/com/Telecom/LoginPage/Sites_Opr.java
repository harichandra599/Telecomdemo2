package com.Telecom.LoginPage;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Telecom.testBase.TestBase;
import com.Telecom.uiActions.Siteobj;
import com.relevantcodes.extentreports.LogStatus;

public class Sites_Opr extends TestBase
{
	Siteobj site;
	 
	  public static final Logger log=Logger.getLogger(Sites_Opr.class.getName());
	  
	  @BeforeMethod
	  public void openbrowser(Method result) throws Exception
	  {
		  test = extent.startTest(result.getName());
		  test.log(LogStatus.INFO, result.getName() + " test Started");
		  init();
		  wait_for_page_load(5000);
	  }
	  @Test()
	  public void sitesoperations() throws Exception 
	  { 
		  site=new Siteobj(driver);
		  Thread.sleep(3000);
		  log.info("<===========Starting Sites operations===========>");
		  site.sitesoperations();
		  log.info("<===========Ended Sites operations===========> ");
		  Sendmail sndmail=new Sendmail();
		  sndmail.SendAttachment();
		  
	  }

	@AfterMethod
	public void browserclose() throws Exception
	{
		closeBrowser();
	}
}
