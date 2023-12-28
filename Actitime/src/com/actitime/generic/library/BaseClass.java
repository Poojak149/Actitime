package com.actitime.generic.library;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.actitime.objectRepository.HomePage;
import com.actitime.objectRepository.LoginPage;

public class BaseClass {
	FileLibrary f=new  FileLibrary();
	public static WebDriver driver;
	@BeforeSuite
	public void databaseconnected() {
		Reporter.log("database connected",true);
	}
	
	@BeforeTest
	public void launhbrowser() throws IOException {
		 driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 String URL = f.readDataFromPropertyFile("url");
		 driver.get(URL);
		 Reporter.log("browser launch",true);
		 
	}
	
	@BeforeMethod
	public void logintoactitime() throws IOException {
		String un = f.readDataFromPropertyFile("Username");
		String pwd = f.readDataFromPropertyFile("Password");
		LoginPage lp=new LoginPage(driver);
		lp.getUntbx().sendKeys(un);
		lp.getPwtbx().sendKeys(pwd);
		lp.getLgtbx().click();
		Reporter.log("logged in succesfully",true);
	}
	
	@AfterMethod
	public void logoutactitime() {
		HomePage hp=new HomePage(driver);
		hp.getLgtbtn().click();
		Reporter.log("logged succesfully",true);
	}
	
	@AfterTest
	public void closebrowser() {
		driver.close();
		Reporter.log("browser closed succesfully",true);
	}
	
	@AfterSuite
	public void databasedisconnected() {
		Reporter.log("database disconnected",true);
	}	
}

