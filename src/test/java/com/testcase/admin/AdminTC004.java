package com.testcase.admin;

import static org.testng.Assert.assertEquals;

public class AdminTC004 extends AllScenario {
	
	public void verifyStatusChangePopUp() throws InterruptedException {
		
		AdminTC001 admintc001 = new AdminTC001();
		admintc001.verifyUserManagementDisplayed();
		
		boolean before = isCheckBoxChecked(usermanagement.L_user_active_input);
		
		usermanagement.clickStatus();
		usermanagement.clickStatusConformation();
		
		assertEquals(ToastDisplayed("User Status Updated"), true);

		if(before) {
			assertEquals(isCheckBoxChecked(usermanagement.L_user_active_input), false);
		} else {
			assertEquals(isCheckBoxChecked(usermanagement.L_user_active_input), true);
		}
		
	}
	
}
