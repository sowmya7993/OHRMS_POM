package com.tests;

import org.testng.annotations.Test;

import com.utilities.ExcelFileUtil;

public class NewTest {
  @Test
  public void f() throws Exception { 
	  
	  String testCaseName="AssignLeave";
	 
	  String columnName="LeaveType";
	
	  
	  NewTest nt=new NewTest();
	  
	  String testData=nt.getTestData(exlInput, testCaseName, columnName);
	  
	  
	 
	  System.out.println("test data is "+testData);
	 
	  
  }
  
  public String getTestData(ExcelFileUtil exlInput,String testCaseName,String columnName) {
	     int rowCount= exlInput.rowCount("TestData");
		 int testCaseRow = -1;
		 
		 for(int i=1;i<=rowCount;i++) {
			 String exlTestCaseName=exlInput.getData("TestData", i, 0);
			 
			 if(exlTestCaseName.equalsIgnoreCase(testCaseName)){
				 testCaseRow=i;
				 break;
			 }
		 }
		 
		 int colCount=  exlInput.colCount("TestData");
			
		 int reqColNumber=-1;
			
		for(int i=0;i<colCount;i++) {
				 String exlTestcolumn=exlInput.getData("TestData", 0, i);
				 
				 if(exlTestcolumn.equalsIgnoreCase(columnName)) {
					 reqColNumber=i;
					 break;
				 }
				 
		}
		String testData=  exlInput.getData("TestData", testCaseRow, reqColNumber);
		return testData;
				 
  }
  
}
