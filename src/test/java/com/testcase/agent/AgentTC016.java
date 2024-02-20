package com.testcase.agent;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Map;

public class AgentTC016 extends AllScenario {
	
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
		
		routedchat.clickEscalate();
		routedchat.selectEscalationSupervisor(map.get("SupervisorName").toString());
		routedchat.selectEscalationCategory(map.get("Category").toString());
		routedchat.selectEscalationSubCategory(map.get("Sub_Category").toString());
		routedchat.enterComment("Escalating Chat to Specific Supervisor");
		routedchat.clickSubmit();
		
		assertEquals(ToastDisplayed("Chat escalated successfully..."), true);
		
	}

}
