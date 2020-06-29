package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BasePage;

public class Home extends BasePage{
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement admin;
	
	@FindBy(name="btnAdd")
	WebElement addButton;
	
	@FindBy(id="systemUser_employeeName_empName")
	WebElement employee;
	
	@FindBy(id="systemUser_userName")
	WebElement username;
	
	@FindBy(name="systemUser[password]")
	WebElement password;
	
	@FindBy(name="systemUser[confirmPassword]")
	WebElement confirmPassword;
	
	@FindBy(id="btnSave")
	WebElement save;
	
	//Initializing the Page Objects:
   public Home(WebDriver driver){
	     PageFactory.initElements(driver, this);
   }
   
   
   public void userRegistration() {
	   
   }
	
	
}
