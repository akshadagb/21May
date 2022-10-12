package com.projectname.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.projectnmae.qa.Base.TestBase;

public class RegistrationPage extends TestBase {


	//Declaration == webElements
	
	@FindBy(xpath="//img[@alt='Facebook']") private WebElement reg_fblogo;
	@FindBy(xpath="//a[text()='Already have an account?']") private WebElement already_acc;
	@FindBy(xpath="//a[@title='Sign up for Facebook']") private WebElement signuplink; 
	@FindBy(name="firstname") private WebElement firstname;
	@FindBy(name="lastname") private WebElement surname;
	@FindBy(name="reg_email__") private WebElement mob_email; 
	@FindBy(xpath="//input[@type='password']") private WebElement password;
	@FindBy(name="birthday_day") private WebElement birthdate;
	@FindBy(name="birthday_month") private WebElement birthmonth; 
	@FindBy(name="birthday_year") private WebElement birthyear;
	@FindBy(xpath="//input[@value='2']") private WebElement male_gender;
	@FindBy(xpath="//input[@value='1']") private WebElement female_gender;
	@FindBy(xpath="//button[@name='websubmit']") private WebElement submitbtn; 
	
	
	//initialization
	public RegistrationPage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	}
	
	//usage
	public void clickFacebookSignupLink() {
		signuplink.click();
	}
	public void verifyFacebookRegistrationPageFblogo() {
		Assert.assertTrue(reg_fblogo.isDisplayed() , "The Facebook logo on registration page is not displayed" );
	}
	public void verifyFacebookRegistrationPageAlreadyAccount() {

		Assert.assertTrue(already_acc.isDisplayed(), "The already having an account option on registration page is not displayed");
		Assert.assertEquals(already_acc.getText(), "Already have an account?");
	}
	public void setFacebookRegistrationPageFirstname() {
		Assert.assertTrue(firstname.isDisplayed(),"The firstname field is not displayed");
		firstname.sendKeys("bharvi");
	}
	public void setFacebookRegistrationPageLastname() {
		Assert.assertTrue(surname.isDisplayed(),"The lastname field is not displayed");
		surname.sendKeys("mayur");
	}
	public void setFacebookRegistrationPageMob_email() {
		Assert.assertTrue(mob_email.isDisplayed(),"mob_email field is not displayed");
		mob_email.sendKeys("akshada@gmail.com");
	}public void setFacebookRegistrationPagePassword() {
		Assert.assertTrue(password.isDisplayed(),"password field is not displayed");
		password.sendKeys("101010");
	}
	public void setFacebookRegistrationPageBirthDate() {
		Assert.assertTrue(birthdate.isDisplayed(),"birthdate drop down is not displayed");
		Select bdate=new Select(birthdate);
		Assert.assertFalse(birthdate.isSelected(), "birthdate is selected initailly");
		bdate.selectByVisibleText("10");
	}
	public void setFacebookRegistrationPageBirthMonth() {
		Assert.assertTrue(birthmonth.isDisplayed(),"Birth month drop down list is displayed");
		Select bmonth=new Select(birthmonth);
		Assert.assertFalse(birthmonth.isSelected(),"birthmonth is selected initailly");
		bmonth.selectByVisibleText("May");
	} 
	public void setFacebookRegistrationPageBirthYear() {
		Assert.assertTrue(birthyear.isDisplayed(),"Birth month drop down list is displayed");
		Select byear=new Select(birthyear);
		Assert.assertFalse(birthyear.isSelected(), "birthyear is selected initailly");
		byear.selectByVisibleText("1991");
	}
	public void setFacebookRegistrationPageGender(String gender) {
//		if(gender.equalsIgnoreCase("male")) {
//			male_gender.click();
//		}
//		else if(gender.equalsIgnoreCase("female")) {
//			female_gender.click();
//		}
//		else {
//			System.out.println("please select valid input");
//		}
//	}
	if(gender.equalsIgnoreCase("male")) {
		male_gender.click();
	}else if (gender.equalsIgnoreCase("female"))
		{
			female_gender.click();
		}
	else {
		System.out.println("Please select valid input");
	}
	
}
   
	public void clickFacebookRegistrationPageSubmitbtn() {
		submitbtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}