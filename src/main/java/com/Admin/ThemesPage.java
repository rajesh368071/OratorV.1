package com.Admin;

import org.openqa.selenium.By;

import com.BasePackage.Base_Class;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class ThemesPage extends Base_Class {
	
	public By L_system = By.xpath("(//span[contains(normalize-space(),'System')])[2]");
	public void clickSystem() {
		try {
			click(L_system);
			ExtentTestManager.getTest().log(Status.PASS, "System Menu Option Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "System Menu Option Not Clicked");
		}
	}
	
	public By L_theme = By.xpath("(//span[contains(normalize-space(),'Theme')])[2]");
	public void clickTheme() {
		try {
			click(L_theme);
			ExtentTestManager.getTest().log(Status.PASS, "Theme Menu Option Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Theme Menu Option Not Clicked");
		}
	}
	
	public void clickSelectTheme(String value) {
		By L_select_theme = By.xpath("(//img[@src='./assets/images/eye.svg'])["+value+"]");
		try {
			click(L_select_theme);
			ExtentTestManager.getTest().log(Status.PASS, "Theme Radio Option Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Theme Radio Option Not Clicked");
		}
	}
	
	public By L_apply_theme = By.xpath("//div[.='Apply Theme']");
	public void clickApplyTheme() {
		try {
			click(L_apply_theme);
			ExtentTestManager.getTest().log(Status.PASS, "Apply Theme clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Apply Theme Not clicked");
		}
	}
	
	
	
	public By L_brand_file = By.xpath("//input[@type='file']");
	public void uploadBrandLogo(String filepath) {
		try {
			UploadFile(L_brand_file, filepath);
			ExtentTestManager.getTest().log(Status.PASS, "Brand Logo File Uploaded");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Brand Logo File Not Uploaded");
		}
	}
	
	public By L_apply_changes = By.xpath("//div[@class='btn btn__accept']");
	public void clickApplyChanges() {
		try {
			click(L_apply_changes);
			ExtentTestManager.getTest().log(Status.PASS, "Apply Changes clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Apply Changes Not clicked");
		}
	}
	
	

}
