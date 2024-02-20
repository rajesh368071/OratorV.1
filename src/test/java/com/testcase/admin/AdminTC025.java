package com.testcase.admin;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;

public class AdminTC025 extends AllScenario {
	
	public void verifyClickWrapDisplayed() throws InterruptedException, IOException, AWTException {
		
		commonoption.clickSetting();
		commonoption.clickGeneral();
		commonoption.clickForms();
		welcome.clickWelcomePageMenu();
		
		WaitForElementToBeVisible(welcome.L_welcome_page_title);
		
		if(!isCheckBoxChecked(welcome.L_datacapture_checkbox_input)) {
			welcome.clickDataCaptureCheckBox();
		}
		
		if(!isCheckBoxChecked(welcome.L_clickwrap_checkbox_input)) {
			welcome.clickWrapCheckBox();
		}
		
		welcome.clickSubmit();
		ToastDisplayed("Data updated successfully.");
		
		OpenTabAndLaunchURL(1, configloader().getProperty("EnduserURL"));
		webchat.clickChat();
		webchat.clickChatWithUs();
		
		assertEquals(ElementDisplayed(webchat.L_clickwrap), true);
		
		SwitchToTab(0);
		
		welcome.clickWrapCheckBox();
		
	}

}
