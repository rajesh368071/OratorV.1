package com.testcase.agent;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;

public class AgentTC006 extends AllScenario {
	
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
		
		String message = fakedata.getMessage();
		routedchat.enterMessage(message);
		routedchat.clickSend();
		//Agent End
		
		//Enduser
		SwitchToTab(1);
		SwitchToFrame();
		assertEquals(GetElementText(webchat.L_message), message);
		//Enduser end
		
		//Agent
		SwitchToTab(0);
		
	}

}
