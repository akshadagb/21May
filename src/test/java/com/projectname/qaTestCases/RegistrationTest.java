package com.projectname.qaTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.projectname.qa.Pages.RegistrationPage;
import com.projectnmae.qa.Base.TestBase;

public class RegistrationTest extends TestBase {

	
	
	public RegistrationTest(WebDriver driver2) {
	}
	public RegistrationTest() {
	}
	@BeforeClass
	public void setup() {
		initailizeBrowser("Chrome");
	}
	@AfterClass
	public void teardown() {
		TestBase.driver.close();
	}
	
	@Test
	public void facebookRegistrationPageTest() {
		RegistrationPage rp=new RegistrationPage(TestBase.driver);
		
		rp.clickFacebookSignupLink();
		rp.verifyFacebookRegistrationPageFblogo();
		rp.verifyFacebookRegistrationPageAlreadyAccount(); 
		rp.setFacebookRegistrationPageFirstname();
		rp.setFacebookRegistrationPageLastname();
		rp.setFacebookRegistrationPageMob_email();
		rp.setFacebookRegistrationPagePassword();
		rp.setFacebookRegistrationPageBirthDate();
		rp.setFacebookRegistrationPageBirthMonth();
		rp.setFacebookRegistrationPageBirthYear();
		rp.setFacebookRegistrationPageGender("feMale");
		rp.clickFacebookRegistrationPageSubmitbtn();
}
	
	
	
	
	
	
	
	
	
	
	
	
}
