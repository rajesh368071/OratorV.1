package com.testcase.agent;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;

public class AgentTC007 extends AllScenario {
	
	public void verify() throws IOException, InterruptedException, AWTException {
		
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
		//Agent End
		
		//Enduser
		SwitchToTab(1);
		SwitchToFrame();
		String message = fakedata.getMessage();
		webchat.enterMessage(message);
		WaitForElementToBeVisible(webchat.L_send);
		webchat.clickSend();
		//Enduser end
		
		//Agent
		SwitchToTab(0);
		Thread.sleep(2000);
		assertEquals(GetElementText(routedchat.L_card_message), message);
		
	}

}
