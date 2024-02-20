package com.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class UserManagementPage extends Base_Class {
	
	//Locators
	public By L_user_management_title = By.xpath("(//div[normalize-space()='User List'])[2]");
	public By L_pwdgenerate_popup = By.xpath("//div[@id='toast-container']//div[contains(text(),'Password Updated')]");
	public By L_tooltip = By.xpath("//mat-tooltip-component/div[contains(text(),'The users of the application across various roles are listed here.')]");
	
	//Events
	public By L_user_management_menu = By.xpath("//span[contains(text(),'User Management')]");
	public void clickUserManagementMenu() {
		try {
			click(L_user_management_menu);
			ExtentTestManager.getTest().log(Status.PASS, "User Management Menu Option Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "User Management Menu Option Not Clicked");
		}
	}
	
	
	public By L_search = By.xpath("//input[@placeholder='Search']");
	public void enterSearch(String search) {
		try {
			input(L_search, search);
			clickSearch();
			ExtentTestManager.getTest().log(Status.PASS, "Search Value Entered");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Search Value Not Entered");
		}
	}
	
	
	public By L_search_icon = By.xpath("//img[@src='assets/images/icon-search.svg']");
	public void clickSearch() {
		try {
			click(L_search_icon);
			ExtentTestManager.getTest().log(Status.PASS, "Search Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Search Button Not Clicked");
		}
	}
	
	
	public By L_new_user = By.xpath("//span[contains(normalize-space(),'New User')]");
	public void clickNewUser() {
		try {
			click(L_new_user);
			ExtentTestManager.getTest().log(Status.PASS, "New User Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "New User Button Not Clicked");
		}
	}
	
	public By L_firstname = By.xpath("//input[@data-placeholder='First Name']");
	public void enterFirstName(String firstname) {
		try {
			input(L_firstname, firstname);
			ExtentTestManager.getTest().log(Status.PASS, "First Name Entered");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "First Name Not Entered");
		}
	}
	
	public By L_lastname = By.xpath("//input[@data-placeholder='Last name']");
	public void enterLastName(String lastname) {
		try {
			input(L_lastname, lastname);
			ExtentTestManager.getTest().log(Status.PASS, "Last Name Entered");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Last Name Not Entered");
		}
	}
	
	public By L_email = By.xpath("//input[@data-placeholder='Email id']");
	public void enterEmail(String email) {
		try {
			input(L_email, email);
			ExtentTestManager.getTest().log(Status.PASS, "Email Entered");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Email Not Entered");
		}
	}
	
	public By L_phone = By.xpath("//input[@id='phone']");
	public void enterPhone(String phone) {
		try {
			input(L_phone, phone);
			ExtentTestManager.getTest().log(Status.PASS, "Phone Entered");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Phone Not Entered");
		}
	}
	
	public By L_role_dropdown = By.xpath("(//mat-select)[1]");
	public void selectRole(String option) {
		By L_role = By.xpath("//mat-option//span[contains(normalize-space(),'"+option+"')]");
		try {
			click(L_role_dropdown);
			click(L_role);
			ExtentTestManager.getTest().log(Status.PASS, "Role Selected");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Role Not Selected");
		}
	}
	
	public By L_group_dropdown = By.xpath("(//mat-select)[2]");
	public void selectGroup(String option) {
		By L_group = By.xpath("//mat-option//span[contains(normalize-space(),'"+option+"')]");
		try {
			click(L_group_dropdown);
			click(L_group);
			ExtentTestManager.getTest().log(Status.PASS, "Group Selected");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Group Not Selected");
		}
	}
	
	public By L_businesshours_dropdown = By.xpath("(//mat-select)[3]");
	public void selectBusinessHours(String option) {
		By L_businesshours = By.xpath("//mat-option//span[contains(normalize-space(),'"+option+"')]");
		try {
			click(L_businesshours_dropdown);
			click(L_businesshours);
			ExtentTestManager.getTest().log(Status.PASS, "Business Hours Selected");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Business Hours Not Selected");
		}
	}
	
	
	public By L_holidaygroup_dropdown = By.xpath("(//mat-select)[4]");
	public void selectHolidayGroup(String option) {
		By L_holidaygroup = By.xpath("//mat-option//span[contains(normalize-space(),'"+option+"')]");
		try {
			click(L_holidaygroup_dropdown);
			click(L_holidaygroup);
			ExtentTestManager.getTest().log(Status.PASS, "Holiday Group Selected");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Holiday Group Not Selected");
		}
	}
	
	
	public By L_cancel = By.xpath("//div[.='Cancel'] | //div[@class='btn btn__decline']");
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
	
	public By L_user_active_input= By.xpath("(//input[@role='switch'])[1]");
	public By L_user_active = By.xpath("(//span[@class='mat-slide-toggle-bar'])[1]");
	public void clickStatus() {
		try {
			click(L_user_active);
			ExtentTestManager.getTest().log(Status.PASS, "Status Toggle Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Status Toggle Button Not Clicked");
		}
	}
	
	public By L_reset_icon = By.xpath("//img[@src='assets/images/key.svg']");
	public void clickResetPassword() {
		try {
			click(L_reset_icon);
			ExtentTestManager.getTest().log(Status.PASS, "Reset Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Reset Button Not Clicked");
		}
	}
	
	public By L_reset_check = By.xpath("//mat-checkbox");
	public void clickPasswordGenerate() {
		try {
			click(L_reset_check);
			ExtentTestManager.getTest().log(Status.PASS, "Generate Password Check Box Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Generate Password Check Box Not Clicked");
		}
	}
	
	
	
	public void clickEdit(String firstname) {
		By L_edit = By.xpath("(//td[contains(normalize-space(),'"+firstname+"')]/../td)[last()]//button");
		try {
			click(L_edit);
			ExtentTestManager.getTest().log(Status.PASS, "Edit Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Edit Button Not Clicked");
		}
	}
	
	public static boolean userDisplayed(String firstname) throws InterruptedException {
		Boolean flag = false;
		By L_table_data = By.xpath("//td[contains(normalize-space(),'"+firstname+"')]");
		try {
			WaitForElementToBeVisible(L_table_data);
			WebElement element = driver.findElement(L_table_data);
			flag = element.isDisplayed();
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (flag) {
			ExtentSuccessMessage("Search User Displayed");
			return flag;
		} else {
			ExtentSuccessMessage("Search User Not Displayed");
			flag = false;
		}
		
		return flag;
	}
	
	
	public By L_active_conformation_yes = By.xpath("//div[@class='btn btn__accept']");
	public void clickStatusConformation() {
		try {
			click(L_active_conformation_yes);
			ExtentTestManager.getTest().log(Status.PASS, "Conformation Yes Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Conformation Yes Button Not Clicked");
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
	
	public By L_field_error = By.xpath("//mat-error");
	
	
}
