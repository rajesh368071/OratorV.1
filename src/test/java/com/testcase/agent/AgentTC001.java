package com.testcase.agent;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;

public class AgentTC001 extends AllScenario {
	
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
		
		assertEquals(routedchat.userDisplayed(firstname, 1), true);
		
	}

}
