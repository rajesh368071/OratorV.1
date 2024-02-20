package com.testcase.admin;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;

public class AdminTC023 extends AllScenario {
	
	public void verifyGoAnonymousNotDisplayed() throws IOException, InterruptedException, AWTException {
		
		commonoption.clickSetting();
		commonoption.clickGeneral();
		commonoption.clickForms();
		welcome.clickWelcomePageMenu();
		
		WaitForElementToBeVisible(welcome.L_welcome_page_title);
		
		if(!isCheckBoxChecked(welcome.L_datacapture_checkbox_input)) {
			welcome.clickDataCaptureCheckBox();
		}
		
		if(isCheckBoxChecked(welcome.L_goanonymous_checkbox_input)) {
			welcome.clickGoAnonymousCheckBox();
		}
		
		welcome.clickSubmit();
		ToastDisplayed("Data updated successfully.");
		
		OpenTabAndLaunchURL(1, configloader().getProperty("EnduserURL"));
		webchat.clickChat();
		webchat.clickChatWithUs();
		
		assertEquals(NegativeElementDisplayed(webchat.L_go_anonymous), false);
		
		SwitchToTab(0);
	}

}
