package com.testcase.admin;

import static org.testng.Assert.assertEquals;

public class AdminTC005 extends AllScenario {
	
	public void verifyGeneratePassword() throws InterruptedException {
		AdminTC001 admintc001 = new AdminTC001();
		admintc001.verifyUserManagementDisplayed();
		
		usermanagement.clickResetPassword();
		usermanagement.clickPasswordGenerate();
		
		assertEquals(ToastDisplayed("Password Updated"), true);
		
		usermanagement.clickCancel();
	}

}
