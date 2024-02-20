package com.testcase.admin;

import static org.testng.Assert.assertEquals;

public class AdminTC007 extends AllScenario {
	
	public void verifyInfoDisplayed() throws InterruptedException {
		
		usermanagement.clickUserManagementMenu();
		
		WaitForElementToBeVisible(usermanagement.L_user_management_title);
		
		usermanagement.hoverInfo();
		
		assertEquals(ElementDisplayed(usermanagement.L_tooltip), true);
	}
	
}
