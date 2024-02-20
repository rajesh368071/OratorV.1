package com.testcase.agent;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;

public class AgentTC014 extends AllScenario {
	
	public String raiseChatRequest() throws IOException, InterruptedException, AWTException {
		OpenTabAndLaunchURL(1, configloader().getProperty("EnduserURL"));
		webchat.clickChat();
		webchat.clickChatWithUs();

		String firstname = fakedata.getFirstName();
		String email = fakedata.getEmail();
		webchat.enterFirstName(firstname);
		webchat.enterEmail(email);
		webchat.clickSubmit();
		
		return firstname;
	}
	
	public void acceptRequest(String firstname) throws InterruptedException {
		SwitchToTab(0);
		routedchat.clickQuickActionAccept(firstname);
	}
	
	public void verify() throws InterruptedException, AWTException, IOException {
		
		String name1 = raiseChatRequest();
		acceptRequest(name1);
		
		String name2 = raiseChatRequest();
		acceptRequest(name2);
		
		routedchat.clickCardView();
		
		assertEquals(ElementsDisplayed(By.xpath("//div[@class='chat__userName']")), true);
		
	}

}
