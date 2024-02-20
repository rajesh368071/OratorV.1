package com.Admin;


import org.openqa.selenium.By;

import com.BasePackage.Base_Class;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class WelcomePage extends Base_Class {
	
	//Locators
	public By L_welcome_page_title = By.xpath("(//div[contains(text(),'Welcome Page')])[1]");
	public By L_firstname = By.xpath("//td//input[@id='fieldName_1']");
	
	//Events
	public By L_welcomepage_menu = By.xpath("//span[contains(text(),'Welcome Page')]");
	public void clickWelcomePageMenu() {
		try {
			click(L_welcomepage_menu);
			ExtentTestManager.getTest().log(Status.PASS, "Welcome Page Menu Option Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Welcome Page Menu Option Not Clicked");
		}
	}
	
	public By L_faq_checkbox_input = By.xpath("//input[@id='mat-checkbox-1-input']");
	public By L_faq_checkbox = By.xpath("(//mat-checkbox)[1]");
	public void clickFAQCheckBox() {
		try {
			click(L_faq_checkbox);
			ExtentTestManager.getTest().log(Status.PASS, "FAQ Check Box Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "FAQ Check Box Not Clicked");
		}
	}
	
	public By L_opening_message = By.xpath("(//div[@class='ck ck-editor__main'])[1]");
	public void enterOpeningMessage(String openingmessage) {
		try {
			jsEnter(L_opening_message, openingmessage);
			ExtentTestManager.getTest().log(Status.PASS, "Opening Message Entered");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Opening Message Not ntered");
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
	
	public void clickEdit(String quickreplyname) {
		By L_edit_icon = By.xpath("//td[normalize-space()='"+quickreplyname+"']/../td[3]//button");
		try {
			click(L_edit_icon);
			ExtentTestManager.getTest().log(Status.PASS, "Edit Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Edit Button Not Clicked");
		}
	}
	
	public By L_info = By.xpath("//img[@src='assets/images/tooltip.svg']");
	public void hoverInfo() {
		try {
			MouseHoverOnElement(L_info);
			ExtentTestManager.getTest().log(Status.PASS, "Info Hovered");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Info Not Hovered");
		}
	}
	
	public By L_datacapture_checkbox_input = By.xpath("//input[@id='mat-checkbox-2-input']");
	public By L_datacapture_checkbox = By.xpath("(//mat-checkbox)[2]");
	public void clickDataCaptureCheckBox() {
		try {
			click(L_datacapture_checkbox);
			ExtentTestManager.getTest().log(Status.PASS, "Data Capture Checkbox Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Data Capture Checkbox Not Clicked");
		}
	}
	
	public By L_goanonymous_checkbox_input = By.xpath("//input[@id='mat-checkbox-4-input']");
	public By L_goanonymous_checkbox = By.xpath("(//mat-checkbox)[4]//span[contains(text(),'Enable Go Anonymous option')]");
	public void clickGoAnonymousCheckBox() {
		try {
			click(L_goanonymous_checkbox);
			ExtentTestManager.getTest().log(Status.PASS, "Go Anonymous Checkbox Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Go Anonymous Checkbox Not Clicked");
		}
	}
	
	public By L_clickwrap_checkbox_input = By.xpath("//input[@id='mat-checkbox-5-input']");
	public By L_clickwrap_checkbox = By.xpath("(//mat-checkbox)[5]//span[contains(text(),'Include clickwrap agreement')]");
	public void clickWrapCheckBox() {
		try {
			click(L_clickwrap_checkbox);
			ExtentTestManager.getTest().log(Status.PASS, "Clickwrap Checkbox Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Clickwrap Checkbox Not Clicked");
		}
	}

	public By L_add_field = By.xpath("(//img[@src='assets/images/add.svg'])[last()]");
	public void clickAddIcon() {
		try {
			click(L_add_field);
			ExtentTestManager.getTest().log(Status.PASS, "Add Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Add Button Not Clicked");
		}
	}
	
	public By L_new_field_name = By.xpath("(//td//input[@data-placeholder='Text'])[last()]");
	public void enterFieldName(String fieldname) {
		try {
			input(L_new_field_name, fieldname);
			ExtentTestManager.getTest().log(Status.PASS, "Field Name Entered");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Field Name Not Entered");
		}
	}
	
	public By L_new_field_type = By.xpath("(//td//mat-select)[last()]");
	public void selectFieldType(String fieldtype) {
		By L_field_type_option = By.xpath("//mat-option/span[contains(text(),'"+fieldtype+"')]");
		try {
			click(L_new_field_type);
			click(L_field_type_option);
			ExtentTestManager.getTest().log(Status.PASS, "Field Type Selected");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Field Type Not Selected");
		}
	}
	
	public By L_delete_icon = By.xpath("(//td//img[@src='assets/images/delete.svg'])[last()]");
	public void clickDeleteIcon() {
		try {
			click(L_delete_icon);
			ExtentTestManager.getTest().log(Status.PASS, "Delete Icon Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Delete Icon Not Clicked");
		}
	}
	
	public By L_clickwrap_message = By.xpath("(//div[@class='ck ck-editor__main'])[2]");
	public void enterClickWrapText(String clickwrapmessage) {
		try {
			jsEnter(L_clickwrap_message, clickwrapmessage);
			ExtentTestManager.getTest().log(Status.PASS, "clickWrap Entered");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "clickWrap Not Entered");
		}
	}

}
