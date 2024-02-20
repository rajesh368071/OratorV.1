package com.testcase.admin;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;

import com.Utility.Log;

public class AdminTC017 extends AllScenario {
	
	public void verifyFAQIsDisplayedIfEnabled() throws IOException, InterruptedException, AWTException {
		
		commonoption.clickSetting();
		commonoption.clickGeneral();
		commonoption.clickForms();
		welcome.clickWelcomePageMenu();
		
		WaitForElementToBeVisible(welcome.L_welcome_page_title);
		
		if(!isCheckBoxChecked(welcome.L_faq_checkbox_input)) {
			welcome.clickFAQCheckBox();
		}
		
		welcome.clickSubmit();
		assertEquals(ToastDisplayed("Data updated successfully."), true);
		
		//Open Tab and Launch EndUser URL
		OpenTabAndLaunchURL(1, configloader().getProperty("EnduserURL"));
		webchat.clickChat();
		
		
		assertEquals(ElementDisplayed(webchat.L_faq), true);
		
		SwitchToTab(0);
		
	}

}
