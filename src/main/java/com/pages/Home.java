package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BasePage;
import com.utilities.ExcelFileUtil;

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
	
	@FindBy(id="menu_pim_viewPimModule")
	WebElement  pim;
	
	@FindBy(id="menu_pim_addEmployee")
	WebElement  addEmployee;
	
	@FindBy(id="firstName")
	WebElement  emp_firstName;
	
	@FindBy(id="lastName")
	WebElement  emp_lastName;
	
	@FindBy(linkText="Leave")
	WebElement  leave;
	
	@FindBy(id="menu_leave_assignLeave")
	WebElement assingLeave;
	
	@FindBy(name="assignleave[txtEmployee][empName]")
	WebElement assignleave_empName;
	
	@FindBy(id="assignleave_txtLeaveType")
	WebElement leaveType;

	@FindBy(id="assignleave_txtFromDate")
	WebElement fromDate;
	
	@FindBy(id="assignleave_txtToDate")
	WebElement toDate;

	@FindBy(id="assignleave_partialDays")
	WebElement partialDays;
	
	@FindBy(id="assignleave_txtComment")
	WebElement comment;
	
	@FindBy(id="assignBtn")
	WebElement assign;
	
	WebDriver driver;
	
	//Initializing the Page Objects:
   public Home(WebDriver driver){
	   
	   	this.driver= driver;
	     PageFactory.initElements(driver, this);
   }
   
   
   public void userRegistration(String testCaseName) throws Exception {   
//	   System.out.println("the valude of driver in userRegistration fuction is "+driver);
	   
	   ExcelFileUtil exl=new ExcelFileUtil();
		  
	   waitForElement(driver,admin,"10");
	   clickAction(driver,admin);
	   
	   waitForElement(driver,addButton,"10");
	   clickAction(driver,addButton);
	   
	   waitForElement(driver,employee,"10");
	   String testData=exl.getTestData(exl, testCaseName, "EmployeeName");  
	   typeAction(driver, employee,testData);
	   
	   waitForElement(driver,username,"10");
	    testData=exl.getTestData(exl, testCaseName, "NewUserName");   
	   typeAction(driver, username,testData);
	   
		waitForElement(driver,password,"10");
		 testData=exl.getTestData(exl, testCaseName, "NewUserPassword");   
		typeAction(driver, password,testData);
		
		waitForElement(driver,confirmPassword,"10");
		 testData=exl.getTestData(exl, testCaseName, "NewUserConfirmPassword");
		typeAction(driver, confirmPassword,testData);
		
		waitForElement(driver,save,"10");
		clickAction(driver,save);
	   
   }
	
  public void AssignLeave() {
	   System.out.println("the valude of driver in AssignLeave fuction is "+driver);
   }
  
  public void employeeRegistration(String testCaseName) throws Exception {
	  ExcelFileUtil exlInput=new ExcelFileUtil();
	  
	  waitForElement(driver,pim,"10");
	  clickAction(driver,pim);
	  
	  waitForElement(driver,addEmployee,"10");
	  clickAction(driver,addEmployee);
	  
	  waitForElement(driver,emp_firstName,"10");
	  String testData=exlInput.getTestData(exlInput, testCaseName, "EmployeeFirstName");
	  typeAction(driver, emp_firstName,testData);
	  
	  waitForElement(driver,emp_lastName,"10");
	   testData=exlInput.getTestData(exlInput, testCaseName, "EmployeeLastName");
	  typeAction(driver, emp_lastName,testData);
	  
	  waitForElement(driver,save,"10");
	  clickAction(driver,save);
	 
  }
  
  
  public void assignLeave( String testCaseName) throws Exception {
	  
	  ExcelFileUtil exlInput=new ExcelFileUtil();
	  
	  waitForElement(driver,leave,"10");
	  clickAction(driver,leave);
	  
	  waitForElement(driver,assingLeave,"60");
	  clickAction(driver,assingLeave);
	  
	  waitForElement(driver,assignleave_empName,"10");
	  String empName=exlInput.getTestData(exlInput, testCaseName, "EmployeeName");
	  
//	  typeAction(driver, assignleave_empName,"Jasmine Morgan");
	  typeAction(driver, assignleave_empName,empName);
	  
	  waitForElement(driver,leaveType,"10");
//	  selectAction(driver,leaveType,"Maternity US");
	  String leaveTye=exlInput.getTestData(exlInput, testCaseName, "LeaveType");
	  selectAction(driver,leaveType,leaveTye);
	   
	  waitForElement(driver,fromDate,"10");
//	  selectFromCalendar(driver,fromDate,"05/28/2020");
	  String strfromDate=exlInput.getTestData(exlInput, testCaseName, "FromDate"); 
	  selectFromCalendar(driver,fromDate,strfromDate);
	  
	  waitForElement(driver,toDate,"10");
//	  selectFromCalendar(driver,toDate,"08/28/2020");
	  String strtoDate=exlInput.getTestData(exlInput, testCaseName, "ToDate"); 
	  selectFromCalendar(driver,toDate,strtoDate);
	  
	  hitEnter(driver, toDate);
	  
	  waitForElement(driver,comment,"10");
//	  typeAction(driver, comment,"test");
	  String strcomment=exlInput.getTestData(exlInput, testCaseName, "Comment"); 
	  typeAction(driver, comment,strcomment);
	  
	  waitForElement(driver,assign,"10");
	  clickAction(driver,assign);
	  
  }
  
  
  
  
	
}
