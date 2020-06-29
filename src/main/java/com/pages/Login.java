package com.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BasePage;


public class Login extends BasePage{
	
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement login;
	
	WebDriver driver;
	
	//Initializing the Page Objects:
	public Login(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public Home login(String un,String pwd) throws Exception{
		
//		username.sendKeys(un);
		waitForElement(driver,username,"10");
		typeAction(driver, username,un);
//		password.sendKeys(pwd);
		waitForElement(driver,password,"10");
		typeAction(driver, password,pwd);
//		login.click();
		waitForElement(driver,login,"10");
		clickAction(driver,login);
		
	    return new Home(driver);
		
	}
	
	
	
	
	
	
	
	
	

	
}
