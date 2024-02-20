package com.testcase.admin;

import static org.testng.Assert.assertEquals;

public class AdminTC001 extends AllScenario {
	
	public void verifyUserManagementDisplayed() throws InterruptedException {
		
		usermanagement.clickUserManagementMenu();
		//aca acsdc
		WaitForElementToBeVisible(usermanagement.L_user_management_title);
		
		assertEquals(ElementDisplayed(usermanagement.L_user_management_title), true);
		
	}
	
}
