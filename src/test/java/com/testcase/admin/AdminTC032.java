package com.testcase.admin;

import static org.testng.Assert.assertEquals;

public class AdminTC032 extends AllScenario {
	
	public void verifyFAQBankPageDisplayed() throws InterruptedException {
		
		commonoption.clickSetting();
		commonoption.clickGeneral();
		commonoption.clickFAQMenu();
		
		faqbank.clickFAQBankMenu();
		
		WaitForElementToBeVisible(faqbank.L_faq_title);
		
		faqbank.clickAddNew();
		String question = "Facing Issue in Water Heater?";
		faqbank.enterFaqQuestion(question);
		faqbank.enterFaqAnswer("Check Gas Connection, if Perfect, Plz Turn OFF the Water Heater and Turn ON");
		faqbank.clickSubmit();
		
		assertEquals(ToastDisplayed("Created Successfully"), true);
		
		faqbank.enterSearch(question);
		
		assertEquals(faqbank.faqDisplayed(question), true);
		
		
		
	}

}
