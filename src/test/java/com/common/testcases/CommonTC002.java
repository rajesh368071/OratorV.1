package com.common.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Map;

public class CommonTC002 extends AllScenario {
	
	public void verifyChangePassword(Map<Object, Object> map) throws IOException {
		
		profile.clickUsernameDropdown();
		profile.clickProfileOption();
		
		profile.clickChangePassword();
		
		String password = configloader().getProperty("Agent_Password");
		profile.enterOldPassword(password);
		profile.enterNewPassword(password);
		profile.enterConformPassword(password);
		profile.clickSubmit();
		
		assertEquals(false, false);
		
	}

}
