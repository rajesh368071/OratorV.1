package com.Admin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class CategoryPage extends Base_Class {
	
	//Locators
	public By L_category_title = By.xpath("//div[@mattooltip='Categories and sub-categories enable segregating the chats while closing and escalating.']");
	public By L_tooltip = By.xpath("//mat-tooltip-component/div[contains(text(),'Categories and sub-categories enable segregating the chats while closing and escalating.')]");
	
	//Events
	public By L_category_menu = By.xpath("(//span[contains(normalize-space(),'Categories')])[2]");
	public void clickCategory() {
		try {
			click(L_category_menu);
			ExtentTestManager.getTest().log(Status.PASS, "Category Menu Option Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Category Menu Option Not Clicked");
		}
	}
	
	public By L_new_category = By.xpath("//span[.='New Category']");
	public void clickNewCategory() {
		try {
			click(L_new_category);
			ExtentTestManager.getTest().log(Status.PASS, "New Category Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "New Category Button Not Clicked");
		}
	}
	
	public By L_category_name = By.xpath("//input[@data-placeholder='New Category']");
	public void enterCategoryName(String categoryname) {
		try {
			input(L_category_name, categoryname);
			ExtentTestManager.getTest().log(Status.PASS, "Category Name Entered");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Category Name Not Entered");
		}
	}
	
	
	public By L_sub_category = By.xpath("//input[@class='mat-chip-input mat-input-element']");
	public void enterSubCategoryName(List<String> list) {
		Log.info(list.toString());
		try {
			for (String word : list) {
				input(L_sub_category, word);
				input(L_sub_category, ",");
			}
			ExtentTestManager.getTest().log(Status.PASS, "Sub Category Entered");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Sub Category Not Entered");
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
	
	public void clickEdit(String businessName) {
		By L_edit_icon = By.xpath("(//td[contains(.,'"+businessName+"')]/following-sibling::td)[last()]//button");
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
	

	public static boolean categoryDisplayed(String category) throws InterruptedException {
		Boolean flag = false;
		By L_table_data = By.xpath("//td[contains(normalize-space(),'"+category+"')]");
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
	
}
