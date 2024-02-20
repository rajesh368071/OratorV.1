package com.Admin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class QuickReplyPage extends Base_Class {
	
	//Locator
	public By L_quick_reply_title = By.xpath("//div[@mattooltip='The canned responses which allows the user to type a short name, fetch and send immediate replies while chatting.']");
	
	
	//Event
	
	public By L_quick_reply_menu = By.xpath("(//span[contains(normalize-space(),'Quick Replies')])[2]");
	public void clickQuickReplyMenu() {
		try {
			click(L_quick_reply_menu);
			ExtentTestManager.getTest().log(Status.PASS, "Quick Reply Menu Option Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Quick Reply Menu Option Not Clicked");
		}
	}
	
	public By L_new_quick_reply = By.xpath("//span[normalize-space()='New Quick Reply']");
	public void clickNewQuickReply() {
		try {
			click(L_new_quick_reply);
			ExtentTestManager.getTest().log(Status.PASS, "New Quick Reply Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "New Quick Reply Button Not Clicked");
		}
	}
	
	public By L_quick_reply = By.xpath("//input[@data-placeholder='Quick Reply']");
	public void enterQuickReply(String quickreply) {
		try {
			input(L_quick_reply, quickreply);
			ExtentTestManager.getTest().log(Status.PASS, "Quick Reply Entered");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Quick Reply Not Entered");
		}
	}
	
	public By L_short_name = By.xpath("//input[@class='mat-chip-input mat-input-element']");
	public void enterShortName(List<String> shortnames) {
		try {
			for (String shortname : shortnames) {
				input(L_short_name, shortname);
				input(L_short_name, ",");
			}
			ExtentTestManager.getTest().log(Status.PASS, "Short Name Entered");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Short Name Not Entered");
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
	
	public static boolean quickReplyDisplayed(String quickreply) throws InterruptedException {
		Boolean flag = false;
		By L_table_data = By.xpath("//td[contains(normalize-space(),'"+quickreply+"')]");
		try {
			WaitForElementToBeVisible(L_table_data);
			WebElement element = driver.findElement(L_table_data);
			flag = element.isDisplayed();
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (flag) {
			ExtentSuccessMessage("Search Quick Reply Displayed");
			return flag;
		} else {
			ExtentSuccessMessage("Search Quick Reply Not Displayed");
			flag = false;
		}
		
		return flag;
	}
	

	
}
