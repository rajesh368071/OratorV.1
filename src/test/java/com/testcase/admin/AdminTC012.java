package com.testcase.admin;

import static org.testng.Assert.assertEquals;

public class AdminTC012 extends AllScenario {
	
	public void verifyQuickReplyDisplayed() throws InterruptedException {
		
		commonoption.clickSetting();
		commonoption.clickChat();
		
		quickreply.clickQuickReplyMenu();
		
		assertEquals(ElementDisplayed(quickreply.L_quick_reply_title), true);
	}
	
}
