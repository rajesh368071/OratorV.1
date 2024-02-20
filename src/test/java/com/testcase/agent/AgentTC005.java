package com.testcase.agent;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;

public class AgentTC005 extends AllScenario {
	
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
		routedchat.clickOpenCardInfo();
		
		String card_name = fakedata.getSubString(routedchat.getUserDetails("1"));
		String card_email = fakedata.getSubString(routedchat.getUserDetails("2"));
		
		log.info(card_name+" "+card_email);
		
		assertEquals(card_name, firstname);
		assertEquals(card_email, email);
		
	}

}
