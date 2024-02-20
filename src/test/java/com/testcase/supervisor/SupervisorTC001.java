package com.testcase.supervisor;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Map;

public class SupervisorTC001 extends AllScenario {
	
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
		//Supervisor End
		
		//Agent Tab
		SwitchToTab(0);
		routedchat.clickEscalate();
		routedchat.selectEscalationSupervisor(map.get("Supervisor").toString());
		routedchat.selectEscalationCategory(map.get("Category").toString());
		routedchat.selectEscalationSubCategory(map.get("SubCategory").toString());
		routedchat.enterComment("Escalating Chat to Specific Supervisor");
		routedchat.clickSubmit();
		ToastDisplayed("Chat escalated successfully...");
		//End Agent
		
		//Supervisor
		SwitchToTab(2);
		assertEquals(GetElementText(supervisorChat.L_escalated_chat_pop_up), firstname);		
		//Supervisor End
		
		SwitchToTab(0);
	}

}
