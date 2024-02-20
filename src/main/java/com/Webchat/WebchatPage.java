package com.Webchat;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class WebchatPage extends Base_Class {
	
	//Locators
	public By L_message = By.xpath("(//div[@class='normal-msg ng-tns-c2144348597-0 ng-star-inserted'])[1]");
	
	
	//Events
	public By L_webchat_btn = By.xpath("//button[@class='openChatBtn']");
	public void clickChat() {
		try {
			click(L_webchat_btn);
			Thread.sleep(1000);
			driver.switchTo().frame(0);
			ExtentTestManager.getTest().log(Status.PASS, "Chat Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Chat Button Not Clicked");
		}
	}
	
	public By L_faq = By.xpath("//button[contains(., 'FAQs')]");
	public void clickFAQ() {
		try {
			click(L_faq);
			ExtentTestManager.getTest().log(Status.PASS, "FAQs Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "FAQs Button Not Clicked");
		}
	}
	
	public By L_faq_option = By.xpath("(//div[@class='service-wrap btnviewsec ng-tns-c3437153413-0 ng-star-inserted']//button)[1]");
	public void clickFAQOption() {
		try {
			click(L_faq_option);
			ExtentTestManager.getTest().log(Status.PASS, "FAQ Option Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "FAQ Option Button Not Clicked");
		}
	}
	
	public By L_chatwithus = By.xpath("//button[.='Chat with an agent']");
	public void clickChatWithUs() {
		try {
			click(L_chatwithus);
			ExtentTestManager.getTest().log(Status.PASS, "Chat With Us Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Chat with Us Button Not Clicked");
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
	
	public By L_email = By.xpath("//input[@data-placeholder='Email']");
	public void enterEmail(String email) {
		try {
			input(L_email, email);
			ExtentTestManager.getTest().log(Status.PASS, "Email Entered");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Email Not Entered");
		}
	}
	
	public By L_submit = By.xpath("//button[.='Submit']");
	public void clickSubmit() {
		try {
			click(L_submit);
			ExtentTestManager.getTest().log(Status.PASS, "Submit Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Submit Button Not Clicked");
		}
	}
	
	
	public By L_emoji = By.xpath("//button[@class='emoji-selector ng-star-inserted']");
	public void clickEmoji() {
		try {
			click(L_emoji);
			ExtentTestManager.getTest().log(Status.PASS, "Emoji Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Emoji Button Not Clicked");
		}
	}
	
	
	public void clickEmojiOption() {
		try {
			for(int emoji=0; emoji<10; emoji++) {
				click(By.xpath("(//ngx-emoji)["+emoji+"]"));	
			}
			ExtentTestManager.getTest().log(Status.PASS, "Emoji Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Emoji Button Not Clicked");
		}
	}
	
	public By L_home = By.xpath("//i[@class='fa fa-home']");
	public void clickHome() {
		try {
			click(L_home);
			ExtentTestManager.getTest().log(Status.PASS, "Home Icon Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Home Icon Not Clicked");
		}
	}
	
	public By L_go_anonymous = By.xpath("//mat-checkbox[@id='goAnonymousCheckBox']");
	public void clickGoAnonymous() {
		try {
			click(L_go_anonymous);
			ExtentTestManager.getTest().log(Status.PASS, "Go Anonymous Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Go Anonymous Not Clicked");
		}
	}
	
	
	public By L_clickwrap = By.xpath("//mat-checkbox[@id='clickWrapCheckBox']");
	public void clickWrap() {
		try {
			click(L_clickwrap);
			ExtentTestManager.getTest().log(Status.PASS, "ClickWrap Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "ClickWrap Not Clicked");
		}
	}
	
	public By L_wrap_info = By.xpath("//img[@src='assets/images/info-Square.svg']");
	public By L_wrapbox = By.xpath("//div[contains(@class,'chat__terms-popup')]//span");
	public void clickInfoWrap() {
		try {
			click(L_wrap_info);
			ExtentTestManager.getTest().log(Status.PASS, "Info Wrap Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Info Wrap Not Clicked");
		}
	}
	
	public By L_message_input = By.xpath("//textarea[@class='chat-input-text']");
	public void enterMessage(String message) {
		try {
			input(L_message_input, message);
			ExtentTestManager.getTest().log(Status.PASS, "Message Entered");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Message Not Entered");
		}
	}
	
	
	public By L_send = By.xpath("//i[@class='fa fa-send send hide ng-star-inserted']");
	public void clickSend() {
		try {
			jsClick(L_send);
			ExtentTestManager.getTest().log(Status.PASS, "Send Button Clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Send Button Not Clicked");
		}
	}
	
	
	public By L_feedback_emoji = By.xpath("//mat-icon[contains(normalize-space(),'sentiment_very_satisfied')]");
	public void clickFeedbackEmoji() {
		try {
			 List<WebElement> total = driver.findElements(L_feedback_emoji);
			for(WebElement ele : total) {
				ele.click();
				Thread.sleep(1000);
			}
			ExtentTestManager.getTest().log(Status.PASS, "Emoji button clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Emoji button not clicked");
		}
	}
	
	
	public By L_feedback_submit = By.xpath("(//button[.='Submit'])[1]");
	public By L_feedback_submission_greeting = By.xpath("(//div[contains(@class,'normal-msg')])[2]");
	public void clickFeedbackSubmit() {
		try {
			click(L_feedback_submit);
			ExtentTestManager.getTest().log(Status.PASS, "Feedback Submit button clicked");
		} catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Feedback Submit button not clicked");
		}
	}
	
	
}
