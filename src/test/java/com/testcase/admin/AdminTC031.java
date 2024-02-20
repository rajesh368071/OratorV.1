package com.testcase.admin;

import static org.testng.Assert.assertEquals;

public class AdminTC031 extends AllScenario {
	
	public void verifyFAQBankPageDisplayed() throws InterruptedException {
		
		commonoption.clickSetting();
		commonoption.clickGeneral();
		commonoption.clickFAQMenu();
		
		faqbank.clickFAQBankMenu();
		
		WaitForElementToBeVisible(faqbank.L_faq_title);
		
		assertEquals(ElementDisplayed(faqbank.L_faq_title), true);
		
	}

}
