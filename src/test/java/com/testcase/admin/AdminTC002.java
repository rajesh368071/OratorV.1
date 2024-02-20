package com.testcase.admin;

import static org.testng.Assert.assertEquals;

import java.util.Map;

public class AdminTC002 extends AllScenario {
	
	public String verifyCreateNewUserPopUp(Map<Object, Object> map) throws InterruptedException {
		
		usermanagement.clickUserManagementMenu();
		usermanagement.clickNewUser();
		
		String firstname = fakedata.getFirstName();
		
		usermanagement.enterFirstName(firstname);
		usermanagement.enterLastName(fakedata.getLastname());
		usermanagement.enterEmail(fakedata.getEmail());
		usermanagement.selectRole(map.get("Role").toString());
		usermanagement.enterPhone(fakedata.getPhone());
		usermanagement.selectGroup(map.get("Group").toString());
		usermanagement.selectBusinessHours(map.get("Business_hours").toString());
		usermanagement.selectHolidayGroup(map.get("Holiday_group").toString());
		usermanagement.clickSubmit();
	
		assertEquals(ToastDisplayed("User Created"), true);
		
		return firstname;
	}
	
}
