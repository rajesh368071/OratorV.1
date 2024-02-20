package com.testcase.agent;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Map;

public class AgentTC013 extends AllScenario {
	
	
	public void verify(Map<Object, Object> map) throws InterruptedException, AWTException, IOException {

		//enduser
		OpenTabAndLaunchURL(1, configloader().getProperty("EnduserURL"));
		webchat.clickChat();
		webchat.clickChatWithUs();

		String firstname = fakedata.getFirstName();
		String email = fakedata.getEmail();
		webchat.enterFirstName(firstname);
		webchat.enterEmail(email);
		webchat.clickSubmit();
		//enduser end
		
		//Agent
		SwitchToTab(0);
		routedchat.clickQuickActionAccept(firstname);
		routedchat.enterMyChatSearch(firstname);
		routedchat.clickOpenArrow(firstname);
		String message = map.get("Keyword").toString();
		routedchat.enterMessage(message);
		clear(routedchat.L_enter_message);
		routedchat.enterMessage(message);
		String quickReplyText = GetElementText(routedchat.L_quickreplyoption);
		routedchat.clickQuickReply();
		routedchat.clickSend();
		//Agent End
		
		SwitchToTab(1);
		SwitchToFrame();
		ScrollUntilElementVisible(webchat.L_message);
		String quickReplyMessageText = GetElementText(webchat.L_message);
			
		assertEquals(quickReplyMessageText, quickReplyText);
		
		SwitchToTab(0);
		
	}

}
