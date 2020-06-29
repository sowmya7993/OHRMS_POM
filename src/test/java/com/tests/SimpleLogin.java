package com.tests;

import org.openqa.selenium.WebDriver;

import com.base.BasePage;
import com.pages.Home;
import com.pages.Login;

public class SimpleLogin {

	public static void main(String[] args) throws Exception {
		
		
		BasePage bp=new BasePage();
		
		WebDriver driver=bp.startBrowser();
		
		bp.openApplication(driver);
		
		Login lp= new Login(driver);	
		
		Home hp=lp.login("Admin", "admin123");
		
	}

}
