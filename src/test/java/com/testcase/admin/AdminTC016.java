package com.testcase.admin;

import static org.testng.Assert.assertEquals;

public class AdminTC016 extends AllScenario {
	
	public void verifyWelcomePageDisplaye() throws InterruptedException {
		
		commonoption.clickSetting();
		commonoption.clickGeneral();
		commonoption.clickForms();
		
		welcome.clickWelcomePageMenu();
		
		WaitForElementToBeVisible(welcome.L_welcome_page_title);
		Thread.sleep(3000);;
		boolean isDisplayed = ElementDisplayed(welcome.L_welcome_page_title);
		assertEquals(isDisplayed, true);
		
	}

}
