package com.testcase.admin;

import static org.testng.Assert.assertEquals;

public class AdminTC014 extends AllScenario {
	
	public void verifyQuickReplyUpdate() throws InterruptedException {
		
		commonoption.clickSetting();
		commonoption.clickChat();
		
		quickreply.clickQuickReplyMenu();
		quickreply.clickNewQuickReply();
		String quickreplyname = fakedata.getRandomWord();
		quickreply.enterQuickReply(quickreplyname);
		quickreply.enterShortName(fakedata.getShortNames(3));
		quickreply.clickSubmit();
		
		ToastDisplayed("Quick Reply Created");
		
		quickreply.clickEdit(quickreplyname);
		String quickreplyedit = fakedata.getRandomWord();
		clear(quickreply.L_quick_reply);
		quickreply.enterQuickReply(quickreplyedit);
		quickreply.clickSubmit();
		
		assertEquals(ToastDisplayed("Quick Reply Updated"), true);
		
		assertEquals(quickreply.quickReplyDisplayed(quickreplyedit), true);
		
		
	}

}
