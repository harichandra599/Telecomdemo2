package com.Telecom.LoginPage;

import java.lang.reflect.Method;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Telecom.testBase.TestBase;
import com.Telecom.uiActions.Site_BBdetails_obj;
import com.relevantcodes.extentreports.LogStatus;

public class Site_BBdetails_Opr extends TestBase
{
	  Site_BBdetails_obj bbdetails;
	  public static final Logger log=Logger.getLogger(Site_BBdetails_Opr.class.getName());
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
		  bbdetails=new Site_BBdetails_obj(driver);
		  Thread.sleep(3000);
		  log.info("<===========Starting Sites_BB detaisls operations===========>");
		  bbdetails.sites_BBdetails_operations();
		  log.info("<===========Ended Sites_BB details operations===========> ");
		  Sendmail sndmail=new Sendmail();
		  sndmail.SendAttachment();
		  
	  }

	@AfterMethod
	public void browserclose() throws Exception
	{
		closeBrowser();
	}
}
