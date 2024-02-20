package com.common;

import org.openqa.selenium.By;

import com.BasePackage.Base_Class;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class LoginPage extends Base_Class {
	
	//Locators
	public By L_invald_captcha = By.xpath("//div[normalize-space()='Invalid captcha']");
	public By L_captcha_refresh = By.xpath("//mat-icon[.='refresh']");
	
	
	//Events
	public By L_username = By.xpath("//input[@name='username']");
	public void enterUsername(String username) {
		try {
			input(L_username, username);
			ExtentTestManager.getTest().log(Status.PASS, "Username Entered");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Username Not Entered");
		}
	}
	
	public By L_password = By.xpath("//input[@name='password']");
	public void enterPassword(String password) {
		try {
			input(L_password, password);
			ExtentTestManager.getTest().log(Status.PASS, "Password Entered");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Password Not Entered");
		}
	}
	
	public By L_captcha = By.xpath("//span[@class='captcha-text']");
	public By L_captcha_input = By.xpath("//input[@data-placeholder='Enter code here']");
	public void enterCaptcha() {
		try {
			String captcha = FindElementText(L_captcha);
			input(L_captcha_input, captcha);
			ExtentTestManager.getTest().log(Status.PASS, "Captcha Entered");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Captcha Not Entered");
		}
	}
	
	public By L_login = By.xpath("//button[.='Login']");
	public void clickLogin() {
		try {
			click(L_login);
			ExtentTestManager.getTest().log(Status.PASS, "Login Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Login Button Not Clicked");
		}
	}

}
