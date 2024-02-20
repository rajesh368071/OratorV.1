package com.testcase.agent;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Map;

public class AgentTC011 extends AllScenario {
	
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
		
		routedchat.clickTicket();
		String subject = fakedata.getQuery();
		routedchat.enterTicketSubject(subject);
		WaitForElementToBeVisible(routedchat.L_ticket_category);
		routedchat.selectCategory(map.get("Category").toString());
		WaitForElementToBeVisible(routedchat.L_ticket_description);
		routedchat.enterTicketDescription(fakedata.getQuery());
		routedchat.clickSubmit();
		
		assertEquals(ToastDisplayed("Ticket created successfully"), true);
		
	}

}
