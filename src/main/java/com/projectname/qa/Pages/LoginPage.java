package com.projectname.qa.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.projectnmae.qa.Base.TestBase;

public class LoginPage extends TestBase{

	//Declaration
	@FindBy(xpath="//img[@alt='Facebook']")private WebElement login_fblogo;
	@FindBy(xpath="//h2[@class='_8eso']")private WebElement login_tagline;
//  @FindBy(xpath="value")private WebElement create_newacc;
	@FindBy(xpath="//input[@name='email']")private WebElement login_username;
	@FindBy(xpath="//input[@name='pass']")private WebElement login_password;
	@FindBy(xpath="//button[@name='login']")private WebElement login_btn;
	@FindBy(xpath="//a[text()='Forgotten password?']")private WebElement login_forgotPassword;
	@FindBys({@FindBy(xpath="//div[@id='pageFooterChildren']/ul/li")})private List<WebElement> login_footerlink;
	
	//Initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//usage
	public void verifyLoginPageFBLogo() {
		Assert.assertTrue(login_fblogo.isDisplayed(), "the fb logo on login page is not displayed");
	}
	public void verifyLoginPageTagline() {
		Assert.assertTrue(login_tagline.isDisplayed(), "tagline not displayed");
		Assert.assertEquals(login_tagline.getText(),"Facebook helps you connect and share with the people in your life.");
	}
//	public void verifyLoginPageCreateNewAcc(){
//		Assert.assertTrue(create_newacc.isDisplayed(),"create new account btn is not displayed");
//	}
	public void setLoginPageUsername() {
		login_username.sendKeys("bharvi");
	}
	public void setLoginPagePassword() {
		login_password.sendKeys("bharvi1010");
	}
	public void verifyLoginPageLoginBtn(){
		Assert.assertTrue(login_btn.isDisplayed(),"login btn is not displayed");
		login_btn.click();
	}
	public void verifyLoginPageForgotPassword(){
		Assert.assertTrue(login_forgotPassword.isDisplayed(),"forgot password link is not displayed");
	}
	public void verifyLoginPageFooterlinkSize(){
        Assert.assertEquals(login_footerlink.size(), 31);
	}
	
	
	
	
	
	
	
	
	
	
	
}
