package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.base.BasePage;
import com.pages.Home;
import com.pages.Login;
import com.utilities.ExcelFileUtil;

public class UserRegistrationTest {
  @Test
  public void  userRegistrationTest() throws Exception {
	  
	  String testCaseName="UserRegistration";
	  
	  BasePage bp=new BasePage();
	  WebDriver driver=bp.startBrowser();
	  bp.openApplication(driver);
	  
	  Login lp= new Login(driver);	
	  Home hp= lp.login("Admin", "admin123");
	  
	  hp.userRegistration(testCaseName);
	 
	  bp.closeBrowser(driver);
	  
  }
}
