package com.Supervisor;

import org.openqa.selenium.By;

import com.BasePackage.Base_Class;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class ChatPage extends Base_Class {
	
	//Locators
	public By L_card_name = By.xpath("//app-supervisor-chat-ui//div[@class='chat__userName']");
	public By L_user_request = By.xpath("//div[@class='knowledge__body ng-star-inserted']//div[@class='chat__userProfile']/div[contains(., 'Ruby')]");
	public By L_escalated_chat_pop_up = By.xpath("//div[@class='escalated__wrapper ng-star-inserted']//div[@class='chat__userName']");
	
	//Events
	public void clickEscalatedChatOpen(String firstname) {
		By L_escalate_chat_open = By.xpath("//div[@class='escalated__wrapper ng-star-inserted']//div[contains(text(),'"+firstname+"')]/../../../..//mat-icon");	
		try {
			click(L_escalate_chat_open);
			ExtentTestManager.getTest().log(Status.PASS, "Escalated Chat Open Icon Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Escalated Chat Open Icon Not Clicked");
		}
	}
	
	public By verifyChatStatus(String firstname, String status) {
		By L_chat_status = By.xpath("//div[@class='knowledge__body ng-star-inserted']//div[@class='chat__userProfile']/div[contains(., '"+firstname+"')]/../../../..//div[contains(., '"+status+"')]");
		String message = "User "+ firstname + "with Status "+status;
		try {
			ElementDisplayed(L_chat_status);
			ExtentTestManager.getTest().log(Status.PASS, message+" Displayed");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, message+" Not Displayed");
		}
		return L_chat_status;
	}
	
	public By L_all = By.xpath("(//span[contains(text(), 'All')])[2]/following-sibling::mat-icon");
	public void clickAll() {
		try {
			click(L_all);
			ExtentTestManager.getTest().log(Status.PASS, "All Tab Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "All Tab Not Clicked");
		}
	}
	
	public By L_close = By.xpath("//button[.='Closed']");
	public void clickClose() {
		try {
			click(L_close);
			ExtentTestManager.getTest().log(Status.PASS, "Closed Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Close Button Not Clicked");
		}
	}
	
	public By L_missed = By.xpath("//button[.='Missed']");
	public void clickMissed() {
		try {
			click(L_missed);
			ExtentTestManager.getTest().log(Status.PASS, "Missed Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Missed Button Not Clicked");
		}
	}
	
	public By L_escalate = By.xpath("//button[.='Escalated']");
	public void clickEscalate() {
		try {
			click(L_escalate);
			ExtentTestManager.getTest().log(Status.PASS, "Escalated Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Escalated Button Not Clicked");
		}
	}
	
	public By L_inProgress = By.xpath("//button[.='Inprogress']");
	public void clickInProgress() {
		try {
			click(L_inProgress);
			ExtentTestManager.getTest().log(Status.PASS, "InProgress Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "InProgress Button Not Clicked");
		}
	}
	
	
	public void clickOpenChatIcon(String firstname) {
		By L_escalate_chat_open = By.xpath("//div[@class='knowledge__body ng-star-inserted']//div[@class='chat__userProfile']/div[contains(., '"+firstname+"')]/../../../..//div[contains(.,'select_all')]");	
		try {
			click(L_escalate_chat_open);
			ExtentTestManager.getTest().log(Status.PASS, "Chat Open Icon Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Chat Open Icon Not Clicked");
		}
	}
	
	public By L_brakein = By.xpath("//span[.='Break In']");
	public void clickBrakeIn() {
		try {
			click(L_brakein);
			ExtentTestManager.getTest().log(Status.PASS, "Break In Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Break In Button Not Clicked");
		}
	}

}
