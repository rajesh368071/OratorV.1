package com.testcase.admin;

import static org.testng.Assert.assertEquals;

public class AdminTC035 extends AllScenario {
	
	public void verifyFAQInfo() throws InterruptedException {
		
		commonoption.clickSetting();
		commonoption.clickGeneral();
		commonoption.clickFAQMenu();
		
		faqbank.clickFAQBankMenu();
		
		WaitForElementToBeVisible(faqbank.L_faq_title);
		
		faqbank.hoverInfo();
		
		assertEquals(ElementDisplayed(faqbank.L_tooltip), true);
		
	}

}
