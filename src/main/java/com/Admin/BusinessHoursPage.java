package com.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class BusinessHoursPage extends Base_Class {
	
	public By L_tooltip = By.xpath("//mat-tooltip-component/div[contains(text(),'The chat routing mechanism is controlled by taking into consideration the working hours and the users are mapped to the various Business Hour Groups.')]");
	
	public By L_business_hours_menu = By.xpath("(//span[contains(normalize-space(),'Business Hours')])[2]");
	public void clickBusinessHoursMenu() {
		try {
			click(L_business_hours_menu);
			ExtentTestManager.getTest().log(Status.PASS, "Business Hours Menu Option Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Business Hours Menu Option Not Clicked");
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
	
	public By L_new_business_hours = By.xpath("//span[contains(normalize-space(),'New Business Hours')]");
	public void clickNew() {
		try {
			click(L_new_business_hours);
			ExtentTestManager.getTest().log(Status.PASS, "New Business Hours Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "New Business Hours Button Not Clicked");
		}
	}
	
	public By L_business_hours_group  = By.xpath("//input[@data-placeholder='Enter Business Hour Group']");
	public void enterBusinessHoursGroup(String value) {
		try {
			input(L_business_hours_group, value);
			ExtentTestManager.getTest().log(Status.PASS, "Enter Business Hours Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Enter Business Hours Button Not Clicked");
		}
	}
	
	public By L_time_zone_field = By.xpath("//mat-select[@formcontrolname='timeZone']");
	public void selectTimeZone(String option) {
		By L_time_zone_option = By.xpath("//mat-option/span[contains(normalize-space(),'"+option+"')]");
		try {
			click(L_time_zone_field);
			click(L_time_zone_option);
			ExtentTestManager.getTest().log(Status.PASS, "Time Zone Selected");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Time Zone Not Selected");
		}
	}
	
	public By L_status_field = By.xpath("//mat-select[@formcontrolname='status']");
	public void selectStatus(String option) {
		By L_status_option = By.xpath("//mat-option/span[text()=normalize-space('"+option+"')]");
		try {
			click(L_status_field);
			click(L_status_option);
			ExtentTestManager.getTest().log(Status.PASS, "Status Selected");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Status Not Selected");
		}
	}
	
	public By L_start_time  = By.xpath("//input[@formcontrolname='startTime']");
	public void enterStartTime(String value) {
		try {
			input(L_start_time, value);
			ExtentTestManager.getTest().log(Status.PASS, "Start Time Entered");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Start Time Not Entered");
		}
	}
	
	public By L_end_time  = By.xpath("//input[@formcontrolname='endTime']");
	public void enterEndTime(String value) {
		try {
			input(L_end_time, value);
			ExtentTestManager.getTest().log(Status.PASS, "End Time Entered");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "End Time Not Entered");
		}
	}
	
	public By L_from = By.xpath("//mat-select[@formcontrolname='from']");
	public void selectFrom(String option) {
		By L_from_option = By.xpath("//mat-option/span[text()=normalize-space('"+option+"')]");
		try {
			click(L_from);
			click(L_from_option);
			ExtentTestManager.getTest().log(Status.PASS, "From Selected");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "From Not Selected");
		}
	}
	
	public By L_to = By.xpath("//mat-select[@formcontrolname='to']");
	public void selectTo(String option) {
		By L_to_option = By.xpath("//mat-option/span[text()=normalize-space('"+option+"')]");
		try {
			click(L_to);
			click(L_to_option);
			ExtentTestManager.getTest().log(Status.PASS, "To Selected");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "To Not Selected");
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
	
	public static boolean businessHoursDisplayed(String companyName) throws InterruptedException {
		Boolean flag = false;
		By L_table_data = By.xpath("//td[contains(text(),normalize-space('"+companyName+"'))]");
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
	
	
	public void clickEdit(String option) {
		By L_edit = By.xpath("(//td[contains(.,'"+option+"')]/following-sibling::td)[last()]//button");
		try {
			click(L_edit);
			ExtentTestManager.getTest().log(Status.PASS, "Edit Selected");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Edit Not Selected");
		}
	}
}
