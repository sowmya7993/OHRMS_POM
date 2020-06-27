package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.utilities.PropertyFileUtil;

public class BasePage {
	
	public  WebDriver startBrowser() throws Exception {
		
		
		String browserName=PropertyFileUtil.getValueForKey("Browser");
		WebDriver driver = null;	

		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			  driver =new ChromeDriver();	
		}else if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
			 driver =new FirefoxDriver();		
		}else if(browserName.equalsIgnoreCase("ie")){	
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\Drivers\\IEDriverServer.exe");
			 driver  =new InternetExplorerDriver();	
		}
		
		return driver;
		
	}

}
