package com.w2a.facebook.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class WebConnector {
	
	//initializing prop, logs
	//Keywords
	
	
	public static WebDriver driver;
	public static Properties OR;
	public static Properties Config;
	public static FileInputStream fis; 
	public static Logger logs = Logger.getLogger("devpinoyLogger");

	
	
	public WebConnector(){
		
		
		
		
		
		
		
		
		
		if(OR==null){
			OR = new Properties();
			try {
				fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\w2a\\facebook\\config\\OR.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				OR.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			Config = new Properties();
			try {
				fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\w2a\\facebook\\config\\Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Config.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
	
	public void openBrowser (String browserType){
		
		if (Config.getProperty("browser").equals("firefox")){
			driver = new FirefoxDriver();
			
		}else if (Config.getProperty("browser").equals("chrome")){		
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		
		}else if (Config.getProperty("browser").equals("ie")){		
			System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer_Win32_2.44.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
	}
	
	public void navigate(String url){
		driver.get(Config.getProperty(url));
		
		
	}
	
	public void type(String locator, String value){
		driver.findElement(By.xpath(OR.getProperty(locator))).sendKeys(value);
		
	}
	
	public void click(String locator){
		driver.findElement(By.xpath(OR.getProperty(locator))).click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
