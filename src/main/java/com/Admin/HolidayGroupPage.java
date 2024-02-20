package com.Admin;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;

import com.BasePackage.Base_Class;
import com.Utility.Log;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class HolidayGroupPage extends Base_Class {
	
	//Locators, Holiday Group Created
	public By L_holiday_group_title = By.xpath("(//div[normalize-space()='Holiday Group'])[2]");
	public By L_tooltip = By.xpath("//mat-tooltip-component/div[contains(text(),'The regional holidays are grouped to clusters and the users are mapped to the Holiday groups.')]");
	

	//Events
	public By L_holidaygroup_menu = By.xpath("//span[contains(text(),'Holiday')]");
	public void clickHolidayGroupMenu() {
		try {
			click(L_holidaygroup_menu);
			ExtentTestManager.getTest().log(Status.PASS, "Holiday Group Menu Option Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Holiday Group Menu Option Not Clicked");
		}
	}
	
	public By L_new = By.xpath("//span[contains(normalize-space(),'New')]");
	public void clickNew() {
		try {
			click(L_new);
			ExtentTestManager.getTest().log(Status.PASS, "New Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "New Button Not Clicked");
		}
	}
	
	public By L_name = By.xpath("//input[@formcontrolname='name']");
	public void enterName(String name) {
		try {
			input(L_name, name);
			ExtentTestManager.getTest().log(Status.PASS, "Name Entered");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Name Not Entered");
		}
	}
	
	public By L_region_field = By.xpath("//mat-select[@formcontrolname='region']");
	public void selectRegion(String option) {
		By L_region_field_option = By.xpath("//mat-option/span[contains(normalize-space(),'"+option+"')]");
		try {
			click(L_region_field);
			click(L_region_field_option);
			ExtentTestManager.getTest().log(Status.PASS, "Region Selected");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Region Not Selected");
		}
	}
	
	public By L_role_field = By.xpath("//mat-select[@formcontrolname='role']");
	public void selectRole(List<String> options) {
		try {
			click(L_role_field);
			for (String option : options) {
				By L_role_field_option = By.xpath("//mat-option/span[contains(normalize-space(),'"+option+"')]");
				click(L_role_field_option);
			}
			Thread.sleep(2000);
			MouseClick(By.xpath("//h3[normalize-space()='Add Holiday Group']"));
			ExtentTestManager.getTest().log(Status.PASS, "Role Selected");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Role Not Selected");
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
	
	
	public void searchInTable(String name) {
		try {
			By record = By.xpath("//td[normalize-space()='"+name+"']");
			By pagesRange = By.xpath("//div[@class='mat-paginator-range-label']");
			Thread.sleep(4000);
			String pages = GetElementText(pagesRange);
			//System.out.println(pages);
			int page = Integer.parseInt(pages.substring(pages.lastIndexOf(" ")+1));
			
			//System.out.println(page+" "+page/2);
			for(int i=0; i<page/2; i++) {
				if(!RecordDisplayed(record)){
					clickNextPage();
					Thread.sleep(1000);
				}
				Thread.sleep(1000);
			}
			
			ExtentTestManager.getTest().log(Status.PASS, "Created Data Displayed");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Created Data Not Displayed");
		}
	}
	
	public void clickEdit(String holidayName) {
		By L_edit = By.xpath("//td[normalize-space()='"+holidayName+"']/../td[5]//button[contains(.,'edit')]");
		try {
			click(L_edit);
			ExtentTestManager.getTest().log(Status.PASS, "Submit Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Submit Button Not Clicked");
		}
	}
	
	public By L_next_page = By.xpath("//button[@aria-label='Next page']");
	public void clickNextPage() {
		try {
			ScrollUntilElementVisible(L_next_page);
			click(L_next_page);
			ExtentTestManager.getTest().log(Status.PASS, "Next Page Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Next Page Not Clicked");
		}
	}
	
	public void getPage() throws InterruptedException {
		By pagesRange = By.xpath("//div[@class='mat-paginator-range-label']");
		Thread.sleep(4000);
		String pages = GetElementText(pagesRange);
		
		int page = Integer.parseInt(pages.substring(pages.lastIndexOf(" ")+1));
		System.out.print(page);
		for(int i=0; i<page/9; i++) {
			clickNextPage();
			Thread.sleep(1000);
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

}
