package com.testcase.admin;

import static org.testng.Assert.assertEquals;

import java.util.Map;

public class AdminTC003 extends AllScenario {
	
	
	
	public void verifyCreatedUserDisplayedInTable(Map<Object, Object> testdata) throws InterruptedException {
		
		AdminTC002 createuser = new AdminTC002();
		String firstname = createuser.verifyCreateNewUserPopUp(testdata);
		
		usermanagement.enterSearch(firstname);
		
		assertEquals(usermanagement.userDisplayed(firstname), true);
	
	}
	
}
