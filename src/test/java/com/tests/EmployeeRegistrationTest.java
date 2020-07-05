package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.base.BasePage;
import com.pages.Home;
import com.pages.Login;

public class EmployeeRegistrationTest {
  @Test
  public void f() throws Exception {
	 
	  	BasePage bp=new BasePage();
	  	String testCaseName="EmployeeRegistration";
		
		WebDriver driver=bp.startBrowser();
		
		bp.openApplication(driver);
		
		Login lp= new Login(driver);	
		
		Home hp=lp.login("Admin", "admin123");
		hp.employeeRegistration(testCaseName);
		
		bp.closeBrowser(driver);
	  
  }
}
