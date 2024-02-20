package com.Admin;

import org.openqa.selenium.By;

import com.BasePackage.Base_Class;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class ConfigurationPage extends Base_Class {
	
	public By L_configuration_title = By.xpath("(//div[normalize-space()='Configuration'])[2]");
	
	public By L_configuration_menu = By.xpath("//span[contains(text(),'Configuration')]");
	public void clickConfigurationMenu() {
		try {
			click(L_configuration_menu);
			ExtentTestManager.getTest().log(Status.PASS, "Configuration Menu Option Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Configuration Menu Option Not Clicked");
		}
	}
	
	public By L_emoji_edit = By.xpath("(//td[.=' Emoji ']/..//td)[3]//button");
	public void clickEmojiEdit() {
		try {
			click(L_emoji_edit);
			ExtentTestManager.getTest().log(Status.PASS, "Emoji Edit Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Emoji Edit Not Clicked");
		}
	}
	
	public By L_emoji_switch = By.xpath("//div[@class='switch-button']");
	public By L_emoji_switch_input = By.xpath("//input[@type='checkbox']")
;	public void clickEmojiSwitch() {
		try {
			click(L_emoji_switch);
			ExtentTestManager.getTest().log(Status.PASS, "Emoji Switch Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Emoji Switch Not Clicked");
		}
	}
	
	public By L_filesize_input = By.xpath("(//td[.=' Attachment max size(in MB) ']/..//td)[2]//input[@type='text']");
	public void enterFileSize(String size) {
		try {
			input(L_filesize_input, size);
			ExtentTestManager.getTest().log(Status.PASS, "File Size Entered");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "File Size Not Entered");
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
