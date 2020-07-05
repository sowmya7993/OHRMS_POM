package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.base.BasePage;
import com.pages.Home;
import com.pages.Login;

public class AssignLeaveTest {
  @Test
  public void assignLeave() throws Exception {
	  
	    String testCaseName="AssignLeave";
	  
	  	BasePage bp=new BasePage();
		
		WebDriver driver=bp.startBrowser();
		
		bp.openApplication(driver);
		
		Login lp= new Login(driver);	
		
		Home hp=lp.login("Admin", "admin123");
		hp.assignLeave(testCaseName);
		
		bp.closeBrowser(driver);
		
  }
}
