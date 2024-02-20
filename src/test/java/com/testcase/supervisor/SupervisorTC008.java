package com.testcase.supervisor;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Map;


public class SupervisorTC008 extends AllScenario {
	
	public void verify(Map<Object, Object> map) throws IOException, InterruptedException, AWTException {
		
		OpenTabAndLaunchURL(1, configloader().getProperty("EnduserURL"));
		webchat.clickChat();
		webchat.clickChatWithUs();
		
		String firstname = fakedata.getFirstName();
		String email = fakedata.getEmail();
		
		webchat.enterFirstName(firstname);
		webchat.enterEmail(email);
		webchat.clickSubmit();
		//WebChat Ends
		
		//Agent
		SwitchToTab(0);
		routedchat.clickQuickActionAccept(firstname);
		routedchat.enterMyChatSearch(firstname);
		routedchat.clickOpenArrow(firstname);
		String message = fakedata.getMessage();
		routedchat.enterMessage(message);
		routedchat.clickSend();
		//Agent End
		
		//Supervisor Login
		OpenTabAndLaunchURL(2, configloader().getProperty("GeneralURL"));
		login.enterUsername(configloader().getProperty("Supervisor_UserName"));
		login.enterPassword(configloader().getProperty("Supervisor_Password"));
		login.enterCaptcha();
		login.clickLogin();
		supervisorChat.clickOpenChatIcon(firstname);
		Thread.sleep(2000);
		assertEquals(ElementDisplayed(supervisorChat.L_brakein), true);
		
		supervisorChat.clickBrakeIn();
		assertEquals(ElementDisplayed(routedchat.L_enter_message), true);
		
		ToastDisplayed("Supervisor break in... ");
		
		SwitchToTab(0);
	}

}
