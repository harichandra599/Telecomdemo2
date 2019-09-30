package com.Telecom.LoginPage;

import java.io.IOException;
import java.lang.reflect.Method;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Telecom.testBase.TestBase;
import com.Telecom.uiActions.Telecom_Login_obj;
import com.relevantcodes.extentreports.LogStatus;
import jxl.read.biff.BiffException;

public class Telecom_Login extends TestBase
{
	Telecom_Login_obj tellogin;
	public static final Logger log=Logger.getLogger(Telecom_Login.class.getName());
	  
	  @BeforeMethod
	  public void openbrowser(Method result) throws IOException
	  {
		  test = extent.startTest(result.getName());
		  test.log(LogStatus.INFO, result.getName() + " test Started");
		  init();
	  }
	  @DataProvider(name="loginData")
		public String[][] getTestData() throws IOException, BiffException
		{
			String[][] testRecords = getData("TestData.xls", "Sheet1");
			return testRecords;
		}
	  @Test (dataProvider="loginData")
	  public void telecomoperations(String username, String password) throws Exception 
	  { 
		  tellogin=new Telecom_Login_obj(driver);
		  Thread.sleep(3000);
		  log.info("<===========Starting Telecom user login operarions===========> ");
		  
		  tellogin.Telecom_Login(username, password);
		  log.info("<===========Ended Telecom user login operations===========> ");
	  }

	@AfterMethod
	public void browserclose() throws Exception
	{
		closeBrowser();
	}
}
