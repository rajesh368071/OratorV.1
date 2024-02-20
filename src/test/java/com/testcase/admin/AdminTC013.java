package com.testcase.admin;

import static org.testng.Assert.assertEquals;

public class AdminTC013 extends AllScenario {
	
	public void verifyNewQuickReplyCreated() throws InterruptedException {
		
		commonoption.clickSetting();
		commonoption.clickChat();
		
		quickreply.clickQuickReplyMenu();
		quickreply.clickNewQuickReply();
		String quickreplyname = fakedata.getRandomWord();
		quickreply.enterQuickReply(quickreplyname);
		quickreply.enterShortName(fakedata.getShortNames(3));
		quickreply.clickSubmit();
		
		assertEquals(ToastDisplayed("Quick Reply Created"), true);
		
		assertEquals(quickreply.quickReplyDisplayed(quickreplyname), true);
		
		
	}

}
