package com.common;

import org.openqa.selenium.By;

import com.BasePackage.Base_Class;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class AdminCommonPage extends Base_Class {
	
	public By L_setting_menu = By.xpath("//span[normalize-space()='Settings']");
	public void clickSetting() {
		try {
			click(L_setting_menu);
			ExtentTestManager.getTest().log(Status.PASS, "Setting Menu Option Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Setting Menu Option Not Clicked");
		}
	}
	
	public By L_chat_menu = By.xpath("//span[normalize-space()='Chat']");
	public void clickChat() {
		try {
			click(L_chat_menu);
			ExtentTestManager.getTest().log(Status.PASS, "Chat Menu Option Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Chat Menu Option Not Clicked");
		}
	}
	
	public By L_general_menu = By.xpath("//span[normalize-space()='General']");
	public void clickGeneral() {
		try {
			click(L_general_menu);
			ExtentTestManager.getTest().log(Status.PASS, "General Menu Option Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "General Menu Option Not Clicked");
		}
	}
	
	public By L_forms_option = By.xpath("//span[contains(text(),'Forms')]");
	public void clickForms() {
		try {
			click(L_forms_option);
			ExtentTestManager.getTest().log(Status.PASS, "Forms Menu Option Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Forms Menu Option Not Clicked");
		}
	}
	
	public By L_faq_option = By.xpath("(//span[contains(text(),'FAQ')])[1]");
	public void clickFAQMenu() {
		try {
			click(L_faq_option);
			ExtentTestManager.getTest().log(Status.PASS, "FAQ Menu Option Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "FAQ Menu Option Not Clicked");
		}
	}
	
	
}
