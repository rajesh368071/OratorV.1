package com.Agent;

import org.openqa.selenium.By;

import com.BasePackage.Base_Class;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class ReviewBoardPage extends Base_Class {
	
	//Locators
	public By L_chatresolutiontime_tooltip = By.xpath("//mat-tooltip-component/div[contains(text(),'Now you can configure the FAQs available to end users easily from this page.')]");
	
	//Events
	public By L_review_bord = By.xpath("//span[contains(text(),'Review Board')]");
	public void clickReviewBord() {
		try {
			click(L_review_bord);
			ExtentTestManager.getTest().log(Status.PASS, "Review Board Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Review Board Not Clicked");
		}
	}
	
	public By L_chat_analystics = By.xpath("//span[.='Chat Analytics']");
	public void clickChatAnalystics() {
		try {
			click(L_chat_analystics);
			ExtentTestManager.getTest().log(Status.PASS, "Chat Analystics Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Chat Analystics Not Clicked");
		}
	}
	
	public By L_cx_metrics = By.xpath("//span[.='CX Metrics']");
	public void clickCXMetrics() {
		try {
			click(L_cx_metrics);
			ExtentTestManager.getTest().log(Status.PASS, "Chat Analystics Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Chat Analystics Not Clicked");
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
