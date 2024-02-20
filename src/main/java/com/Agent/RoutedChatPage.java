package com.Agent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class RoutedChatPage extends Base_Class {
	
	//Locators
	public By L_card_message = By.xpath("(//span[@class='ng-star-inserted'])[last()]");
	public By L_closing_user = By.xpath("//app-closing-chat//div[@class='chat__userName']");
	
	//Events
	public void clickQuickActionAccept(String firstname) throws InterruptedException {
		Thread.sleep(2000);
		try {
			By L_quick_action_acept = By.xpath("(//div[@class='chat__userName'][normalize-space()='"+firstname+"'])[1]/../../../../../..//div[@class='btn btn__accept']");
			click(L_quick_action_acept);
			ExtentTestManager.getTest().log(Status.PASS, "Quick Action Accept Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Quick Action Accept Button Not Clicked");
		}
	}
	
	public void clickQuickActionDecline(String firstname) {
		try {
			By L_quick_action_acept = By.xpath("(//div[@class='chat__userName'][normalize-space()='"+firstname+"'])[1]/../../../../../..//div[@class='btn btn__decline']");
			click(L_quick_action_acept);
			ExtentTestManager.getTest().log(Status.PASS, "Quick Action Accept Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Quick Action Accept Button Not Clicked");
		}
	}
	
	public By L_routedchat_search = By.xpath("//div[@id='list-1']//mat-icon[@role='img'][normalize-space()='search']");
	public By L_routedchat_search_input = By.xpath("//div[@id='list-1']//input[@placeholder='Search']");
	public void enterRoutedChatSearch(String firstname) {
		try {
			click(L_routedchat_search);
			input(L_routedchat_search_input, firstname);
			ExtentTestManager.getTest().log(Status.PASS, "Clicked and Entered Search");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Not Clicked and Entered Search");
		}
	}
	
	
	public void clickRoutedChatRequest(String firstname) {
		try {
			By L_routedchat_request = By.xpath("//div[@id='list-1']//div[@class='chat__userProfile']/div[contains(text(),'"+firstname+"')]");
			jsClick(L_routedchat_request);
			ExtentTestManager.getTest().log(Status.PASS, "Clicked Specific Request in Routed Chat");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Not Clicked Specific Request in Routed Chat");
		}
	}
	
	public static boolean userDisplayed(String firstname, int section) throws InterruptedException {
		Boolean flag = false;
		By L_table_data = By.xpath("//div[@id='list-"+section+"']//div[@class='chat__userProfile']/div[contains(text(),'"+firstname+"')]");
		try {
			WaitForElementToBeVisible(L_table_data);
			WebElement element = driver.findElement(L_table_data);
			flag = element.isDisplayed();
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (flag) {
			ExtentSuccessMessage("Search User Displayed "+L_table_data);
			return flag;
		} else {
			ExtentErrorMessage("Search User Not Displayed "+L_table_data);
			flag = false;
		}
		
		return flag;
	}
	
	
	public By L_mychat_search = By.xpath("//div[@id='list-2']//mat-icon[@role='img'][normalize-space()='search']");
	public By L_mychat_search_input = By.xpath("//div[@id='list-2']//input[@placeholder='Search']");
	public void enterMyChatSearch(String firstname) {
		try {
			click(L_mychat_search);
			input(L_mychat_search_input, firstname);
			ExtentTestManager.getTest().log(Status.PASS, "Clicked and Entered Search");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Not Clicked and Entered Search");
		}
	}
	
	public void clickOpenArrow(String firstname) {
		try {
			By arrow = By.xpath("(//div[@id='list-2']//div[@class='chat__userName'][normalize-space()='"+firstname+"']/../../../../..//mat-icon[normalize-space()='subdirectory_arrow_right'])[1]");
			click(arrow);
			ExtentTestManager.getTest().log(Status.PASS, "Chat Open Arrow Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.PASS, "Chat Open Arrow Not Clicked");
		}
	}
	
	By L_card_info = By.xpath("//img[@src='assets/images/tooltip.svg']");
	public void clickOpenCardInfo() {
		try {
			click(L_card_info);
			ExtentTestManager.getTest().log(Status.PASS, "Open Card Info Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Open Card Info Not Clicked");
		}
	}
	
	
	public By L_detail_close = By.xpath("//div[@class='chat__userHistory ng-star-inserted']/button");
	public void clickDetailClose() {
		try {
			click(L_detail_close);
			ExtentTestManager.getTest().log(Status.PASS, "Close Icon Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Close Icon Not Clicked");
		}
	}
	
	public By L_enter_message = By.xpath("//input[@placeholder='Enter your chat']");
	public void enterMessage(String message) {
		try {
			input(L_enter_message, message);
			ExtentTestManager.getTest().log(Status.PASS, "Message Entered");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Message Not Entered");
		}
	}
	
	public By L_send = By.xpath("//img[@src='assets/images/send_icon.svg']");
	public void clickSend() {
		try {
			click(L_send);
			ExtentTestManager.getTest().log(Status.PASS, "Send Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Send Button Not Clicked");
		}
	}
	
	public String getUserDetails(String index) {
		By L_user_details = By.xpath("(//div[@class='chat__userHistory ng-star-inserted']//div[@class='chat__userIdentity ng-star-inserted'])["+index+"]");
		return GetElementText(L_user_details);
	}
	
	
	public By L_action = By.xpath("//span[contains(normalize-space(),'Actions')]");
	public By L_escalation = By.xpath("//button[normalize-space()='Escalate']");
	public void clickEscalate() {
		try {
			click(L_action);
			click(L_escalation);
			ExtentTestManager.getTest().log(Status.PASS, "Escalate Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Escalate Not Clicked");
		}
	}
	
	public By L_close = By.xpath("//button[normalize-space()='Close']");
	public void clickClose() {
		try {
			click(L_action);
			click(L_close);
			ExtentTestManager.getTest().log(Status.PASS, "Escalate Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Escalate Not Clicked");
		}
	}
	
	
	public By L_close_category = By.xpath("(//mat-select)[1]");
	public void selectCategory(String category) {
		try {
			By L_category_opt = By.xpath("//span[contains(normalize-space(),'"+category+"')]");
			click(L_close_category);
			click(L_category_opt);
			ExtentTestManager.getTest().log(Status.PASS, "Category Selected");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, " Category Not Selected");
		}
	}
	
	public By L_close_sub_category = By.xpath("(//mat-select)[2]");
	public void selectSubCategory(String subCategory) {
		try {
			By L_sub_category_opt = By.xpath("//span[contains(normalize-space(),'"+subCategory+"')]");
			click(L_close_sub_category);
			click(L_sub_category_opt);
			ExtentTestManager.getTest().log(Status.PASS, "Sub Category Selected");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Sub Category Not Selected");
		}
	}
	
	public By L_close_comment = By.xpath("//textarea");
	public void enterComment(String comment) {
		try {
			input(L_close_comment, comment);
			ExtentTestManager.getTest().log(Status.PASS, "Comment Entered");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Comment Not Entered");
		}
	}
	
	public By L_submit = By.xpath("//div[@class='btn btn__accept']");
	public void clickSubmit() {
		try {
			click(L_submit);
			ExtentTestManager.getTest().log(Status.PASS, "Submit Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Submit Not Clicked");
		}
	}
	
	public By L_chathistory_search = By.xpath("//h2[normalize-space()='Chat History']/../../../..//div[@class='search']");
	public By L_chathistory_search_input = By.xpath("//div[@class='chat__column ng-star-inserted']//div//app-my-supervised-chats//input[@placeholder='Search']");
	public void enterChatHistorySearch(String firstname) {
		try {
			click(L_chathistory_search);
			input(L_chathistory_search_input, firstname);
			ExtentTestManager.getTest().log(Status.PASS, "Clicked and Entered Search");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Not Clicked and Entered Search");
		}
	}
	
	public By L_mail = By.xpath("(//app-my-supervised-chats//mat-icon[contains(., ' mail_outline')])[1]");
	public void clickMail() {
		try {
			click(L_mail);
			ExtentTestManager.getTest().log(Status.PASS, "Mail Icon Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Mail Icon Not Clicked");
		}
	}
	
	public By L_share = By.xpath("//span[normalize-space()='Share']");
	public void clickShare() {
		try {
			click(L_share);
			ExtentTestManager.getTest().log(Status.PASS, "Share Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Share Button Not Clicked");
		}
	}
	
	public By L_transcript_mail = By.xpath("//textarea");
	public void enterTranscriptMail(String mail) {
		try {
			input(L_transcript_mail, mail);
			ExtentTestManager.getTest().log(Status.PASS, "Transcript Mail Entered");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Transcript Mail Not Entered");
		}
	}
	
	public By L_transfer = By.xpath("//mat-icon[normalize-space()='call_made']");
	public void clickTransfer() {
		try {
			click(L_transfer);
			ExtentTestManager.getTest().log(Status.PASS, "Transfer Icon Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Transfer Icon Not Clicked");
		}
	}
	
	public By L_ticket_icon = By.xpath("//mat-icon[normalize-space()='edit']");
	public void clickTicket() {
		try {
			click(L_ticket_icon);
			ExtentTestManager.getTest().log(Status.PASS, "Ticket Icon Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Ticket Icon Not Clicked");
		}
	}
	
	public By L_ticket_subject = By.xpath("(//textarea)[1]");
	public void enterTicketSubject(String subject) {
		try {
			input(L_ticket_subject, subject);
			ExtentTestManager.getTest().log(Status.PASS, "Subject Entered");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Subject Not Entered");
		}
	}
	
	public By L_ticket_category = By.xpath("(//mat-select)[1]");
	public void selectTicketCategory(String category) {
		try {
			By L_ticket_category_opt = By.xpath("(//mat-option//span[contains(normalize-space(),'"+category+"')])[1]");
			click(L_ticket_category);
			click(L_ticket_category_opt);
			ExtentTestManager.getTest().log(Status.PASS, "Category Selected");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Category Not Selected");
		}
	}
	
	public By L_ticket_description = By.xpath("(//textarea)[2]");
	public void enterTicketDescription(String description) {
		try {
			input(L_ticket_description, description);
			ExtentTestManager.getTest().log(Status.PASS, "Description Entered");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Description Not Entered");
		}
	}
	
	public By L_preview = By.xpath("//mat-icon[normalize-space()='sms']");
	public By L_preview_message = By.xpath("//div[@class='quickrpl__container']/div");
	public void clickPreview() {
		try {
			click(L_preview);
			ExtentTestManager.getTest().log(Status.PASS, "Preview Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Preview Not Clicked");
		}
	}
	
	public By L_quickreplyoption = By.xpath("(//div[contains(@class,'btn quickrpl__elements ng-star-inserted')])[1]");
	public void clickQuickReply() {
		try {
			click(L_quickreplyoption);
			ExtentTestManager.getTest().log(Status.PASS, "Quick Reply Selected");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Quick Reply Not Selected");
		}
	}
	
	public By L_card_view = By.xpath("//span[contains(normalize-space(),'Card view')]");
	public void clickCardView() {
		try {
			click(L_card_view);
			ExtentTestManager.getTest().log(Status.PASS, "Card View Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Card View Button Not Clicked");
		}
	}
	
	public By L_escalation_select_supervisor = By.xpath("(//mat-select)[1]");
	public void selectEscalationSupervisor(String supervisor) {
		try {
			By L_escalation_supervisor_opt = By.xpath("//span[contains(normalize-space(),'"+supervisor+"')]");
			click(L_escalation_select_supervisor);
			click(L_escalation_supervisor_opt);
			ExtentTestManager.getTest().log(Status.PASS, "Supervisor Selected");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Supervisor Not Selected");
		}
	}
	
	public By L_escalation_category = By.xpath("(//mat-select)[2]");
	public void selectEscalationCategory(String category) {
		try {
			By L_escalation_category_opt = By.xpath("//span[contains(normalize-space(),'"+category+"')]");
			click(L_escalation_category);
			click(L_escalation_category_opt);
			ExtentTestManager.getTest().log(Status.PASS, "Escalation Category Selected");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Escalation Category Not Selected");
		}
	}
	
	public By L_escalation_sub_category = By.xpath("(//mat-select)[3]");
	public void selectEscalationSubCategory(String subCategory) {
		try {
			By L_sub_category_opt = By.xpath("//span[contains(normalize-space(),'"+subCategory+"')]");
			click(L_escalation_sub_category);
			click(L_sub_category_opt);
			ExtentTestManager.getTest().log(Status.PASS, "Escalation Sub Category Selected");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Escalation Sub Category Not Selected");
		}
	}
	
	
}
