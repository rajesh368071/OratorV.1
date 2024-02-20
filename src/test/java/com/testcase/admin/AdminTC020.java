package com.testcase.admin;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;

import com.Utility.Log;

public class AdminTC020 extends AllScenario {
	
	public void verifyDataCaptureFormDisplayedIfEnabled() throws InterruptedException, IOException, AWTException {
		
		commonoption.clickSetting();
		commonoption.clickGeneral();
		commonoption.clickForms();
		welcome.clickWelcomePageMenu();
		
		WaitForElementToBeVisible(welcome.L_welcome_page_title);
		
		if(!isCheckBoxChecked(welcome.L_datacapture_checkbox_input)) {
			welcome.clickDataCaptureCheckBox();
			Log.info("Check Box checked");
		}
		
		if(isCheckBoxChecked(welcome.L_goanonymous_checkbox_input)) {
			welcome.clickGoAnonymousCheckBox();
		}
		
		clear(welcome.L_firstname);
		input(welcome.L_firstname, "First Name");
		
		welcome.clickSubmit();
		ToastDisplayed("Data updated successfully.");
		
		OpenTabAndLaunchURL(1, configloader().getProperty("EnduserURL"));
		webchat.clickChat();
		webchat.clickChatWithUs();
		
		assertEquals(ElementDisplayed(webchat.L_firstname), true);
		
		SwitchToTab(0);
		
	}

}
