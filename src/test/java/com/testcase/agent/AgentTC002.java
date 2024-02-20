package com.testcase.agent;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;

public class AgentTC002 extends AllScenario {
	
	public void verifyChatRequestReceived() throws IOException, InterruptedException, AWTException {
		
		//WebChat Start
		OpenTabAndLaunchURL(1, configloader().getProperty("EnduserURL"));
		webchat.clickChat();
		webchat.clickChatWithUs();
		
		String firstname = fakedata.getFirstName();
		
		webchat.enterFirstName(firstname);
		webchat.enterEmail(fakedata.getEmail());
		webchat.clickSubmit();
		//WebChat Ends
		
		
		//Agent
		SwitchToTab(0);
		routedchat.clickQuickActionDecline(firstname);
		routedchat.enterRoutedChatSearch(firstname);
		routedchat.clickRoutedChatRequest(firstname);
		routedchat.enterMyChatSearch(firstname);
		
		assertEquals(routedchat.userDisplayed(firstname, 2), true);
		
	}

}
