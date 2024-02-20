package com.testcase.admin;

import static org.testng.Assert.assertEquals;

public class AdminTC033 extends AllScenario {
	
	public void verifyFAQEdit() throws InterruptedException {
		
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
		
		faqbank.clickEdit(question);
		String editQuestion = question + " (Review)";
		clear(faqbank.L_faq_question);
		faqbank.enterFaqQuestion(editQuestion);
		faqbank.clickSubmit();
		
		assertEquals(ToastDisplayed("Update Successfully"), true);
		
		clear(faqbank.L_search);
		faqbank.enterSearch(editQuestion);
		
		assertEquals(faqbank.faqDisplayed(editQuestion), true);
		
	}

}
