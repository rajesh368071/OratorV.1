package com.testcase.admin;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;

public class AdminTC026 extends AllScenario {
	
	public void verifyClickwrapContentSame() throws IOException, InterruptedException, AWTException {
		
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
		
		ScrollUntilElementVisible(welcome.L_clickwrap_message);
		
		welcome.enterClickWrapText("Accept Terms and Conditions");
		welcome.clickSubmit();
		ToastDisplayed("Data updated successfully.");
		
		OpenTabAndLaunchURL(1, configloader().getProperty("EnduserURL"));
		webchat.clickChat();
		webchat.clickChatWithUs();
		webchat.clickInfoWrap();
		
		assertEquals(GetElementText(webchat.L_wrapbox), "Accept Terms and Conditions");
		
		SwitchToTab(0);
		
		welcome.clickWrapCheckBox();
		welcome.clickSubmit();
		ToastDisplayed("Data updated successfully.");
		
	}

}
