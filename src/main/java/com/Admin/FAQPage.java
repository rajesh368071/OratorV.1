package com.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class FAQPage extends Base_Class {
	
	//Locators
	public By L_faq_title = By.xpath("//div[text()=' FAQ']");
	public By L_tooltip = By.xpath("//mat-tooltip-component/div[contains(text(),'Now you can configure the FAQs available to end users easily from this page.')]");

	//Events
	
	public By L_faq_sub_option = By.xpath("//span[contains(text(),'FAQ Bank')]");
	public void clickFAQBankMenu() {
		try {
			click(L_faq_sub_option);
			ExtentTestManager.getTest().log(Status.PASS, "FAQ Bank Menu Option Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "FAQ Bank Menu Option Not Clicked");
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
	
	public By L_add_new = By.xpath("//span[normalize-space()='New FAQ']");
	public void clickAddNew() {
		try {
			click(L_add_new);
			ExtentTestManager.getTest().log(Status.PASS, "Add New Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Add New Button Not Clicked");
		}
	}
	
	public By L_faq_question = By.xpath("//input[@data-placeholder='Enter Question']");
	public void enterFaqQuestion(String question) {
		try {
			input(L_faq_question, question);
			ExtentTestManager.getTest().log(Status.PASS, "FAQ Question Entered");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "FAQ Question Not Entered");
		}
	}
	
	public By L_faq_answer = By.xpath("//textarea[@data-placeholder='Answer']");
	public void enterFaqAnswer(String answer) {
		try {
			input(L_faq_answer, answer);
			ExtentTestManager.getTest().log(Status.PASS, "FAQ Answer Entered");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "FAQ Answer Not Entered");
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
	
	public void clickEdit(String question) {
		By L_edit_icon = By.xpath("//div[normalize-space()='"+question+"']/..//mat-icon[.='edit']");
		try {
			click(L_edit_icon);
			ExtentTestManager.getTest().log(Status.PASS, "Edit Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Edit Button Not Clicked");
		}
	}
	
	public static boolean faqDisplayed(String question) throws InterruptedException {
		Boolean flag = false;
		By L_table_data = By.xpath("//div[normalize-space()='"+question+"']");
		try {
			WaitForElementToBeVisible(L_table_data);
			WebElement element = driver.findElement(L_table_data);
			flag = element.isDisplayed();
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (flag) {
			ExtentSuccessMessage("Search FAQ Displayed");
			return flag;
		} else {
			ExtentSuccessMessage("Search FAQ Not Displayed");
			flag = false;
		}
		
		return flag;
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
