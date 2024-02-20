package com.testcase.admin;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;

public class AdminTC019 extends AllScenario {
	
	public void verifyOpeningMessage() throws IOException, InterruptedException, AWTException {
		
		String openingMessage = "Hello there, thank you for visiting.";
		
		commonoption.clickSetting();
		commonoption.clickGeneral();
		commonoption.clickForms();
		welcome.clickWelcomePageMenu();
		
		WaitForElementToBeVisible(welcome.L_welcome_page_title);
		
		welcome.enterOpeningMessage(openingMessage);
		welcome.clickSubmit();
		ToastDisplayed("Data updated successfully.");
		
		//Open Tab and Launch EndUser URL
		OpenTabAndLaunchURL(1, configloader().getProperty("EnduserURL"));
		webchat.clickChat();
		
		assertEquals(GetElementText(webchat.L_message), openingMessage);
		
		SwitchToTab(0);

	}

}
