package com.testcase.admin;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;

import com.Utility.Log;

public class AdminTC021 extends AllScenario {
	
	public void verifyDataCaptureNotDisplayed() throws IOException, InterruptedException, AWTException {
		
		commonoption.clickSetting();
		commonoption.clickGeneral();
		commonoption.clickForms();
		welcome.clickWelcomePageMenu();
		
		WaitForElementToBeVisible(welcome.L_welcome_page_title);
		
		if(isCheckBoxChecked(welcome.L_datacapture_checkbox_input)) {
			welcome.clickDataCaptureCheckBox();
			Log.info("Check Box Unchecked");
		}
		
		if(!isCheckBoxChecked(welcome.L_goanonymous_checkbox_input)) {
			welcome.clickGoAnonymousCheckBox();
		}
		
		clear(welcome.L_firstname);
		input(welcome.L_firstname, "First Name");
		
		welcome.clickSubmit();
		ToastDisplayed("Data updated successfully.");
		
		OpenTabAndLaunchURL(1, configloader().getProperty("EnduserURL"));
		webchat.clickChat();
		webchat.clickChatWithUs();
		
		assertEquals(NegativeElementDisplayed(webchat.L_firstname), false);
		
		SwitchToTab(0);
		
		welcome.clickDataCaptureCheckBox();

	}

}
