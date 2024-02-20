package com.testcase.admin;

import static org.testng.Assert.assertEquals;

public class AdminTC034 extends AllScenario {
	
	public void verifyFAQSearchWorks() throws InterruptedException {
		
		commonoption.clickSetting();
		commonoption.clickGeneral();
		commonoption.clickFAQMenu();
		
		faqbank.clickFAQBankMenu();
		
		WaitForElementToBeVisible(faqbank.L_faq_title);
		
		faqbank.clickAddNew();
		String question = "Facing Issue in Network?";
		faqbank.enterFaqQuestion(question);
		faqbank.enterFaqAnswer("Change the Connection and Update to Top Speed");
		faqbank.clickSubmit();
		
		assertEquals(ToastDisplayed("Created Successfully"), true);
		
		faqbank.enterSearch(question);
		
		assertEquals(faqbank.faqDisplayed(question), true);
	}

}
