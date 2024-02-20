package com.common;

import org.openqa.selenium.By;

import com.BasePackage.Base_Class;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class ProfilePage extends Base_Class{
	
	public By L_username_menu = By.xpath("//div[@class='user__name']");
	public void clickUsernameDropdown() {
		try {
			click(L_username_menu);
			ExtentTestManager.getTest().log(Status.PASS, "Username Menu Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Username Menu Not Clicked");
		}
	}
	
	
	public By L_profile = By.xpath("//button[normalize-space()='Profile']");
	public void clickProfileOption() {
		try {
			click(L_profile);
			ExtentTestManager.getTest().log(Status.PASS, "Profile Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Profile Not Clicked");
		}
	}
	
	public By L_logout = By.xpath("//button[normalize-space()='Logout']");
	public void clickLogout() {
		try {
			click(L_logout);
			ExtentTestManager.getTest().log(Status.PASS, "Logout Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Logout Not Clicked");
		}
	}
	
	public By L_change_password = By.xpath("//button[normalize-space()='Change Password']");
	public void clickChangePassword() {
		try {
			click(L_change_password);
			ExtentTestManager.getTest().log(Status.PASS, "Change Password Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Change Password Not Clicked");
		}
	}
	
	public By L_old_password = By.xpath("//input[@formcontrolname='oldPassword']");
	public void enterOldPassword(String oldPassword) {
		try {
			input(L_old_password, oldPassword);
			ExtentTestManager.getTest().log(Status.PASS, "Old Password Entered");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Old Password Not Entered");
		}
	}
	
	public By L_new_password = By.xpath("//input[@formcontrolname='newPassword']");
	public void enterNewPassword(String newPassword) {
		try {
			input(L_new_password, newPassword);
			ExtentTestManager.getTest().log(Status.PASS, "New Password Entered");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "New Password Not Entered");
		}
	}
	
	public By L_conform_password = By.xpath("//input[@formcontrolname='confirmPassword']");
	public void enterConformPassword(String conformPassword) {
		try {
			input(L_conform_password, conformPassword);
			ExtentTestManager.getTest().log(Status.PASS, "Conform Password Entered");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Conform Password Not Entered");
		}
	}
	
	public By L_cancel = By.xpath("//div[.='Cancel']");
	public void clickCancel() {
		try {
			click(L_cancel);
			ExtentTestManager.getTest().log(Status.PASS, "Cancel Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Cancel Button Not Clicked");
		}
	}
	
	public By L_submit = By.xpath("//div[.='Submit']");
	public void clickSubmit() {
		try {
			click(L_submit);
			ExtentTestManager.getTest().log(Status.PASS, "Submit Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Submit Button Not Clicked");
		}
	}

}
