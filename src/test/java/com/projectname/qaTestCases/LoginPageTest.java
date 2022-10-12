package com.projectname.qaTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.projectname.qa.Pages.LoginPage;
import com.projectnmae.qa.Base.TestBase;

public class LoginPageTest extends TestBase {
	
	
	
	@BeforeClass
	public void setup() {
		initailizeBrowser("Chrome");
	}
	@AfterClass
	public void teardown() {
		TestBase.driver.close();
	}
	@Test
	public void facebookLoginPageTest() {
		LoginPage lp=new LoginPage(TestBase.driver);
		lp.verifyLoginPageFBLogo();
		lp.verifyLoginPageTagline();
		//lp.verifyLoginPageCreateNewAcc();
		lp.setLoginPageUsername();
		lp.setLoginPagePassword();
		lp.verifyLoginPageLoginBtn();
		lp.verifyLoginPageForgotPassword();
		lp.verifyLoginPageFooterlinkSize();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	}


