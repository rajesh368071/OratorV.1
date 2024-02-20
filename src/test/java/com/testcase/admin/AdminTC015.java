package com.testcase.admin;

import static org.testng.Assert.assertEquals;

public class AdminTC015 extends AllScenario {
	
	public void verifyQuickReplyTooltip() throws InterruptedException {
		
		commonoption.clickSetting();
		commonoption.clickChat();
		
		quickreply.clickQuickReplyMenu();
		
		WaitForElementToBeVisible(quickreply.L_quick_reply_title);
		
		quickreply.hoverInfo();
	
		assertEquals(ElementDisplayed(quickreply.L_info), true);
		
	}

}
